package com.companyname.prueba.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */

@Entity
@Table(name="reservas")
public class Reserva implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    
    @Column(name="nreservas")
    private Integer nreservas;
    @Column(name="pax")
    private Integer pax;
    @Column(name="hotel")
    private String hotel;
    @Column(name="mes")
    private String mes;
    @Column(name="precio")
    private Double precio;
    @Column(name="coste")
    private Double coste;
    
    public Reserva(){
    
    }    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNreservas() {
        return nreservas;
    }

    public void setNreservas(Integer nreservas) {
        this.nreservas = nreservas;
    }

    public Integer getPax() {
        return pax;
    }

    public void setPax(Integer pax) {
        this.pax = pax;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getCoste() {
        return coste;
    }

    public void setCoste(Double coste) {
        this.coste = coste;
    }
        
    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("Reserva nº: " + id + ".");
        buffer.append("En el hotel: " + hotel + ".");
        buffer.append("El mes: "+ mes +".");
        buffer.append("Nº de habitaciones: " + nreservas + ".");
        buffer.append("Nº de personas: " + pax + ".");
        buffer.append("Precio: " + precio + ".");
        buffer.append("Coste: " + coste + ".");
        return buffer.toString();
    }

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
}
