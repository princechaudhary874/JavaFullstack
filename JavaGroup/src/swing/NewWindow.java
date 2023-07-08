package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame =new JFrame();
	JLabel label= new JLabel();
	NewWindow(){
		
		
		label.setText("You have successfully opened the NewWindow!");
		label.setBounds(20, 20, 450, 50);
		label.setFont(new Font("UBUNTU",Font.PLAIN,20));
		label.setForeground(Color.CYAN);
		label.setOpaque(true);
		label.setBackground(Color.black);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(620, 420);
		frame.add(label);
		frame.setVisible(true);
	}
}
