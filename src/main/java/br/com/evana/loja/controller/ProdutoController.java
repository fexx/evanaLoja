package br.com.evana.loja.controller;

import br.com.evana.loja.action.AbstractAction;
import br.com.evana.loja.action.TransactionalAction;
import br.com.evana.loja.model.Produto;

public class ProdutoController extends PersistenceController{

	public void salvar(){
		TransactionalAction persistenceCtxOwner = TransactionalAction.build().persistenceCtxOwner(ProdutoController.this);
		persistenceCtxOwner.addAction(new AbstractAction() {
			private Produto p;
			
			@Override
			protected void action() {
				p = new Produto();
				
				
			}
		});
	}
	
}
