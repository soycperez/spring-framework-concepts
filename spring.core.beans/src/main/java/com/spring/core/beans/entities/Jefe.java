package com.spring.core.beans.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Jefe implements Empleado {
	@Autowired
	@Qualifier("informesApl2")
	private Informes informes;

	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return"Jefe:\n";
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Encargado de administrar el trabajo del proyecto";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Este informe fue creado por el Jefe: " + informes.getInforme();
	}

}
