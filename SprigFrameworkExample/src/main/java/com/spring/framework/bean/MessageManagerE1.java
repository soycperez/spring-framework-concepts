package com.spring.framework.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageManagerE1 {
	//Inyeccion de dependencia mediante el metodo Set
	private MessageServiceE1 messageService1;
	private MessageServiceE1 messageService2;
	
	//@Autowired crea la conexión entre clases beans (@Beans o @Component)
	@Autowired
	public void setMessageService1(MessageServiceE1 messageService1) {
		this.messageService1 = messageService1;
	}
	
	@Autowired
	public void setMessageService2(MessageServiceE1 messageService2) {
		this.messageService2 = messageService2;
	}
	
	public void addMessage(String key, String message) {
		messageService1.addMessage(key, message);
	}
	
	public String findMessage(String key) {
		return messageService2.message(key);
	}

}
