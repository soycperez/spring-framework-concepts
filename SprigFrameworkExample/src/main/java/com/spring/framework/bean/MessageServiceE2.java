package com.spring.framework.bean;

import java.util.HashMap;
import java.util.Map;
//Notar que no usamos @Service que equivale a @Component porque sera configura en ConfigE2.class
public class MessageServiceE2 {
	private Map <String, String> messageMap;
	
	public MessageServiceE2() {
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
