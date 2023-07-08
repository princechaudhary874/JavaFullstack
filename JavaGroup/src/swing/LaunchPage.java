package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("New Window");

	LaunchPage() {

		button.setBounds(160, 100, 120, 40);
		button.setBackground(Color.red);
		button.setFocusable(false);
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420, 420);
		frame.add(button);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			frame.dispose();//to run only one times NewWindow
			NewWindow window=new NewWindow();
		}
		
	}

}
