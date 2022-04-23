package com.spring.core.beans.entities;

import org.springframework.stereotype.Component;

@Component
public class InformesApl1 implements Informes {

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe primer trimestre";
	}

}
