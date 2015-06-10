package com.intertech.lab4;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.integration.support.MessageBuilder;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.MessageChannel;

public class Startup {

	@SuppressWarnings({ "resource", "unused" })
	// @SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/si-components.xml");
		while (true) {
		}
	}
}
