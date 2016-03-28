package br.com.evana.loja.view;

import br.com.evana.loja.componentes.Botao;
import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class EstoqueView extends BorderPane{
	
	private HBox gradeBotoes = new HBox(10);
	
	public EstoqueView() {
		botoes();
		this.setTop(gradeBotoes);
		this.setStyle("-fx-background-color: #FFFFFF;");
		this.setPadding(new Insets(10, 10, 10, 10));
	}
	
	private void botoes(){
		Button btAdicionar = new Botao("Adicionar");
		btAdicionar.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_ADD));
		gradeBotoes.getChildren().add(btAdicionar);
	}
}
