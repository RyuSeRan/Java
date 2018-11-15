package 테트리스;

import java.awt.*;
import java.util.*;

import javax.swing.*;

public class TetrisBoard extends JPanel {
	TetrisWindow tw;
	
	public TetrisBoard() {
		this.setPreferredSize(new Dimension(500, 650));
		this.setBackground(new Color(0x8AAAFF));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Random r=new Random();
		//테트리스맵을 게임판에 나타내기
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if(tw.테트리스맵[i][j]>0) {
					g.setColor(new Color(tw.테트리스맵[i][j]));
					g.fillRect(100+j*30, 20+i*30, 30, 30);
				}
				//g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
				g.setColor(Color.BLACK);
				g.drawRect(100+j*30, 20+i*30, 30, 30);
			}
		}		
		//게임판위에 조각블록 얹히기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(tw.현재블록[i][j]>0) {
					g.setColor(new Color(tw.현재블록[i][j]));
					g.fillRect(100+(tw.현재블록등장위치x+j)*30, 20+(tw.현재블록등장위치y+i)*30, 30, 30);
				}
				g.setColor(new Color(0xFF9FA1));
				g.drawRect(100+(tw.현재블록등장위치x+j)*30, 20+(tw.현재블록등장위치y+i)*30, 30, 30);
			}
		}
	}
	
	void drawpanel() {
		
	}
	
}
