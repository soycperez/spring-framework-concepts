package com.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.core.beans.configuration.appConfig;
import com.spring.core.beans.entities.Director;
import com.spring.core.beans.entities.Empleado;
import com.spring.core.beans.entities.Jefe;
//import com.spring.framework.configuration.ConfigE1;

public class MainClass 
{
    public static void main( String[] args ){
    	
    	//Primer paso: Cargar el archivo de configuración. 
    	//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
    	ApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
    	//Segundo paso: Pedir bean al contenedor
    	Empleado Cesar = context.getBean("jefe",Empleado.class);
    	Empleado Alexis = context.getBean("secretario",Empleado.class);
    	
    	//Tercer paso: usar bean<
    	System.out.println(Cesar.getCargo());
    	System.out.println(Cesar.getTareas());
    	System.out.println(Cesar.getInformes());
    	
    	System.out.println(Alexis.getCargo());
    	System.out.println(Alexis.getTareas());
    	System.out.println(Alexis.getInformes());
       
    	//Cuarto paso: cerrar bean
    	//context.close();
    	((AbstractApplicationContext)context).close(); 	
       
    }
}
