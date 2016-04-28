package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectFromTB {

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
			System.out.println("Pripojenie k DB skola uspesne ...");
			
			stmt = conn.createStatement();
			String sql = "SELECT * FROM students";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int id = rs.getInt("id");
				String meno = rs.getString("meno");
				String priezvisko = rs.getString(3);
				int vek = rs.getInt(4);
				
				System.out.println(id + " | " + meno + " | " + priezvisko + " | " + vek);
			}
			System.out.println("Koniec vypisu ...");
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn != null)
					conn.close();
			}catch(SQLException se2){
				se2.printStackTrace();
			}
			try{
				if(stmt != null)
					stmt.close();
			}catch(SQLException se3){
				se3.printStackTrace();
			}
		}
		
		System.out.println("Koniec programu");

	}

}
