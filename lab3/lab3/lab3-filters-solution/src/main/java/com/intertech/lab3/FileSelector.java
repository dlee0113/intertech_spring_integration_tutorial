package com.intertech.lab3;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class FileSelector implements MessageSelector {

	public boolean accept(Message<?> message) {
		if (message.getPayload() instanceof File
				&& ((File) message.getPayload()).getName().startsWith("msg")) {
			return false;
		}
		return true;
	}

}
