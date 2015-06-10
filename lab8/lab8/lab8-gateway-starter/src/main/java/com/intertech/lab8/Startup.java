package com.intertech.lab8;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public class Startup {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/si-components.xml");
		
		MessageChannel channel = context.getBean("requestChannel", MessageChannel.class);
		Message<String> message = MessageBuilder.withPayload("Hello brave new world").build();
		channel.send(message);
		
		context.close();
	}
}
