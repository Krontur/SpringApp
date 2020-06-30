package com.companyname.prueba.service;

import java.util.ArrayList;
import java.util.List;

import com.companyname.prueba.domain.Reserva;

public class ConsultaReserva extends SimpleReservaManager{

	private static final long serialVersionUID = 1L;
	
	private List<Reserva> reservasConsulta = new ArrayList<Reserva>();
	
	private String mes;
	
	public void addReservaConsulta(Reserva reserva){
		
		this.reservasConsulta.add(reserva);
	}
	
	public List<Reserva> getConsultaReserva(){
		return reservasConsulta;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
}
