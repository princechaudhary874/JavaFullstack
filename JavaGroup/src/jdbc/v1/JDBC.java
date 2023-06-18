package jdbc.v1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

	public static void main(String[] args) {
		//Declaration
		final String DRIVER = "com.mysql.cj.jdbc.Driver";	
		final String HOST="sql12.freemysqlhosting.net";
	
		final String DBNAME = "sql12624803";
		final int PORT = 3306;//used for security 
		final String URL = "jdbc:mysql://"+HOST+":" +
		PORT + "/" +DBNAME ;
		final String DBUSER = "sql12624803";
		final String DBPASS = "6p9k3h3bWq";

		try {
			// connection
			Class.forName(DRIVER);//loading driver
			Connection conn=DriverManager.getConnection(URL,DBUSER,DBPASS);//connection
			conn.close();//close connection
			System.out.println("Connect with database successfully!");
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
