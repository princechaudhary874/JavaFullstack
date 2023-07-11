package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrameTextField extends JFrame implements ActionListener{
	JTextField textField;
	JButton button;
	MyFrameTextField(){
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//creating button 
		button =new JButton("Submit");
		button.setBackground(Color.black);
		button.setForeground(Color.cyan);
		button.setFocusable(false);
		//run actionlistener interface
		button.addActionListener(this);
		
		//creating new textfield
	    textField=new JTextField();
		textField.setPreferredSize(new Dimension(450,30));
		textField.setFont(new Font("CONSOLAS",Font.ITALIC,16));
		textField.setForeground(Color.cyan);
		textField.setOpaque(true);
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("Enter your name..");
		textField.setEditable(true);
		
		this.add(button);
		this.add(textField);
		this.pack();//calling the setSize() or setBounds() methods
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Welcome "+textField.getText());
		}
	}

}
