package br.com.evana.loja.view;

import br.com.evana.loja.ui.CadastroProdutoUI;
import br.com.evana.loja.ui.ImagemProdutoUI;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;

public class ProdutoView extends TabPane{
	
	private BorderPane bordePane = new BorderPane();
	private HBox gradeBotoes = new HBox(10);
	
	private Tab tabConsulta = new Tab("Consulta");
	private Tab tabCadastro = new Tab("Cadastro");
	private ScrollPane scrollPane;

	public ProdutoView() {
		ScrollPane sc = new ScrollPane();
//		new PersistenceController().loadPersistenceContext();
		this.setStyle("-fx-background-color: #FBFBFB;");
		
		
		bordePane.setStyle("-fx-background-color: #FBFBFB;");
		bordePane.setPadding(new Insets(10, 10, 10, 10));
		StackPane tituloTela = new StackPane();
		tituloTela.getStyleClass().add("border");
		tituloTela.setMinHeight(40);
		BorderPane bpTituloTela = new BorderPane();
		bpTituloTela.setPadding(new Insets(10, 10, 10, 10));
		StackPane.setMargin(tituloTela, new Insets(10, 10, 10, 10));
		Label titulo = new Label("Cadastro de produtos");
		bpTituloTela.setLeft(titulo);
		tituloTela.getChildren().add(bpTituloTela);
//		StackPane.setMargin(tituloTela, new Insets(10, 10, 10, 10));
		bordePane.setTop(tituloTela);
		
		HBox hb = new HBox(10);
		hb.setMaxWidth(Double.MAX_VALUE);
		hb.getChildren().addAll(ImagemProdutoUI.getInstance(), CadastroProdutoUI.getinstance());
		
		HBox.setHgrow(hb, Priority.ALWAYS);
		bordePane.setLeft(hb);
//		BorderPane.setH
		
		scrollPane = new ScrollPane();
		tabCadastro.setContent(bordePane);

		scrollPane.setContent(this);
		
		
		
//		this.getTabs().add(tabConsulta);
		this.getTabs().add(tabCadastro);
//		this.setStyle("-fx-padding: 1; -fx-background-insets: 0, 1;");
		sc.setContent(this);
	}
	
//	private void botoes(){
//		Button btAdicionar = new Botao("Adicionar");
//		btAdicionar.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_ADD));
//		
//		btAdicionar.setOnMouseClicked(new EventHandler<Event>() {
//
//			@Override
//			public void handle(Event event) {
//				System.out.println("clicou");
//				
//			}
//		});
//		
//		gradeBotoes.getChildren().add(btAdicionar);
//	}
	
}
