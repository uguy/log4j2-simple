package org.example;

import org.example.internal.MyComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		try {
			log.debug("debug msg");
			log.info("info msg");
			log.warn("warn msg");

			new MyComponent().work();

			throw new RuntimeException("Oops exception !");
		}
		catch (Exception e) {
			log.error("An error occurred", e);
		}
	}
}
