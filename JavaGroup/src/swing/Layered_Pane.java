package swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

public class Layered_Pane {
	public static void main(String[] args) {
		//JLayeredPane=swing components that provides third dimension
		//             for positioning components               
		
		JFrame frame=new JFrame("LayeredPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		JLabel label1 = new JLabel();
		label1.setBounds(50, 50, 200, 200);
		label1.setOpaque(true);
		label1.setText("Hello");
		label1.setBackground(Color.red);
		
		JLabel label2 = new JLabel();
		label2.setBounds(75, 75, 200, 200);
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		
		JLabel label3 = new JLabel();
		label3.setBounds(100,100, 200, 200);
		label3.setOpaque(true);
		label3.setBackground(Color.green);
		
		JLabel label4 = new JLabel();
		label4.setBounds(125, 125, 200, 200);
		label4.setOpaque(true);
		label4.setBackground(Color.yellow);
		
		JLabel label5 = new JLabel();
		label5.setBounds(150,150, 200, 200);
		label5.setOpaque(true);
		label5.setBackground(Color.gray);
		
		
		
		JLayeredPane layeredPane=new JLayeredPane();
		layeredPane.setBounds(0, 0, 500,500);
		
		layeredPane.add(label1,JLayeredPane.DRAG_LAYER);
		layeredPane.add(label2,JLayeredPane.POPUP_LAYER);
		layeredPane.add(label3,JLayeredPane.MODAL_LAYER);
		layeredPane.add(label4,JLayeredPane.PALETTE_LAYER);
		layeredPane.add(label5,JLayeredPane.DEFAULT_LAYER);
		
		frame.add(layeredPane);
		frame.setVisible(true);
	}
}
