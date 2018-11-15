package 테트리스;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class TetrisBoard extends JPanel {
	TetrisWindow tw;
	
	public TetrisBoard() {
		this.setPreferredSize(new Dimension(500, 650));
		this.setBackground(new Color(0xFF9FA1));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//테트리스 게임판 나타내기
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				g.setColor(Color.BLACK);
				g.drawRect(100+j*30, 20+i*30, 30, 30);
			}
		}
	}
}
