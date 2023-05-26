package org.example.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyComponent {
	private static final Logger log = LoggerFactory.getLogger(MyComponent.class);
	public void work() {
		try {
			log.debug("debug work");
			log.info("info work");
			log.warn("warn work");
			throw new RuntimeException("Oops work exception !");
		}
		catch (Exception e) {
			log.error("An work error occurred", e);
		}
	}
}
