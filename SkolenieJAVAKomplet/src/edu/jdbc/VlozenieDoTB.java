package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class VlozenieDoTB {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/skola";
	
	static final String DB_USER = "root";
	static final String USER_PASS = "lukas";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pst = null;
		
		try{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, DB_USER, USER_PASS);
			
			stmt = conn.createStatement();
			String sql = "INSERT INTO students VALUES(1, 'Lukas', 'Zmuda', 30)";
			//stmt.executeUpdate(sql);
			System.out.println("Riadok 1.  vlozeny ...");
			String sql2 = "INSERT INTO students VALUES(2, 'Jozef', 'Mrkvicka', 24)";
			//stmt.executeUpdate(sql2);
			System.out.println("Riadok 2 . vlozeny ...");
			pst = conn.prepareStatement("INSERT INTO students VALUES(?, ?, ?, ?)");
			pst.setInt(1, 3);
			pst.setString(2, "Fero");
			pst.setString(3, "Mravec");
			pst.setInt(4, 55);
			pst.executeUpdate();
			
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn != null)
					conn.close();
			}catch(SQLException see){
				see.printStackTrace();
			}
			try{
				if(stmt != null)
					stmt.close();
			}catch(SQLException seee){
				seee.printStackTrace();
			}
		}

	}

}
