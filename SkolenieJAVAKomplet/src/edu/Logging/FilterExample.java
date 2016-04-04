package edu.Logging;

import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class FilterExample implements Filter{

	private static final Logger logger = Logger.getLogger(FilterExample.class.getName());
		
	public static void main(String[] args) {
		//nastavime filter FilterExample
		logger.setFilter(new FilterExample());
		//tato sprava sa bude ignorovat. lebo nepresla filtrom
		logger.severe("This is SEVERE message");
		
		//tento log sa publikuje lebo obsahuje slovo important
		logger.warning("This is important message");
	}

	//tato metoda vrati true iba ak log objekt obsahuje spravu
	//ktora obsahuje slovo important
	@Override
	public boolean isLoggable(LogRecord record) {
		if(record == null){
			return false;
		}
		String message = record.getMessage()==null? "":record.getMessage();
		
		if(message.contains("important")){
			return true;
		}
		return false;
	}

}
