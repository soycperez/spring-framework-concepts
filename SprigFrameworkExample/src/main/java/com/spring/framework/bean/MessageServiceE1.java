package com.spring.framework.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
/*
 * La anotación @Service es un estereotipo para
 *  ayudarnos a saber si una clase es @Repository, @Controller,
 *   @Service que es equivalente a -> @Component
 *   */
@Service
public class MessageServiceE1 {
	private Map <String, String> messageMap;
	
	public MessageServiceE1() {
		messageMap = new HashMap<>();
	}
	
	public void addMessage(String key, String message) {
		messageMap.put(key, message); 
	}
	
	public String message(String key) {
		return messageMap.get(key);
	}
	
	public String key(String message) {
		for (String key : messageMap.keySet()) {
			if(messageMap.get(key).equals(message)) {
				return key; 
			}
		}
		return null;
	}
	
}
