package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	//Child Class or SubClass =MyFrame
	//Parent class = JFrame
	//system built in method=ActionListener
	JButton button;
	JLabel label;
	MyFrame(){
		ImageIcon icon=new ImageIcon("thumbs.jpeg");
		ImageIcon icon2=new ImageIcon("smile.png");
		
		//create instance of Jlabel
		label=new JLabel();
		label.setIcon(icon2);
		label.setBounds(30, 100, 200, 200);
		label.setVisible(false);
		
		//create instance of JButton
		button =new JButton();
		button.setBounds(600, 500, 200, 200);
		button.setText("I Can");
		button.setFocusable(false);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setFont(new Font("Comic Sans",Font.BOLD,24));
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setIconTextGap(-24);
		//create border for button
		button.setBorder(BorderFactory.createEtchedBorder());
		/*set enabled or disabled button
		button.setEnabled(false);
		or want to run button once and then disable ,you shoud go to method of 
		activelistener
		*/
		//run actionlistener interface
		button.addActionListener(this);
		
		
		//set title of JFrame
		this.setTitle("JFrame Title shows here");
		//Close operation
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//Do nothing on clicking cross button
		//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//hide on close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sets width and height of a frame
		this.setSize(1400,855);
		//prevent from resizing
		this.setResizable(false);		
		// make frame visible
		this.setVisible(true);		
		//create image icon
		ImageIcon image=new ImageIcon("logo.jpeg");		
		//change image icon of JFrame
		this.setIconImage(image.getImage());		
		//change background color of the frame
		this.getContentPane().setBackground(Color.BLUE);
		
		//add JButton
		this.add(button);
		//add JButton
		this.add(label);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("Hello!");
			button.setEnabled(false);
			label.setVisible(true);
		}
		
	}

}
