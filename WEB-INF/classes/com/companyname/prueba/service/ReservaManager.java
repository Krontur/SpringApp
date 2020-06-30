package com.companyname.prueba.service;

import com.companyname.prueba.domain.Reserva;
import java.io.Serializable;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public interface ReservaManager extends Serializable{
    
    public void addReservas(Reserva reserva);
    
    public List<Reserva> getReservas();
    
}
