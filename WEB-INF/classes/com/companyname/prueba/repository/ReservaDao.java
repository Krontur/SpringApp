package com.companyname.prueba.repository;

import java.util.List;

import com.companyname.prueba.domain.Reserva;

public interface ReservaDao {
	
	public List<Reserva> getReservaList();
	
	public void saveReserva(Reserva reserva);

}
