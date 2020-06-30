/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.companyname.prueba.web;

import java.util.HashMap;
import java.util.Map;

import com.companyname.prueba.domain.Reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.companyname.prueba.service.ReservaManager;
import com.companyname.prueba.service.AddReserva;

/**
 *
 * @author oscar
 */
@Controller
@RequestMapping (value="formulario")
public class AddReservaController {
    
    @Autowired
    private ReservaManager reservaManager;
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView onSubmit(AddReserva addReserva) {
        Reserva nuevaReserva = new Reserva();
        nuevaReserva.setId(addReserva.getId());
        nuevaReserva.setHotel(addReserva.getHotel());
        nuevaReserva.setMes(addReserva.getMes().toLowerCase());
        nuevaReserva.setNreservas(addReserva.getNreservas());
        nuevaReserva.setPax(addReserva.getPax());
        nuevaReserva.setPrecio(addReserva.getPrecio());
        nuevaReserva.setCoste(addReserva.getCoste());
                
        reservaManager.addReservas(nuevaReserva);
        
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("reservas", this.reservaManager.getReservas());
        
        return new ModelAndView("home", "model", myModel);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    protected AddReserva formBackingObject(HttpServletRequest request)
 throws ServletException {
        AddReserva addReserva =  new AddReserva();
        addReserva.setId((reservaManager.getReservas()).size()+1);
        return addReserva;
    }

    public ReservaManager getReservaManager() {
        return reservaManager;
    }

    public void setReservaManager(ReservaManager reservaManager) {
        this.reservaManager = reservaManager;
    }
    
}
