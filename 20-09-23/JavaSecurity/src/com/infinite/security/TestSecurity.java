package com.infinite.security;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestSecurity {
	private static final Logger logger=Logger.getLogger(TestSecurity.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");

		final String secretKey = "pr321";
		String originalString = "narennaren";
		String encryptedString = JavaSecurity.encrypt(originalString, secretKey) ;
		String decryptedString = JavaSecurity.decrypt(encryptedString, secretKey) ;
		
		logger.info(originalString);
		logger.info(encryptedString);
		logger.info(decryptedString);
	}

}
