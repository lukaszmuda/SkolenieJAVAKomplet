package edu.jdbc.ZamestnanecApp;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ZamestnanecDAO {

	private Connection conn;
	
	public ZamestnanecDAO()throws Exception{
		//nastavenia pre pracu s DB
		//z bezp. hladiska je lepsie ak su informacie ulozene
		//mimo zdrojoveho kodu
		Properties nastavenia = new Properties();
		
		nastavenia.load(new FileInputStream("demo.properties"));
		
		String user = nastavenia.getProperty("user");
		String password = nastavenia.getProperty("password");
		String dburl = nastavenia.getProperty("dburl");
		
		//pripojenie na DB
		conn = DriverManager.getConnection(dburl, user, password);
		System.out.println("Pripojenie na DB uspesne ...");
	}
	
	public List<Zamestnanec> getZamestnanci() throws Exception{
		
		List<Zamestnanec> zoznam = new ArrayList<Zamestnanec>();
		
		Statement stm = null;
		ResultSet rs = null;
		
		try{
			stm = conn.createStatement();
			rs = stm.executeQuery("SELECT * FROM zamestnanci");
			
			while(rs.next()){
				Zamestnanec zam = konvertujRiadokDoZamestnanca(rs);
				zoznam.add(zam);
			}
			return zoznam;
		}
		finally{
			close(stm,rs);
		}
		
	}
	
	public List<Zamestnanec> najdiZamestnanca(String priezvisko) throws Exception{
		List<Zamestnanec> zoznam = new ArrayList<>();
		
		PreparedStatement stm = null;
		ResultSet rs = null;
		
		try{
			priezvisko += "%";
			stm = conn.prepareStatement("SELECT * FROM zamestnanci WHERE priezvisko like ?");
			stm.setString(1, priezvisko);
			rs = stm.executeQuery();
			
			while(rs.next()){
				Zamestnanec zam = konvertujRiadokDoZamestnanca(rs);
				zoznam.add(zam);
				
			}
			return zoznam;
		}finally{
			close(stm,rs);
		}
	}
	
	private void close(Statement stm, ResultSet rs)throws SQLException {
		close(null,stm,rs);
		
	}
	
	private static void close(Connection conn, Statement stm, ResultSet rs)throws SQLException{
		if(conn != null){
			conn.close();
		}
		if(stm != null){
			stm.close();
		}
		if(rs != null){
			rs.close();
		}
	}

	private Zamestnanec konvertujRiadokDoZamestnanca(ResultSet rs) throws SQLException{
		
		int id = rs.getInt(1);
		String priezvisko = rs.getString(2);
		String meno = rs.getString(3);
		String email = rs.getString(4);
		BigDecimal plat = rs.getBigDecimal(6);
		
		Zamestnanec zam = new Zamestnanec(id,priezvisko,meno, email, plat);
				
		return zam;
	}
	
	public static void main(String[] args) throws Exception{
		ZamestnanecDAO dao = new ZamestnanecDAO();
		
		System.out.println(dao.najdiZamestnanca("thom"));
		
	}
}
