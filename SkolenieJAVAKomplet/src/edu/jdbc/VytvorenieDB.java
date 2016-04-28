package edu.jdbc;

//KROK 1. Importujeme potrebne balicky
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VytvorenieDB {
	//deklarujeme JDBC driver a url na DB
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost";
	
	//prihlasenie do DB
	static final String USER = "root";
	static final String PASS = "lukas";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try{
			//KROK 2. Registracia JDBC drivera
			Class.forName(JDBC_DRIVER);
			
			//KROK 3.Vytvorenie connection 
			System.out.println("Prihlasujem sa na databazu ...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			//KROK 4. Vykonanie dotazu
			System.out.println("Vytvaram databazu ...");
			stmt = conn.createStatement();
			String sql = "CREATE DATABASE skola";
			stmt.executeUpdate(sql);
			System.out.println("Databaza bola vytvorena uspesne ...");			
						
		}catch(SQLException se){
			//osetrenie chyb suvisiacich s JDBC
			se.printStackTrace();
		}catch(Exception e){
			//osetrenie chyb suvisiacich s Class.forName
			e.printStackTrace();
		}finally{
			//tu ukoncime vsetky zdroje ktore sme pouzili
			try{
				if(stmt != null)stmt.close();
			}catch(SQLException se2){
				se2.printStackTrace();
			}
			try{
				if(conn != null)conn.close();
			}catch(SQLException se3){
				se3.printStackTrace();
			}
		}
		System.out.println("Koniec programu!");

	}

}
