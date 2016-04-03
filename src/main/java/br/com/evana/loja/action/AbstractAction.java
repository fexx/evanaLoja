package br.com.evana.loja.action;

import org.apache.log4j.Logger;

public abstract class AbstractAction {
	
	private Logger log = Logger.getLogger(AbstractAction.class); 

	protected abstract void action();
	
	protected void preAction(){}
	
	protected void posAction(){}
	
	protected void actionFailure(){}
	
	public void actionPerformed(){
		try {
			preAction();
			action();
			posAction();
		} catch (Exception ex) {
			actionFailure();
			log.error("Falha ao executar action: "+ex.getMessage());
			throw new RuntimeException(ex);
		}
	}
	
}
