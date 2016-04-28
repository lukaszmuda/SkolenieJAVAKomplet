package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VyberDB {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/skola";
	
	static final String USER = "root";
	static final String PASS = "lukas";
	
	public static void main(String[] args) {

		Connection conn = null;
		try{
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Pripajam sa na DB student ...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Pripojenie k databaze uspesne ...");;
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
		}
		System.out.println("Koniec!");

	}

}
