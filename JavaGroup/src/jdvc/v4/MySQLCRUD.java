package jdvc.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MySQLCRUD extends MySQLConnection implements CRUD {
	// connect():connection
	// close(connection)
	@Override
	public boolean insert(Person person) {
		boolean result = false;
		String sql = "INSERT INTO student VALUES(?,?,?)";
		try {
			Connection conn = connect();
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, person.getPID());
			pstat.setString(2, person.getName());
			pstat.setString(3, person.getAddress());
			pstat.executeUpdate();
			pstat.close();
			close(conn);
			result = true;
		} catch (Exception e) {
			System.out.println("error :" + e.getMessage());
		}

		return result;
	}

	@Override
	public Person search(int pid) {
		Person person = null;
		String sql = "SELECT * FROM student WHERE pid=?";
		
		try {
			Connection conn = connect();
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);// set PID
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				person = new Person();
				person.SetPID(rs.getInt("pid"));
				person.SetName(rs.getString("name"));
				person.SetAddress(rs.getString("address"));
			}
			pstat.close();
			rs.close();
			close(conn);
		} catch (Exception e) {
			System.out.println("error : " + e.getMessage());
		}
		return new Person();
	}

	@Override
	public boolean update(Person person) {
		boolean result = false;
		String sql = "UPDATE student SET name=?,address=? WHERE pid=?";
		try {
			Connection conn = connect();
			PreparedStatement pstat = conn.prepareStatement(sql);

			pstat.setString(1, person.getName());
			pstat.setString(2, person.getAddress());
			pstat.setInt(3, person.getPID());
			pstat.executeUpdate();
			pstat.close();
			close(conn);
			result = true;
		} catch (Exception e) {
			System.out.println("error :" + e.getMessage());
		}

		return result;
	}

	@Override
	public boolean delete(int pid) {
		boolean result = false;
		String sql = "DELETE FROM student WHERE pid=?";
		try {
			Connection conn = connect();
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);// set pid
			pstat.executeUpdate();
			
			pstat.close();
			close(conn);
			result=true;
		} catch (Exception e) {
		
			System.out.println("Error : " + e.getMessage());
			
		}
		return result;
	}

	@Override
	public Vector persons() {
		Vector allPersons=new Vector();
		String sql = "SELECT * FROM tbl_person";
		try {
			Connection conn = connect();
			PreparedStatement pstat=conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				Person person=new Person();
				person.SetPID(rs.getInt("pid"));
				person.SetName(rs.getString("name"));
				person.SetAddress(rs.getString("address"));
				allPersons.add(person);
			}
			pstat.close();
			close(conn);
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
		}
		return allPersons;
	}
}
