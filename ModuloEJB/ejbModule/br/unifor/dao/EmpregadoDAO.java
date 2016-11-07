package br.unifor.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EmpregadoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	

}
