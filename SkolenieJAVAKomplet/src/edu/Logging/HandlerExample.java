package edu.Logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HandlerExample {

	private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());
	
	public static void main(String[] args) {
		
		Handler consoleHandler = null;
		Handler fileHandler = null;
		//existuje este aj StreamHandler(publikuje logy do OutputStrem-u)
		// SocketHandler publikuje logy do sietoveho streamu
		//este je MemoryHandler, ktory dava logy do pamatoveho buffra, v pripade ze je plny tak prepisuje stare logy
		
		try{
			consoleHandler = new ConsoleHandler();
			fileHandler = new FileHandler("./logger.log");
			
			//pridanie handlerov objektu triedy logger
			logger.addHandler(consoleHandler);
			logger.addHandler(fileHandler);
			
			//metoda nastavi uroven logovania
			//spravy nizsej urovne budu ignorovane
			consoleHandler.setLevel(Level.ALL);
			
			fileHandler.setLevel(Level.ALL);
			logger.setLevel(Level.ALL);
			
			logger.config("Configuration done");
			
			logger.removeHandler(consoleHandler);
			logger.log(Level.FINE, "Finer logged");
		}catch(IOException e){
			logger.log(Level.SEVERE, "Error occur in FileHandler", e);
		}		
		logger.finer("Finest example on Logger handler completed.");
	}
}
