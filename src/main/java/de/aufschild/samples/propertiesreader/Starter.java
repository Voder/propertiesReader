/* 
 * Copyright (C) Volker Aufschild - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Volker Aufschild <mail@volker-aufschild.de>
 *
 */ 
package de.aufschild.samples.propertiesreader;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/** 
 * 
 * @author Volker Aufschild <mail@volker-aufschild.de>
 * 
 * created: 10.04.2014
 *
 */
@Configuration
@PropertySource("classpath:messages.properties")
public class Starter {

	static String CONFIGLOCATION = "classpath:applicationContext.xml";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(CONFIGLOCATION);
		
		MessageProvider provider = context.getBean(MessageProvider.class);
		Assert.notNull(provider);
		
		System.out.println("1: " + provider.getProp("1"));
		System.out.println("2: " + provider.getProp("2"));
		System.out.println("3: " + provider.getProp("3"));
		System.out.println("4: " + provider.getProp("4"));
		
		context.close();
	}

}
