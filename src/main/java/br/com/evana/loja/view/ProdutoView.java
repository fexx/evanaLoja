package br.com.evana.loja.view;

import br.com.evana.loja.componentes.Botao;
import br.com.evana.loja.controller.PersistenceController;
import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class ProdutoView extends TabPane{
	
	private BorderPane bordePane = new BorderPane();
	private HBox gradeBotoes = new HBox(10);
	
	private Tab tabConsulta = new Tab("Consulta");
	private Tab tabCadastro = new Tab("Cadastro");

	public ProdutoView() {
		new PersistenceController().loadPersistenceContext();
		botoes();
		this.setStyle("-fx-background-color: #FFFFFF;");
		this.setPadding(new Insets(10, 10, 10, 10));
		
		
		bordePane.setStyle("-fx-background-color: #FFFFFF;");
		bordePane.setPadding(new Insets(10, 10, 10, 10));
		bordePane.setTop(gradeBotoes);
		tabCadastro.setContent(bordePane);
		
		
//		this.getTabs().add(tabConsulta);
		this.getTabs().add(tabCadastro);
		this.setStyle("-fx-padding: 1; -fx-background-insets: 0, 1;");
	}
	
	private void botoes(){
		Button btAdicionar = new Botao("Adicionar");
		btAdicionar.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_ADD));
		
		btAdicionar.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("clicou");
				
			}
		});
		
		gradeBotoes.getChildren().add(btAdicionar);
	}
	
}
