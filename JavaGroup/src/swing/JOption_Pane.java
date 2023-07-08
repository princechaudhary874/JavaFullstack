package swing;

import javax.swing.JOptionPane;

public class JOption_Pane {
	public static void main(String[] args) {
		//JOptionPane= pop up a standard dialog box that prompts users for a value
		//             or informs them on something
		
		//JOptionPane.showMessageDialog(parent component, message,title ,message type);
		JOptionPane.showMessageDialog(null, "You can do anything !","Title : Plain_Message " ,JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is a information message format !","Title : Information_Message " ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is a question message format !","Title : Question_Message " ,JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is a warning message !","Title : Warning_Message " ,JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is a error message !","Title : Error_Message " ,JOptionPane.ERROR_MESSAGE);

	}
}
