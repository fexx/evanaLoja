package br.com.evana.loja.componentes;

import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;

public class Aba extends Tab{

	public Aba(String titulo, ImageView img) {
		super(titulo);
		img.setFitHeight(40);
		img.setFitWidth(40);
		this.setGraphic(img);
		this.setClosable(false);
	}
	
}
