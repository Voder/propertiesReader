/* 
 * Copyright (C) Volker Aufschild - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Volker Aufschild <mail@volker-aufschild.de>
 *
 */ 
package de.aufschild.samples.propertiesreader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * 
 * @author Volker Aufschild <mail@volker-aufschild.de>
 * 
 * created: 10.04.2014
 *
 */
public class Starter {

	static String CONFIGLOCATION = "classpath:applicationContext.xml";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(CONFIGLOCATION);
		
	}

}
