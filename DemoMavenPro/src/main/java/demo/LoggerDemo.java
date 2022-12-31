package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {
	static Logger logger=LogManager.getLogger(LoggerDemo.class);
	
	public static void main(String[] args) {
		
		
		
		
		
		System.out.println("hello\n");
			
		String s="erwsrdtf";
		

		logger.trace("Trace Message!");
		logger.debug("Debug Message!");
		logger.info("Info Message!");
		logger.warn("Warn Message!");
		logger.error("Error Message!");
		logger.fatal("Fatal Message!");
		logger.info(s);
		
		
		
		System.out.println("hii");
	}

}
