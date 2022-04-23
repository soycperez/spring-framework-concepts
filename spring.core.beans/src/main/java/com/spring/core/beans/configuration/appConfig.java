package com.spring.core.beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.spring.core.beans.entities.Jefe;

@Configuration
@ComponentScan(basePackages = {"com.spring.core"})
public class appConfig {
	/*@Bean
	public Informes informeBean() {
		Informes informesImpl = new InformesImpl(); 
		return informesImpl;
	}
	
	@Bean
	public Jefe jefeBean() {
		Jefe jefe = new Jefe(informeBean());
		//jefe.setInformes(informeBean());
		return jefe;
		
	}
	*/
	
}
