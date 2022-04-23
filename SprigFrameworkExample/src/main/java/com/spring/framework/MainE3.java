package com.spring.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.framework.bean.MessageManagerE2;

public class MainE3 {

	public static void main(String[] args) {
		//Primer paso: Cargar el archivo de configuración En este caso un XML, crearlo en src/main/resourses.
		ApplicationContext context = new ClassPathXmlApplicationContext("Config3.xml");
		
    	//Segundo paso: Pedir bean al contenedor
		MessageManagerE2 manager = context.getBean(MessageManagerE2.class);
    	//Tercer paso: usar bean
		manager.addMessage("3", "tres");		
		System.out.println(manager.findMessage("3"));
		//Cuarto paso: Cerrar bean y contexto
    	((AbstractApplicationContext)context).close(); 	
    	
		
	}

}
