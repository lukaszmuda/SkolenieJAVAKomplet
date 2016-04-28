package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VytvorenieTB {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/skola";
	
	static final String DB_USER = "root";
	static final String USER_PASS = "lukas";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, DB_USER, USER_PASS);
			
			stmt = conn.createStatement();
			String sql = "CREATE TABLE students" + 
						"(id INTEGER NOT NULL, " +
						"meno VARCHAR(255)," + 
						"priezvisko VARCHAR(255)," + 
						"vek INTEGER," + 
						"PRIMARY KEY (id))";
			stmt.executeUpdate(sql);
			System.out.println("Tabulka students vytvorena ...");
			
			String sql2 = "INSERT INTO students VALUES(1, 'Lukas', 'Zmuda', 30)";
			stmt.executeUpdate(sql2);
			System.out.println("Riadok 1.  vlozeny ...");
			String sql3 = "INSERT INTO students VALUES(2, 'Jozef', 'Mrkvicka', 24)";
			stmt.executeUpdate(sql3);
			System.out.println("Riadok 2 . vlozeny ...");
					
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn != null){
					conn.close();
				}
			}catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(stmt !=null)
					stmt.close();
			}catch(SQLException se2){
				se2.printStackTrace();
			}
		}

	}

}
