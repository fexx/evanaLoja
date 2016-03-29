package br.com.evana.loja.componentes;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class BarraFerramentasInferior extends StackPane{
	
	private static BarraFerramentasInferior INSTANCE = null;
	
	private BarraFerramentasInferior() {
		configuracoesDefaultPvs();
	}
	
	private void configuracoesDefaultPvs() {
		this.setPrefHeight(40);
		this.setMaxHeight(40);
		this.setMinHeight(40);
        
		BorderPane bp = new BorderPane();
		bp.setLeft(new Label("Nome: Fernando Evangelista"));
		this.getChildren().add(bp);
	}
	
	public static synchronized BarraFerramentasInferior getInstance() {
		if(INSTANCE == null){
			INSTANCE = new BarraFerramentasInferior();
		}
		return INSTANCE;
	}

}
