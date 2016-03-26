package br.com.evana.loja.componentes;

import javafx.scene.control.Tab;

public class Aba extends Tab{

	public Aba(String titulo) {
		super(titulo);
		this.setClosable(false);
	}
	
}
