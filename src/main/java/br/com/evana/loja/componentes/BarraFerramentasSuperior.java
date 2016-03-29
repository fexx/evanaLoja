package br.com.evana.loja.componentes;

import javafx.scene.layout.StackPane;

public class BarraFerramentasSuperior extends StackPane{
	
	private static BarraFerramentasSuperior INSTANCE = null;
	
	private BarraFerramentasSuperior() {
		configuracoesDefaultPvs();
	}
	
	private void configuracoesDefaultPvs() {
		this.setPrefHeight(40);
		this.setMaxHeight(40);
		this.setMinHeight(40);
	}
	
	public static synchronized BarraFerramentasSuperior getInstance() {
		if(INSTANCE == null){
			INSTANCE = new BarraFerramentasSuperior();
		}
		return INSTANCE;
	}

}
