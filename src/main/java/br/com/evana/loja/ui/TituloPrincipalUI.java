package br.com.evana.loja.ui;

import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
	
	public static Text fomatFonteTela(String texto) {
		Text t = new Text();
		t.setCache(true);
		t.setX(10.0f);
		t.setY(270.0f);
		t.setFill(Color.web("#00acbe"));
		t.setText(texto);
		t.setFont(Font.font(null, FontWeight.BOLD, 32));
		return t;
	}
}
