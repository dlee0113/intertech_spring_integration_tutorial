package com.intertech.lab8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/si-components.xml");

		// MessageChannel channel = context.getBean("requestChannel",
		// MessageChannel.class);
		// Message<String> message =
		// MessageBuilder.withPayload("Hello brave new world").build();
		// channel.send(message);

		PigLatinService service = context.getBean("latinService",
				PigLatinService.class);
		System.out.println(service.translate("Hello brave new world"));

		context.close();
	}
}
