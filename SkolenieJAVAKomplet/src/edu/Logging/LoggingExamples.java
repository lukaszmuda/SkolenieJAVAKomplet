package edu.Logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExamples {

	
	private static final Logger logger = Logger.getLogger(LoggingExamples.class.getName());
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		try{
			int c = a / b;
		}catch(Exception e){
			logger.log(Level.WARNING, "delenie nulou!!");
		}
		
	}

}
