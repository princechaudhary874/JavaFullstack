package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import jdbc.v3.CRUDV1;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CRUD1 extends JFrame implements ActionListener {
	JLabel lblPID, lblName, lblAddress;//create object of JLabel
	JTextField txtPID, txtName, txtAddress;//create object of JTextField
	JButton btnSave, btnClose;//create object of JButton

	public CRUD1() {
		setTitle("CRUD-1");//set frame title
		setSize(350, 350);//set frame size
		setResizable(false);
		lblPID = new JLabel("PID : ");//label PID
		lblPID.setBounds(20, 20, 70, 30);//(x,y,width,height)

		txtPID = new JTextField();//
		txtPID.setBounds(100, 20, 150, 30);

		lblName = new JLabel("NAME : ");
		lblName.setBounds(20, 60, 70, 30);

		txtName = new JTextField();
		txtName.setBounds(100, 60, 150, 30);

		lblAddress = new JLabel("ADDRESS : ");
		lblAddress.setBounds(20, 100, 70, 30);
		txtAddress = new JTextField();
		txtAddress.setBounds(100, 100, 150, 30);

		btnSave = new JButton("Save");//create save button
		btnSave.setBounds(40, 160, 100, 30);

		btnSave.addActionListener(this);
		btnClose = new JButton("Close");
		btnClose.setBounds(160, 160, 100, 30);
		btnClose.addActionListener(this);
		setLayout(null);
		add(lblPID);//shown PID in frame by using it
		add(txtPID);
		add(lblName);
		add(txtName);
		add(lblAddress);
		add(txtAddress);
		add(btnSave);
		add(btnClose);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnClose) {
			System.exit(0);
		} else if (ae.getSource() == btnSave) {
			int pid=Integer.parseInt(txtPID.getText());
			String name=txtName.getText();
			String address=txtAddress.getText();
			boolean result= new CRUDV1().insert(pid,name,address);
			if (result) {
				JOptionPane.showMessageDialog(this,"Save record successfully");
			} else {
				JOptionPane.showMessageDialog(this, "Error to save record");
			}

		}
	}

	public static void main(String[] args) {
		new CRUD1();// Use new while calling constructor
	}

}
