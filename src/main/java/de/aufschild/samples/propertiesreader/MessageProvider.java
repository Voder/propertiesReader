package de.aufschild.samples.propertiesreader;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProvider {

	@Autowired
	private Properties messages;

	public String getProp(String key) {
		String val = messages.getProperty(key);
		return val == null ? "<empty>" : val;
	}
	
	
}
