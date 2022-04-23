package com.spring.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.framework.bean.MessageManagerE2;
import com.spring.framework.configuration.ConfigE2;

public class MainE2 {

	public static void main(String[] args) {
		//Primer paso: Cargar el archivo de configuración.
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigE2.class);
    	//Segundo paso: Pedir bean al contenedor
		MessageManagerE2 manager = context.getBean("messageManagerBean", MessageManagerE2.class);
    	//Tercer paso: usar bean
    	manager.addMessage("2", "dos");
    	
    	System.out.println(manager.findMessage("2"));
    	//Cuarto paso: Cerrar bean y contexto
    	((AbstractApplicationContext)context).close(); 
	}

}
