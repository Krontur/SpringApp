/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.companyname.prueba.web;

import com.companyname.prueba.service.ReservaManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author alumno
 */
@Controller
public class ReservasController {
    
    
    @Autowired
    private ReservaManager reservaManager;
    
    @RequestMapping (value="/home.htm")
    public ModelAndView handlRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("reservas", this.reservaManager.getReservas());
        
        return new ModelAndView("home", "model", myModel);
        
    }

    public void setProductManager(ReservaManager reservaManager){
        this.reservaManager = reservaManager;
    }
    
}
