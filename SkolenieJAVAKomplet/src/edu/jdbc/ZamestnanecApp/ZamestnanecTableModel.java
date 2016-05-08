package edu.jdbc.ZamestnanecApp;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ZamestnanecTableModel extends AbstractTableModel {

	private static final int PRIEZVISKO_COL = 0;
	private static final int MENO_COL = 1;
	private static final int EMAIL_COL = 2;
	private static final int PLAT_COL = 3;
	
	private String[] menaStlpcov = {"Priezvisko", "Meno", "Email", "Plat"};
	
	private List<Zamestnanec> zamestnanci;
	
	public ZamestnanecTableModel(List<Zamestnanec> zam) {
		zamestnanci = zam;
	}
	
	@Override
	public int getRowCount() {
		return zamestnanci.size();
	}

	@Override
	public int getColumnCount() {
		return menaStlpcov.length;
	}
	
	@Override
	public String getColumnName(int col){
		return menaStlpcov[col];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Zamestnanec z = zamestnanci.get(rowIndex);
		switch(columnIndex){
		case PRIEZVISKO_COL:
			return z.getPriezvisko();
		case MENO_COL:
			return z.getMeno();
		case EMAIL_COL:
			return z.getEmail();
		case PLAT_COL:
			return z.getPlat();
		default:
			return z.getPriezvisko();
		}
	}

}
