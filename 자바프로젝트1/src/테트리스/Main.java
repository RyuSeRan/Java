package 테트리스;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		TetrisWindow tw = new TetrisWindow();
		TetrisBoard tb = new TetrisBoard();
		tw.add(tb);
		
		tw.tb=tb;
		tb.tw=tw;
		
		Random r=new Random();
		tw.initialize();
		tw.drawTetrisBoard(r.nextInt(7), 3, 0);
		
		tw.repaint();
		tw.revalidate();
	}

}
