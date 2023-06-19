package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import global.Global;
import jdbc.v3.CRUDV1;

public class CRUD4 extends JFrame implements ActionListener {
	JLabel lblPID, lblName, lblAddress;//create object of JLabel
	JTextField txtPID, txtName, txtAddress;//create object of JTextField
	JButton btnSearch, btnClose,btnDelete;//create object of JButton

	public CRUD4() {
		setTitle("Search and Update Record");//set frame title
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

		btnSearch = new JButton("Search");//create search button
		btnSearch.setBounds(40, 160, 100, 30);
		btnSearch.addActionListener(this);
		
		btnDelete=new JButton("Delete");
		btnDelete.setBounds(160, 160, 100, 30);
		btnDelete.addActionListener(this);
		
		btnClose = new JButton("Close");
		btnClose.setBounds(100, 200, 100, 30);
		btnClose.addActionListener(this);
		setLayout(null);
		add(lblPID);//shown PID in frame by using it
		add(txtPID);
		add(lblName);
		add(txtName);
		add(lblAddress);
		add(txtAddress);
		add(btnSearch);
		add(btnDelete);
		add(btnClose);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnClose) {
			System.exit(0);
		} if (ae.getSource() == btnSearch) {
			int pid=Integer.parseInt(txtPID.getText());
			String name=txtName.getText();
			String address=txtAddress.getText();
			boolean result= new CRUDV1().search(pid);//check
			if (result) {
				txtName.setText(Global.name);//take name from prepared statement of database
				txtAddress.setText(Global.address);//take address from  prapare statement of database
				JOptionPane.showMessageDialog(this,"Search record successfully");
			} else {
				txtName.setText("");
				txtAddress.setText("");
			}
		}	
		if(ae.getSource()==btnDelete) {
			int pid=Integer.parseInt(txtPID.getText());
			String name=txtName.getText();
			String address=txtAddress.getText();
			boolean result= new CRUDV1().delete(pid);
			if(result) {
				JOptionPane.showMessageDialog(this,"Delete record successfully");
			} else {
				txtName.setText("");
				txtAddress.setText("");
			}
		}
		
	}

	public static void main(String[] args) {
		new CRUD4();// Use new while calling constructor
	}

}
