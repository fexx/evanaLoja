package br.com.evana.loja.ui;

import org.controlsfx.control.textfield.TextFields;

import br.com.evana.loja.utils.MascarasUtils;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

public class CadastroProdutoUI extends VBox{
	
	Screen screen = Screen.getPrimary();
	Rectangle2D bounds = screen.getVisualBounds();
	private static CadastroProdutoUI INSTANCE = null;
	
	private Label lbCodigo = new Label("Codigo");
	private Label lbDescricao = new Label("Descrição");
	private Label lbPrecoCusto = new Label("Preço custo");
	private Label lbPrecoVenda = new Label("Preço venda");
	private Label lbCategoria = new Label("Categoria");
	private Label lbUnidade = new Label("Unidade");
	
	private TextField txtCodigo = TextFields.createClearableTextField();
	private TextField txtDescricao = TextFields.createClearableTextField();
	private TextField txtPrecoCusto = TextFields.createClearableTextField();
	private TextField txtPrecoVenda = TextFields.createClearableTextField();
	private ComboBox<String> cbckCategoria = new ComboBox<String>();
	private ComboBox<String> cbckUnidade = new ComboBox<String>();
	
	
	private VBox alinhaCampostexto = new VBox(20);
	final String cssDefault = "-fx-border-color: blue;-fx-border-insets: 5;-fx-border-width: 3;-fx-border-style: dashed;";
	
	
	public CadastroProdutoUI() {
		this.setPadding(new Insets(10, 10, 10, 10));
		
		organizaTextFields();
		alinhaCampostexto.setSpacing(5); 
		this.getChildren().add(alinhaCampostexto);
		this.getStyleClass().add("border");
	}

	public static synchronized CadastroProdutoUI getInstance() {
		if(INSTANCE == null){
			INSTANCE = new CadastroProdutoUI();
		}
		return INSTANCE;
	}
	
	private void organizaTextFields() {
		HBox hbAgrupaTxtPrecoCustoPrecoVenda = new HBox(50);
		HBox hbAgrupaLabelPrecoCustoPrecoVenda = new HBox(50);
		
		HBox hbAgrupaLabelCategoria = new HBox(50);
		HBox hbAgrupaCbckUnidade = new HBox(50);
		
		txtCodigo.getStyleClass().add("textField-img");
		txtCodigo.setPromptText("Código de barras");
		txtCodigo.setMinWidth(50);
		
		txtDescricao.getStyleClass().add("textField-img-descricao");
		txtDescricao.setPromptText("Descricao do produto");
		txtDescricao.setMinWidth(50);
		
		txtPrecoCusto.getStyleClass().add("textField-img-cifrao");
		txtPrecoCusto.setPromptText("Preco de custo");
		txtPrecoCusto.setMinWidth(50);
		txtPrecoCusto.setText("0");
		MascarasUtils.monetaryField(txtPrecoCusto);
		
		txtPrecoVenda.getStyleClass().add("textField-img-cifrao");
		txtPrecoVenda.setPromptText("Preco de venda");
		txtPrecoVenda.setMinWidth(50);
		txtPrecoVenda.setText("0");
		MascarasUtils.monetaryField(txtPrecoVenda);
		
		alinhaCampostexto.getChildren().addAll(lbCodigo, txtCodigo);
		alinhaCampostexto.getChildren().addAll(lbDescricao, txtDescricao);
		
		
		lbPrecoCusto.prefWidthProperty().bind(this.widthProperty());
		lbPrecoVenda.prefWidthProperty().bind(this.widthProperty());
		txtPrecoCusto.prefWidthProperty().bind(this.widthProperty());
		txtPrecoVenda.prefWidthProperty().bind(this.widthProperty());
		
		hbAgrupaLabelPrecoCustoPrecoVenda.getChildren().addAll(lbPrecoCusto, lbPrecoVenda);
		hbAgrupaTxtPrecoCustoPrecoVenda.getChildren().addAll(txtPrecoCusto, txtPrecoVenda);
		
		cbckCategoria.prefWidthProperty().bind(this.widthProperty());
		cbckUnidade.prefWidthProperty().bind(this.widthProperty());
		
		cbckCategoria.getItems().add("Selecione uma categoria");
		cbckCategoria.getItems().add("1");
		cbckCategoria.getItems().add("2");
		cbckCategoria.getItems().add("3");
		cbckCategoria.getItems().add("4");
		cbckCategoria.getSelectionModel().select(0);
		
		cbckUnidade.getItems().add("Selecione uma unidade");
		cbckUnidade.getItems().add("1");
		cbckUnidade.getItems().add("2");
		cbckUnidade.getItems().add("3");
		cbckUnidade.getItems().add("4");
		cbckUnidade.getSelectionModel().select(0);
		
		cbckCategoria.setStyle("-fx-pref-width: 100;");
		
		lbCategoria.prefWidthProperty().bind(this.widthProperty());
		lbUnidade.prefWidthProperty().bind(this.widthProperty());
		
		hbAgrupaLabelCategoria.getChildren().addAll(lbCategoria, lbUnidade);
		hbAgrupaCbckUnidade.getChildren().addAll(cbckCategoria, cbckUnidade);
		
		
		alinhaCampostexto.getChildren().addAll(hbAgrupaLabelPrecoCustoPrecoVenda, hbAgrupaTxtPrecoCustoPrecoVenda);
		alinhaCampostexto.getChildren().addAll(hbAgrupaLabelCategoria, hbAgrupaCbckUnidade);
	}
	
}
