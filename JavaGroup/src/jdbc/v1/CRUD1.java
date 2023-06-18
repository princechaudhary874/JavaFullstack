package jdbc.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD1 {

	final static String DRIVER = "com.mysql.cj.jdbc.Driver"; // jdbc driver
	final static String HOST = "localhost"; // host name
	final static String DBNAME = "fullstackjava"; // name of the database
	final static int PORT = 3306; // port number
	final static String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME; // url of the database
	final static String DBUSER = "root"; // user
	final static String DBPASS = "12345"; // password

	public static void insertRecord() throws SQLException {
		// Insert Record
		Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS); // connect with db
		Statement stat = conn.createStatement();

		String sql = "INSERT INTO student VALUES(33,'Ram Thapa','CSIT')";
		stat.executeUpdate(sql);
		System.out.println("Insertion successful!");

	}

	// delete record
	public static void deleteRecord() throws SQLException {
		Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS); // connect with db
		Statement stat = conn.createStatement();
		// delete Record
		String sql = "DELETE FROM student WHERE student_id=33";
		stat.executeUpdate(sql);
		System.out.println("Deletion successful!");

	}

	// search records
	public static void searchRecord() throws SQLException {
		Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS); // connect with db
		Statement stat = conn.createStatement();
		// search recored
		String sql = "SELECT * FROM student WHERE student_id=33"; // SQL query
		ResultSet rs = stat.executeQuery(sql); // Get all records from the table
		System.out.println("SID\tNAME\t\tCOURSE");
		while (rs.next()) { // return true while records are found
			System.out.println(
					rs.getInt("student_id") + "\t " + rs.getString("student_name") + "\t " + rs.getString("course"));

		}
		System.out.println("Search successful!");

	}

	// update records
	public static void updateRecord() throws SQLException {
		Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS); // connect with db
		Statement stat = conn.createStatement();
		// update the record
		String sql = "UPDATE student SET student_name='Prabesh', course='CSIT' where student_id=33";
		stat.executeUpdate(sql);
		System.out.println("Update successful!");

	}

	// display all the records
	public static void displayAll() {
		try {
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS); // connect with db
			Statement stat = conn.createStatement();

			String sql = "SELECT * FROM student"; // SQL query
			ResultSet rs = stat.executeQuery(sql); // Get all records from the table
			System.out.println("PID\tNAME\t\tADDRESS");
			System.out.println("-----\t-----\t\t-------");

			while (rs.next()) { // return true while records are found
				System.out.println(rs.getInt("student_id") + "\t " + rs.getString("student_name") + "\t "
						+ rs.getString("course"));

			}
			rs.close();
			stat.close();
			conn.close(); // close connection
			System.out.println("--------------------------------");
			System.out.println("Records displayed successfully!");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		try {
			Class.forName(DRIVER); // loading driver

			insertRecord();
			// displayAll();
			// updateRecord();
			// displayAll();
			// searchRecord();
			// deleteRecord();
			// displayAll();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}