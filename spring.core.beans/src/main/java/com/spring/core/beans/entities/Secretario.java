package com.spring.core.beans.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Secretario implements Empleado {

	@Autowired
	@Qualifier("informesApl3")
	private Informes informes; 
	
	
	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "\nSecretario: \n";
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Encargado de llevar los horarios del jefe\n";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el Secretario: " + informes.getInforme();
	}

}
