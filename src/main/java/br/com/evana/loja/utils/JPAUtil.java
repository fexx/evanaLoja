package br.com.evana.loja.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

public class JPAUtil {
	
	private static Logger logger = Logger.getLogger(JPAUtil.class);
	
	private static final String PERSISTENCE_UNIT_NAME = "evanaLojaUnit";
	private static EntityManagerFactory emf;
	
	static{
		try {
//			emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		} catch (Throwable ex) {
			logger.error("Não conseguiu carregar a eEntityManagerFactory: "+ex.getMessage());
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static EntityManager createEntityManager(){
		if(!emf.isOpen()){
			throw new RuntimeException("EntityManagerfactory está fechada!");
		}
		return emf.createEntityManager();
	}
	
	public static void closeEntityManagerFactory(){
		if(emf.isOpen()){
			emf.close();
		}
	}
}
