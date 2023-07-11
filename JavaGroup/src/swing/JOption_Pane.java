package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOption_Pane {
	public static void main(String[] args) {
		//JOptionPane= pop up a standard dialog box that prompts users for a value
		//             or informs them on something
		
		//-----show message------------------
		//JOptionPane.showMessageDialog(parent component, message,title ,message type);
		/*
		 * JOptionPane.showMessageDialog(null,
		 * "You can do anything !","Title : Plain_Message " ,JOptionPane.PLAIN_MESSAGE);
		 * JOptionPane.showMessageDialog(null,
		 * "This is a information message format !","Title : Information_Message "
		 * ,JOptionPane.INFORMATION_MESSAGE); JOptionPane.showMessageDialog(null,
		 * "This is a question message format !","Title : Question_Message "
		 * ,JOptionPane.QUESTION_MESSAGE); JOptionPane.showMessageDialog(null,
		 * "This is a warning message !","Title : Warning_Message "
		 * ,JOptionPane.WARNING_MESSAGE); JOptionPane.showMessageDialog(null,
		 * "This is a error message !","Title : Error_Message "
		 * ,JOptionPane.ERROR_MESSAGE);
		 */
		//trick your friends
		/*
		 * while(true) { JOptionPane.showMessageDialog(null,
		 * "Your computer is hacked","Title : Warning_Message "
		 * ,JOptionPane.WARNING_MESSAGE);
		 * 
		 * }
		 */
		
		//------confim message--------
		//JOptionPane.showConfirmDialog(parent components, message, title, optiontype)
		int answer=JOptionPane.showConfirmDialog(null, "Are you developer ?", "Title:confirm", JOptionPane.YES_NO_CANCEL_OPTION);
		
		
		//-------input dialog-------------------------
		/*
		 * String name=JOptionPane.showInputDialog(null, "What is your name ?",
		 * "Enter your name....."); System.out.println("Hello "+name);
		 */
		
		//-----show option--------------------------------
		//JOptionPane.showOptionDialog(Parent component, object message, title, optiontype,
		//                             message type, icon, options, initvalue)
		String[] response= {"You can","You must",
				"You should","None"
		};
		ImageIcon icon=new ImageIcon("logo.jpeg");
		JOptionPane.showOptionDialog(null, 
				"You are genius",
				"title",
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.PLAIN_MESSAGE,
				icon, 
				response,
				0);
	}
}
