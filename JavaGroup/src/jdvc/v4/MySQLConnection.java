package jdvc.v4;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	Connection conn;

	public Connection connect() {
		try {
			Class.forName(DBINFO.DRIVER);
			conn = DriverManager.getConnection(DBINFO.URL, DBINFO.DBUSER, DBINFO.USERPASS);
		} catch (Exception e) {
			System.out.println("error : " + e.getMessage());
		}
		return conn;
	}

	public Connection close(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println("error : " + e.getMessage());
		}
		return conn;
	}

}
