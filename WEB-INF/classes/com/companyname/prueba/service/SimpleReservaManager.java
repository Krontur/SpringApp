/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.companyname.prueba.service;

import com.companyname.prueba.domain.Reserva;
import com.companyname.prueba.repository.ReservaDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author alumno
 */
@Component
public class SimpleReservaManager implements ReservaManager{
    
    private static final long serialVersionUID = 1L;
    
    @Autowired
    private ReservaDao reservaDao;
    
    public void setReservaDao(ReservaDao reservaDao){
    	this.reservaDao = reservaDao;
    }
        
    public void addReservas(Reserva reserva){
        reservaDao.saveReserva(reserva);
    }
    
    public List<Reserva> getReservas() {
        return reservaDao.getReservaList();
    }
}
