package de.aufschild.samples.propertiesreader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MessageProvider {

	@Autowired
	private Environment env;

	public String getProp(String key) {
		String val = env.getProperty(key);
		return val == null ? "<empty>" : val;
	}
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}
	
	
}
