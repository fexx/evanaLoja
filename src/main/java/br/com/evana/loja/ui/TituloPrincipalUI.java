package br.com.evana.loja.ui;

import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class TituloPrincipalUI extends StackPane{

	public TituloPrincipalUI(Text titulo) {
		this.getStyleClass().add("border");
		this.setMinHeight(40);
		
		BorderPane bpTituloTela = new BorderPane();
		bpTituloTela.setPadding(new Insets(10, 10, 10, 10));
		StackPane.setMargin(this, new Insets(10, 10, 10, 10));
		bpTituloTela.setLeft(titulo);
		this.getChildren().add(bpTituloTela);
	}
}
