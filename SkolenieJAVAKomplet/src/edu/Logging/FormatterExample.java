package edu.Logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FormatterExample {

	private static final Logger logger = Logger.getLogger(FormatterExample.class.getName());	
	
	public static void main(String[] args) {
		
		Handler fileHandler = null;
		Formatter simpleFormatter = null;
		
		try{
			fileHandler = new FileHandler("./formatter.log");
			
			simpleFormatter = new SimpleFormatter();
			
			logger.addHandler(fileHandler);
			
			logger.info("FinnerstMessage: Logger with Default Formatter");
			
			fileHandler.setFormatter(simpleFormatter);
			
			fileHandler.setLevel(Level.ALL);
			logger.setLevel(Level.ALL);
			
			logger.finest("logger with simple formatter");
					
		}catch(IOException ex){
			logger.log(Level.SEVERE, "Error in FileHandler", ex);
		}
	}
}
