package jdbc.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import global.Global;

public class CRUDV1 extends MySQLConnection {
	public boolean insert(int pid, String name, String address) {
		boolean result = false;
		String sql = "INSERT INTO student VALUES(?,?,?)";//? for placeholder
		try {
			Connection conn = connect();// connect with db
			// Insert Record
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);// set PID
			pstat.setString(2, name);// set name
			pstat.setString(3, address);// set address
			pstat.executeUpdate();// Run the SQL statement
			pstat.close();// statement close
			close(conn);// Close connection
			result = true;
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return result;
	}

	public boolean search(int pid) {
		boolean result = false;
		String sql="SELECT * FROM student WHERE pid=?";
		try {
			Connection conn = connect();
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);// set PID
			ResultSet rs=pstat.executeQuery();
			while (rs.next()) {
				result=true;
				Global.pid=rs.getInt("pid");
				Global.name=rs.getString("name");
				Global.address=rs.getString("address");
			}
					pstat.close();
					rs.close();
					close(conn);
			
		}catch (Exception ex) {
			Global.pid=-1;
			ex.printStackTrace();
		}
		return result;
	}

	public void selectAll() {

	}
	
	public boolean update(int pid, String name, String address) {
		boolean result = false;
		return result;
	}

	public boolean delete(int pid) {
		boolean result = false;
		return result;
	}
}
