package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanel {

	public static void main(String[] args) {
		// Jpanel= a GUI component used as container to hold other

		ImageIcon image =new ImageIcon("can.jpeg");
		JLabel label=new JLabel();
		label.setText("I Can");
		label.setIcon(image);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setFont(new Font("UBUNTU",Font.PLAIN,20));
		label.setIconTextGap(-50);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 100, 100);
		
		//create instance of JLabel
		JPanel redPanel = new JPanel();
		//set background of redpanel
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 300, 250);
		//set Layout of redPanel which has same function as frame.setLayout();
		redPanel.setLayout(new BorderLayout());//sets position of text+icon of label
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(300, 0, 300, 250);
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 600, 300);
		
		//JFrame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 900);
		frame.setLayout(null);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.add(redPanel);//add redPanel components
		frame.add(bluePanel);//add bluePanel Components
		frame.add(greenPanel);//add greenPanel components
		redPanel.add(label);//add label components
		

	}
}
