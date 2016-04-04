package edu.Logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/*
 * -vieme vytvorit konfiguraciu loggeru pouzitim konfiguracneho suboru
 * -pomoze nam to v odstraneni konfiguracie z kodu
 * -toto ma na starosti LogManager
 */
public class ConfigurationExample {
	
	private static final LogManager logManager = LogManager.getLogManager();
	private static final Logger logger = Logger.getLogger("confLogger");
	//prikazy, ktore sa nachadzaju v statickom bloku sa vykonaju len raz
	//bez ohladu nato kolko objektov danej triedy sa vytvori
	static{
		try{
			logManager.readConfiguration(new FileInputStream("./logger.properties"));
		}catch(IOException ex){
			logger.log(Level.SEVERE, "Error in loading config", ex);
		}
	}

	public static void main(String[] args) {
		logger.fine("Fine Message logged");

	}

}
