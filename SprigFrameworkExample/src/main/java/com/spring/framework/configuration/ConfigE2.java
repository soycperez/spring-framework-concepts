package com.spring.framework.configuration;

//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;

import com.spring.framework.bean.MessageManagerE2;
import com.spring.framework.bean.MessageServiceE2;

@Configuration //Solo espeficiamos que tenemos una clase de configuración
public class ConfigE2 {
	/* Usamos la anotación @Bean para generar el objeto para inyectar.
	 * Recordar que MessageManager.class tiene como atributo private MessageServiceE2 messageService1;
	 * Por lo que haremos la inyección de dependencias por metodo set.
	 */
	@Bean
	public MessageServiceE2 messageServiceBean() {
		MessageServiceE2 messageService = new MessageServiceE2(); 
		return messageService;
	}
	
	@Bean//(name = "messageManagerBean") <- podemos usar la propiedad name para darle nombre a nuestro Bean, si no se toma en nombre del metodo.
	public MessageManagerE2 messageManagerBean() {
		MessageManagerE2 messaManager = new MessageManagerE2();
		//Hacemos la inyección de dependencia.
		messaManager.setMessageService1(messageServiceBean());
		messaManager.setMessageService2(messageServiceBean());
		/* Si comentas los setters, se dara la excepción NullPointerException, ya que no se ha hecho inyección de dependencia
		 * solo se han creado los objetos, pero no se han relacionado
		 */
		
		return messaManager;
	}
	
	

}
