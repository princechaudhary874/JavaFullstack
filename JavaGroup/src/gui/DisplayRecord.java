//to display the records in a table

package gui;

import java.awt.FlowLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DisplayRecord extends JFrame {

	JTable table;

	DefaultTableModel dtm; // add columns //add rows

	JScrollPane scrollPane;
	JButton btnExport;

	public DisplayRecord() {

		setTitle("RECORDS ON TABLE");

		setSize(500, 500);

		setResizable(true);

		setLayout(new FlowLayout());

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		table = new JTable();

		dtm = new DefaultTableModel();

		table.setModel(dtm);

		// table scroll bar -visible

		scrollPane = new JScrollPane(table);

		dtm.addColumn("Student ID");

		dtm.addColumn("Student name");

		dtm.addColumn("Address");

		// load driver

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connect with db

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentv3", "root", "12345");
			
			// Execute SQL Statement
			

			PreparedStatement pstat = conn.prepareStatement("SELECT * FROM student");

			ResultSet rs = pstat.executeQuery();
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("C:/Users/Dell/Desktop/java.csv"));
			fileWriter.write("pid,name,address");
			while (rs.next()) {

				// dtm.addRow(new Object[] { 1, "Ram", "CSIT" });

				dtm.addRow(

						new Object[] { rs.getInt("pid"), rs.getString("name"), rs.getString("address") });
				
				fileWriter.newLine();
				fileWriter.write(rs.getInt("pid") + "," + rs.getString("name") + "," + rs.getString("address"));
			}

			pstat.close();
			fileWriter.close();
			conn.close();

		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());

		}

		scrollPane.setBounds(20, 20, 500, 175);

		add(scrollPane);

		setVisible(true);

	}

	public static void main(String[] args) {

		new DisplayRecord();

	}

}
