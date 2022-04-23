package com.spring.framework.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //<--Especificamos que esta clase sera una clase de configuración.
@ComponentScan(basePackages = {"com.spring.framework.bean"}) //<-- @ComponentScan va de la mano con la anotación @Component para crear Bean's
public class ConfigE1 {
	
	//Aqui podemos utilizar @Bean como en Config2.class
	
}
