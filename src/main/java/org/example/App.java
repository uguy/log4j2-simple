package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main( String[] args )
    {
		log.info("main");
		for (int i = 0; i < 3; i++) {
			log.debug("msg {}", i);
		}
    }
}
