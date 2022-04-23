package com.spring.framework.bean;

//import org.springframework.beans.factory.annotation.Autowired;
//Notar que no usamos @Component, ya que sera configurado en ConfigE2.class
public class MessageManagerE2 {
	private MessageServiceE2 messageService1;
	private MessageServiceE2 messageService2;
	
	//@Autowired <- Notar que comentamos la anotación, porque se hare la inyeccion nmediante ConfigE2.class
	public void setMessageService1(MessageServiceE2 messageService1) {
		this.messageService1 = messageService1;
	}
	
	//@Autowired
	public void setMessageService2(MessageServiceE2 messageService2) {
		this.messageService2 = messageService2;
	}
	
	public void addMessage(String key, String message) {
		messageService1.addMessage(key, message);
	}
	
	public String findMessage(String key) {
		return messageService2.message(key);
	}

}
