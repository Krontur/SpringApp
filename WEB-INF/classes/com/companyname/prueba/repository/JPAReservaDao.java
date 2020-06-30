package com.companyname.prueba.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.companyname.prueba.domain.Reserva;

@Repository (value="reservaDao")
public class JPAReservaDao implements ReservaDao{
	
	private EntityManager em = null;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em){
		this.em = em;
	}
	
	@Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Reserva> getReservaList() {
		return em.createQuery("select p from Reserva p order by p.id").getResultList();
	}
	
	@Transactional(readOnly = false)
	public void saveReserva(Reserva reserva) {
		em.merge(reserva);
				
	}

}
