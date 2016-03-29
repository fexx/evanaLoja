package br.com.evana.loja.ui;

import org.controlsfx.control.textfield.TextFields;

import br.com.evana.loja.view.ProdutoView;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class CadastroProdutoUI extends StackPane{
	
	private static CadastroProdutoUI INSTANCE = null;
	private Label lbCodigo = new Label("Codigo");
	private Label lbDescricao = new Label("Descrição");
	
	private TextField txtCodigo = TextFields.createClearableTextField();
	private TextField txtDescricao = TextFields.createClearableTextField();
	
	
	private VBox alinhaCampostexto = new VBox(20);
	final String cssDefault = "-fx-border-color: blue;-fx-border-insets: 5;-fx-border-width: 3;-fx-border-style: dashed;";
	
	
	public CadastroProdutoUI() {
		this.setPadding(new Insets(10, 10, 10, 10));
		
		
		organizaTextFields();
		alinhaCampostexto.setSpacing(5); 
		this.getChildren().add(alinhaCampostexto);
		CadastroProdutoUI.setMargin(this, new Insets(555, 5, 5, 5));
		this.setStyle(cssDefault);
//		this.setPrefWidth();
		this.getStyleClass().add("border");
	}

	public static synchronized CadastroProdutoUI getinstance() {
		if(INSTANCE == null){
			INSTANCE = new CadastroProdutoUI();
		}
		return INSTANCE;
	}
	
	private void organizaTextFields() {
		txtCodigo.getStyleClass().add("textField-img");
		txtCodigo.setPromptText("Código de barras");
		
		txtDescricao.getStyleClass().add("textField-img-descricao");
		txtDescricao.setPromptText("Descricao do produto");
		alinhaCampostexto.getChildren().addAll(lbCodigo, txtCodigo);
		alinhaCampostexto.getChildren().addAll(lbDescricao, txtDescricao);
	}
}
