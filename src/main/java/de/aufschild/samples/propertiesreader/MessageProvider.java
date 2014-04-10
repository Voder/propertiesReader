package de.aufschild.samples.propertiesreader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MessageProvider {

	@Autowired
	private Environment env;
	@Value("${default}")
	private String defaultValue;
	
	public String getProp(String key) {
		String val = env.getProperty(key);
		return val == null ? defaultValue : val;
	}
	
	
}
