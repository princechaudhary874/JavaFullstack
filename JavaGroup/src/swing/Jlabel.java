package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Jlabel {
	public static void main(String[] args) {
		//JLabel = a GUI display area for string of text,image or both
		ImageIcon images =new ImageIcon("logo.jpeg");//create image
		//create instance of border
		Border border=BorderFactory.createLineBorder(Color.blue,3);
		
		JLabel label=new JLabel();//create a label
		label.setText("You can do anyting !");
		label.setIcon(images);//set image
		label.setHorizontalTextPosition(JLabel.CENTER);//set text left,right,center
		label.setVerticalTextPosition(JLabel.TOP);//set text top,bottom,center
		label.setForeground(Color.blue);//set text color
		label.setFont(new Font("UBUNTU",Font.PLAIN,20));//set text font ,size and style
		label.setIconTextGap(10);//set gap between icon and text
		//set background color
		label.setBackground(Color.black);
	    // To display the  background color
		label.setOpaque(true);//we need to set opaque to set background color
		label.setBorder(border);//set border of the JLabel
		
		//Alignment
		//set vertical position of text+icon within JLabel
		label.setVerticalAlignment(JLabel.CENTER);
		
		//set horizontal position of text+icon within JLabel
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//set bounds and positions of the JLabel
		//label.setBounds(100, 100, 300, 450);
		
		JFrame frame =new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(800, 605);
		frame.setResizable(true);
		frame.setIconImage(images.getImage());
		//frame.setLayout(null);//set layout of the JFrame
		frame.setVisible(true);
		frame.add(label);//add component
		frame.pack();
		/*frame.pack():It is the pack method of frame used to adjust
		 *the label to the frame.It must be written after frame.add(label).
		 * It can do the tasks of:
		 *-- label.setBounds(100, 100, 300, 450);
		 *-- frame.setLayout(null);
		 *--
		 *so, in order to use we have to comment these three methods  
		 */
	}
}
