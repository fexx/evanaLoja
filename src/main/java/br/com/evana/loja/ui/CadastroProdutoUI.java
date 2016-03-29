package br.com.evana.loja.ui;

import org.controlsfx.control.textfield.TextFields;

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
		CadastroProdutoUI.setMargin(this, new Insets(10, 10, 10, 10));
		this.setPadding(new Insets(10, 10, 10, 10));
		
		
		organizaTextFields();
		alinhaCampostexto.setSpacing(5); 
		this.getChildren().add(alinhaCampostexto);
		this.getStyleClass().add("border");
//		this.setStyle(cssDefault);
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
		alinhaCampostexto.getChildren().addAll(txtCodigo, txtDescricao);
	}
}
