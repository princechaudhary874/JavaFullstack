package swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_Layout {
	public static void main(String[] args) {
		// Layout Manager=Defines the natural components in a container
		//GridLayout=     Places components in a grid of cells,
		//                Each components take all available space within the cells
		//                and each cell is of same size
		
		//creating JFrame
		JFrame frame =new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3,10,10));//Grid Layout(row,column,horizontalGap,verticalGap)
		
		//creating JButtons
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.setVisible(true);
	}
}
