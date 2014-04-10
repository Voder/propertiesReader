package de.aufschild.samples.propertiesreader;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageProvider {

	@Autowired
	private Properties messages;
	@Value("default")
	private String defaultValue;
	
	public String getProp(String key) {
		String val = messages.getProperty(key);
		return val == null ? defaultValue : val;
	}
	
	
}
