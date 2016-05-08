package edu.jdbc.ZamestnanecApp;

import java.math.BigDecimal;

public class Zamestnanec {

	private int id;
	private String priezvisko;
	private String meno;
	private String email;
	private BigDecimal plat;
	
	public Zamestnanec(int id, String priezvisko, String meno, String email,
			BigDecimal plat) {
		super();
		this.id = id;
		this.priezvisko = priezvisko;
		this.meno = meno;
		this.email = email;
		this.plat = plat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPriezvisko() {
		return priezvisko;
	}

	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getPlat() {
		return plat;
	}

	public void setPlat(BigDecimal plat) {
		this.plat = plat;
	}
	
	
	
	
}
