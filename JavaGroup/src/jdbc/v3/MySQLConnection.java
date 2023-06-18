package jdbc.v3;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	Connection conn;

	public Connection connect() {
		try {
			Class.forName(DBINFO.DRIVER);//load driver
			conn=DriverManager.getConnection(DBINFO.URL, DBINFO.DBUSER,DBINFO.USERPASS);

		} catch (Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return conn;
	}
	public void close(Connection conn) {
		try {
			
		} catch (Exception e) {
			
		}
	}
}
