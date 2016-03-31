package br.com.evana.loja.ui;

import org.controlsfx.control.textfield.TextFields;

import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

public class CadastroProdutoUI extends VBox{
	
	Screen screen = Screen.getPrimary();
	Rectangle2D bounds = screen.getVisualBounds();
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
//		CadastroProdutoUI.setMargin(this, new Insets(555, 5, 5, 5));
//		this.setPrefSize(100, 50);
		this.getStyleClass().add("border");
//		this.setMaxWidth(Double.MAX_VALUE);
		
		
		
//		this.setMinWidth(400);
//		this.setMaxWidth(bounds.getWidth());
//		this.setFillWidth(true);
		
//		this.setPrefSize(700, bounds.getHeight());
	}

	public static synchronized CadastroProdutoUI getInstance() {
		if(INSTANCE == null){
			INSTANCE = new CadastroProdutoUI();
		}
		return INSTANCE;
	}
	
	private void organizaTextFields() {
		txtCodigo.getStyleClass().add("textField-img");
		txtCodigo.setPromptText("Código de barras");
		txtCodigo.setMinWidth(50);
		
		txtDescricao.getStyleClass().add("textField-img-descricao");
		txtDescricao.setPromptText("Descricao do produto");
		txtDescricao.setMinWidth(50);
		
		alinhaCampostexto.getChildren().addAll(lbCodigo, txtCodigo);
		alinhaCampostexto.getChildren().addAll(lbDescricao, txtDescricao);
	}
}
