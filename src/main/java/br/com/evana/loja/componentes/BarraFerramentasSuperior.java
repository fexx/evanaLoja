package br.com.evana.loja.componentes;

import javafx.scene.layout.StackPane;

public class BarraFerramentasSuperior extends StackPane{
	
	private static BarraFerramentasSuperior INSTANCE = null;
	
	private BarraFerramentasSuperior() {
		final String cssDefault = "-fx-border-color: black;-fx-border-insets: 5;-fx-border-width: 3;";
		configuracoesDefaultPvs();
		this.setStyle(cssDefault);
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
