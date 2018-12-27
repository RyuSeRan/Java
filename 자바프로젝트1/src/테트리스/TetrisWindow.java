package 테트리스;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TetrisWindow extends JFrame implements ActionListener, KeyListener, Runnable {
	TetrisBoard tb;
	
	String[] 버튼제목 = { "게임시작", "블록교체", "블록회전", "게임종료" };
	JButton[] 명령버튼 = new JButton[4];
	JLabel 기록레이블;
	Random r = new Random();
	
	//3단계
	int[] 색상;
	int[][] 테트리스맵=new int[20][10];		//		 ┌	  블록       ┐
	int[][][] 모든블록;					//[블록갯수][가로][세로]
	int[][] 현재블록;
	int 블록번호, 현재블록등장위치x, 현재블록등장위치y;
	int 현재블록최초위치x, 현재블록최초위치y;
	
	//4단계
	int minX, minY, maxX, maxY;
	boolean 바닥인가, 게임중;
	int score=0;
	Thread playThread;
	
	public TetrisWindow() {
		this.setTitle("혜리의 테트리스");
		this.setSize(500, 720);
		this.getContentPane().setBackground(new Color(0xFFC892));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);

		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JPanel firstPanel = new JPanel();
		firstPanel.setPreferredSize(new Dimension(500, 40));
		firstPanel.setBackground(new Color(0xFF9FA1));
		firstPanel.setOpaque(true);
		this.add(firstPanel);
		
		for (int i = 0; i < 명령버튼.length; i++) {
			명령버튼[i]=new JButton(버튼제목[i]);
			firstPanel.add(명령버튼[i]);
		}
		
		기록레이블=new JLabel("0점", JLabel.CENTER);
		기록레이블.setPreferredSize(new Dimension(60, 25));
		기록레이블.setBackground(new Color(0xADFF9F));
		기록레이블.setOpaque(true);
		firstPanel.add(기록레이블);
		
		//명령버튼에 이벤트 처리
		for (int i = 0; i < 명령버튼.length; i++) {
			this.명령버튼[i].addActionListener(this);
		}
		
		//화면 그래픽 갱신
		this.repaint();
		this.revalidate();
	}

	void initialize() {
		//7개 블록조각에 넣을 색상을 정한다.
		색상=new int[] { 0xFFD3FF, 0xFFC499, 0xFF999B, 0x99FFAA, 0xFCFF99, 0xC499FF, 0x99FCFF };
		
		//7개 블록조각을 만든다.
		this.모든블록=new int[][][] {
			{
				{색상[0],0,0,0},
				{색상[0],0,0,0},
				{색상[0],0,0,0},
				{색상[0],0,0,0}
			},
			{
				{0,0,0,0},
				{0,0,0,0},
				{색상[1],0,0,0},
				{색상[1],색상[1],색상[1],0}
			},
			{
				{0,0,0,0},
				{색상[2],0,0,0},
				{색상[2],0,0,0},
				{색상[2],색상[2],0,0}
			},
			{
				{0,0,0,0},
				{0,0,0,0},
				{색상[3],색상[3],0,0},
				{색상[3],색상[3],0,0}
			},
			{
				{0,0,0,0},
				{색상[4],0,0,0},
				{색상[4],색상[4],0,0},
				{색상[4],0,0,0}
			},
			{
				{0,0,0,0},
				{색상[5],0,0,0},
				{색상[5],색상[5],0,0},
				{0,색상[5],0,0}
			},
			{
				{0,0,0,0},
				{0,0,0,0},
				{색상[6],색상[6],0,0},
				{0,색상[6],색상[6],0}
			}
		};
		
		//테트리스 게임판을 초기화한다.
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				this.테트리스맵[i][j]=0;
			}
		}
		
		//게임을 위한 변수 초기화한다.
		this.블록번호=r.nextInt(7);
		this.현재블록=모든블록[블록번호].clone();
		this.현재블록등장위치x=현재블록최초위치x=3;
		this.현재블록등장위치y=현재블록최초위치y=0;
		
	}
	
	void drawTetrisBoard(int 블록번호, int x, int y) {
		this.블록번호=블록번호;
		this.현재블록=this.모든블록[this.블록번호].clone();
		this.현재블록등장위치x=x;
		this.현재블록등장위치y=y;
		
		tb.repaint();
		tb.revalidate();
	}
	
	void moveTetrisBlock(int x, int y) {
		this.현재블록등장위치x+=x;
		this.현재블록등장위치y+=y;

		//현재블록의 내부 조각의 범위를 알아낸다.
		getminXminYmaxXmaxY(현재블록);
		
		//현재블록이 테트리스맵의 범위를 벗어나지 않도록 한다.
		if(haveBlockTrubles(현재블록)==true) {
			this.현재블록등장위치x-=x;
			this.현재블록등장위치y-=y;
		}
		
		//바닥인지 검사한다.
		this.바닥인가=isBottom();
		
		tb.repaint();
		tb.revalidate();
	}
	
	boolean isBottom() {
		if(this.현재블록등장위치y+this.maxY>=19)	return true;
		
		for (int i = maxY; i >= minY; i--) {
			for (int j = minX; j <= maxX; j++) {
				if (현재블록[i][j]>0) {
					if(테트리스맵[현재블록등장위치y+i+1][현재블록등장위치x+j]>0 && 현재블록[i][j]>0) {
						return true;
					}
				}
			}
		}

		return false;
	}
	
	boolean haveBlockTrubles(int[][] 지금블록) {
		getminXminYmaxXmaxY(지금블록);
		
		if(현재블록등장위치x+maxX>9) return true;
		if(현재블록등장위치x<0) return true;
		if(현재블록등장위치y+maxY>19) return true;
		
		for (int i = minY; i <= maxY; i++) {
			for (int j = minX; j <= maxX; j++) {
				if (현재블록[i][j]>0) {
					if(테트리스맵[현재블록등장위치y+i][현재블록등장위치x+j]>0 && 현재블록[i][j]>0) {
						return true;
					}
				}
			}
		}

		
		return false;
	}
	
	void rotateTetrisBlock() {
		//현재블록을 회전한다.
		int[][] 회전블록  = new int[4][4];
		for (int i = 0; i < 현재블록.length; i++)
			for (int j = 0; j < 현재블록.length; j++)
				회전블록[j][(현재블록.length-1)-i]=현재블록[i][j];
		
		//블록 내부 조각의 존재 범위를 알아낸다.
		getminXminYmaxXmaxY(회전블록);
		
		//좌측 하단으로 붙인다.
		int 좌측이동칸수=minX;
		int 하단이동칸수=3-maxY;
		for (int i = maxY; i >= minY; i--) {
			for (int j = minX; j <= maxX; j++) {
				int 값=회전블록[i][j];
				회전블록[i][j]=0;
				회전블록[i+하단이동칸수][j-좌측이동칸수]=값;
			}
		}
		
		if(haveBlockTrubles(회전블록)==false)
			현재블록=회전블록;
		
		//블록 내부 조각의 존재 범위를 알아낸다.
		getminXminYmaxXmaxY(회전블록);
		
		tb.repaint();
		tb.revalidate();
	}
	
	void getminXminYmaxXmaxY(int[][] 지금블록) {
		minX=minY=9999;
		maxX=maxY=0;
		for (int i = 0; i < 지금블록.length; i++)
			for (int j = 0; j < 지금블록.length; j++)
				if(지금블록[i][j]>0) {
					minX=Math.min(minX, j);
					maxX=Math.max(maxX, j);
					minY=Math.min(minY, i);
					maxY=Math.max(maxY, i);					
				}
	}

	void recordInTetrisMap() {
		for (int i = 0; i < 현재블록.length; i++) {
			for (int j = 0; j < 현재블록.length; j++) {
				if(현재블록[i][j]>0) {
					테트리스맵[현재블록등장위치y+i][현재블록등장위치x+j]=현재블록[i][j];
				}
			}
		}
	}
	
	void removeFullLines() {
		for (int i = 19; i >= 0; i--) {
			//현재 (i)행에 블록의 갯수를 모두 센다.
			int cnt = 0;
			for (int j = 0; j < 10; j++) {
				if(테트리스맵[i][j]>0)	cnt++;
			}
			
			if(cnt<10)	continue;
			
			//블록을 제거한다.
			for (int j = i; j > 0; j--) {
				for (int k = 0; k < 10; k++) {
					테트리스맵[j][k]=테트리스맵[j-1][k];
					테트리스맵[j-1][k]=0;
				}
			}
			
			//점수를 10점 추가한다.
			score+=10;
			this.기록레이블.setText(score+"점");
		
			//
			i++;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb=(JButton)e.getSource();
		if (jb.getText().equals("게임시작")) {
			initialize();
			//자동낙하 스레드 생성하고 작동시킨다.
			게임중=true;
			playThread = new Thread((Runnable)this);
			playThread.start();
			
			try {
				this.removeKeyListener(this);
			} catch (Exception e1) { }
			
			this.addKeyListener(this);
			this.requestFocus();
		}
		else if (jb.getText().equals("블록교체")) {
			this.블록번호=r.nextInt(7);
			drawTetrisBoard(this.블록번호, this.현재블록등장위치x, this.현재블록등장위치y);
			this.requestFocus();
		}
		else if (jb.getText().equals("블록회전")) {
			rotateTetrisBlock();
			this.requestFocus();
		}
		else if (jb.getText().equals("게임종료")) {
			게임중=false;
			while (playThread.isAlive()) {
				playThread.interrupt();
				
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent key) {
		switch (key.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			moveTetrisBlock(-1,0);
			break;
		case KeyEvent.VK_RIGHT:
			moveTetrisBlock(1,0);
			break;
		case KeyEvent.VK_UP:
			rotateTetrisBlock();
			break;
		case KeyEvent.VK_DOWN:
			moveTetrisBlock(0,1);
			break;
		case KeyEvent.VK_SPACE:
			//바닥에 도달할 때까지 내려간다.
			바닥인가=false;
			while(바닥인가==false) {
				moveTetrisBlock(0, 1);
			}
			
			//현재블록을 테트리스맵에 기록한다.
			recordInTetrisMap();
			
			//모두 채워진 줄을 제거한다.
			removeFullLines();
			
			게임중=isNotEnd((블록번호+1)%7);
			if(게임중==false) {
				JOptionPane.showMessageDialog(null, "게임 종료", "게임 종료", JOptionPane.INFORMATION_MESSAGE);
				tb.repaint();
				tb.revalidate();
				return;
			}
			
			//새로운 블록을 등장시킨다.
			drawTetrisBoard(r.nextInt(7), 3, 0);
			
			break;
		}
	}
	
	public void keyReleased(KeyEvent arg0) {
		
	}
	
	public void keyTyped(KeyEvent arg0) {
		
	}
	
	public void run() {
		while (게임중) {
			try {
				if(isBottom()) {
					//바닥처리
					recordInTetrisMap();
					removeFullLines();
					
					//새로운 블록 등장하는 부분
					게임중=isNotEnd((블록번호+1)%7);
					if(게임중==false) {
						JOptionPane.showMessageDialog(null, "게임 종료", "게임 종료", JOptionPane.INFORMATION_MESSAGE);
					}
					drawTetrisBoard(r.nextInt(7), 3, 0);
				}
				else {
					//계속 낙하
					moveTetrisBlock(0, 1);
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {	}
		}
	}

	private boolean isNotEnd(int nextBlockNumber) {
		int[][] 다음블록 = this.모든블록[nextBlockNumber].clone();
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (다음블록[i][j]>0 && this.테트리스맵[현재블록최초위치y+i][현재블록최초위치x+j]>0) {
					return false;
				}
			}
		}
		return true;
	}

}
