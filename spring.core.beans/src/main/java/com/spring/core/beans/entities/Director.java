package com.spring.core.beans.entities;

import org.springframework.stereotype.Component;

@Component
public class Director implements Empleado {

	@Override
	public String getCargo() {		
		return "Director: \n";
	}

	@Override
	public String getTareas() {
		return "Encargado de llevar la dirección de proyectos \n";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return null;
	}

}
