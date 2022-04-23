package com.spring.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.framework.bean.MessageManagerE1;
import com.spring.framework.configuration.ConfigE1;

public class MainE1 {
	
    public static void main( String[] args ){
    	
    	//Primer paso: Cargar el archivo de configuración. 
    	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigE1.class);
    	
    	//Segundo paso: Pedir bean al contenedor
    	MessageManagerE1 manager = context.getBean(MessageManagerE1.class);
    	
    	//Tercer paso: usar bean
    	manager.addMessage("1", "uno");
    	System.out.println(manager.findMessage("1"));
    	
    	//Cuarto paso: Cerrar bean y contexto
    	((AbstractApplicationContext)context).close(); 	
    	
    }
}
