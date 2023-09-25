package com.rays.log4j;

import org.apache.log4j.Logger;

public class TestLog4j {
	
	public static void main(String[] args) {

		Logger log = Logger.getLogger(TestLog4j.class);

		log.debug("This is Debug...!!");
		log.info("This is Info...!!");
		log.warn("This is Warn...!!");
		log.error("This is Error...!!");
		log.fatal("This is Fatal...!!");

		try {

			int i = 0;

			int c = 5 / i;

			System.out.println("Division = " + c);

		} catch (RuntimeException e) {

			log.info("Arithmetic Error", e);

		}

	}
	
	
	

}
