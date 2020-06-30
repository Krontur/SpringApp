package com.companyname.prueba.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.prueba.domain.Reserva;
import com.companyname.prueba.service.ConsultaReserva;
import com.companyname.prueba.service.ReservaManager;



@Controller
public class ConsultaController{

    private ArrayList<Reserva> consultaReserva = new ArrayList<Reserva>();
    
    @Autowired
    private ReservaManager reservaManager;
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView onSubmit(ConsultaReserva consultaReserva) {
        
    	this.consultaReserva.clear();
    	
        List<Reserva> reservasConsulta = reservaManager.getReservas();
        for(Reserva reserva : reservasConsulta){
        	if(reserva.getMes().equals(consultaReserva.getMes())){
        		this.consultaReserva.add(reserva);
        	}
        }
        
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("reservas", this.consultaReserva);
        
        return new ModelAndView("consultasuccess", "model", myModel);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    protected ConsultaReserva formBackingObject(HttpServletRequest request)
 throws ServletException {
        ConsultaReserva consultaReserva =  new ConsultaReserva();
        return consultaReserva;
    }
	
}
