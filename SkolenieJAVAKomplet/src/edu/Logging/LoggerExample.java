package edu.Logging;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * logging levels
 * --------------
 * -SEVERE (najvyssi level)
 * -WARNING
 * -INFO
 * -CONFIG
 * -FINE
 * -FINER
 * -FINEST (najnizsi level)
 */
public class LoggerExample {	
	
	//vytvorenie Loggera s nazvom triedy v ktorej sa nachadza
	private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());
	
	public static void main(String[] args) {
		
		//metoda urcena pre loggovanie info. spravy, ak je logger zapnuty pre INFO spravy, inak sa ignoruje
		logger.info("Logger name: " + logger.getName());
		
		logger.warning("Can cause ArrayIndexOutOfBoundsException");
		
		int[] a = {1,2,3};
		int index = 4;		
		
		logger.config("index is set to " + index);
		try{
			System.out.println(a[index]);
		}catch(ArrayIndexOutOfBoundsException ex){
			logger.log(Level.SEVERE, "Exception occur", ex);
		}
	}
}
