package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_Layout {
	public static void main(String[] args) {
		// Layout Manager=Defines the natural layout for components within a container
		//3 layout manager
		//Border_Layout=A  Border_Layout places components in five areas:NORHT, EAST, SOUTH, WEST,, CENTER
		//             All extra spaces is placed within the center
		JFrame frame=new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
		//create JPanel
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		//set background for JPanel
		panel1.setBackground(Color.BLUE);
		panel2.setBackground(Color.red);
		panel3.setBackground(Color.cyan);
		panel4.setBackground(Color.green);
		panel5.setBackground(Color.orange);
		
		
		//set dimension of JPanel
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));

		//adding panel with border layout
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel3,BorderLayout.CENTER);
		frame.add(panel5,BorderLayout.EAST);

		
	
	}
}
