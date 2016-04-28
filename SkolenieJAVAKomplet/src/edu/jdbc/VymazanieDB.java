package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VymazanieDB {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/";
	
	static final String USER = "root";
	static final String PASS = "lukas";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try{
			Class.forName(JDBC_DRIVER);
			System.out.println("Vytvaram spojenie ...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Pripojenie uspesne ...");
			
			System.out.println("Vymazavam databazu skola ...");
			stmt = conn.createStatement();
			
			String sql = "DROP DATABASE skola";
			stmt.executeUpdate(sql);
			System.out.println("Databaza bola uspesne vymazana ...");
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
		System.out.println("Koniec programu!");

	}

}
