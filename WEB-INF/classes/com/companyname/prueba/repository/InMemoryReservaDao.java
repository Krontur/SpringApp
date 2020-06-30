package com.companyname.prueba.repository;

import java.util.List;

import com.companyname.prueba.domain.Reserva;

public class InMemoryReservaDao implements ReservaDao{
	
	private List<Reserva> reservaList;
	
	public InMemoryReservaDao(List<Reserva> reservaList){
		this.reservaList=reservaList;
	}

	public List<Reserva> getReservaList() {
		// TODO Auto-generated method stub
		return reservaList;
	}

	public void saveReserva(Reserva reserva) {
		
	}
}
