package br.com.evana.loja.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.apache.log4j.Logger;

import br.com.evana.loja.action.AbstractController;
import br.com.evana.loja.model.Produto;
import br.com.evana.loja.utils.JPAUtil;

public class PersistenceController extends AbstractController{
	
	private Logger logger = Logger.getLogger(PersistenceController.class);
	private EntityManager persistenceContext;
	private boolean ownsPersistenceContext;
	
	public PersistenceController() {
	}
	
	//mudar public para protected
	public void loadPersistenceContext(){
		loadPersistenceContext(null);
		
//		 EntityTransaction tx = persistenceContext.getTransaction();
//		 Produto produto = new Produto();
//		 produto.setNome("Saia longa");
//	        try {
//	            tx.begin();
//	            persistenceContext.persist(produto);
//	            tx.commit();
//	        } catch (Exception ex) {
//	            if (tx.isActive()) {
//	                tx.rollback();
//	            }
//	            throw new RuntimeException(ex);
//	        }
	}
	
	protected void loadPersistenceContext(EntityManager persistenceContext){
		if(persistenceContext == null){
			logger.debug("Criando um contexto de persistencia (Entutymanager).");
			this.persistenceContext = JPAUtil.createEntityManager();
			this.ownsPersistenceContext = true;
		}else{
			logger.debug("Utilizando contexto de persistencia (EntityManager) existente.");
			this.persistenceContext = persistenceContext;
			this.ownsPersistenceContext = false;
		}
	}
	
	 public EntityManager getPersistenceContext() {
	        return this.persistenceContext;
	    }

}
