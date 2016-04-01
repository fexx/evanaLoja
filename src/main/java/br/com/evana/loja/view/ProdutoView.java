package br.com.evana.loja.view;

import br.com.evana.loja.ui.BotoesDefaultUI;
import br.com.evana.loja.ui.CadastroProdutoUI;
import br.com.evana.loja.ui.ImagemProdutoUI;
import br.com.evana.loja.ui.TituloPrincipalUI;
import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ProdutoView extends TabPane{
	
	private VBox vbAlinhaGrade = new VBox(10);
	private HBox hbAlinhaImagemCadastro = new HBox(10);
	Text titulo = fomatFonteTela("Cadastro de produtos");
	private Tab tabConsulta = new Tab("Consulta");
	private Tab tabCadastro = new Tab("Cadastro");
	private BorderPane alinhaUI = new BorderPane();

	public ProdutoView() {
//		new PersistenceController().loadPersistenceContext();
		this.setStyle("-fx-background-color: #FBFBFB;");
		
		vbAlinhaGrade.setStyle("-fx-background-color: #FBFBFB;");
		vbAlinhaGrade.setPadding(new Insets(10, 10, 10, 10));
		
		
		
		alinhaUI.setTop(new TituloPrincipalUI(titulo));
		
		CadastroProdutoUI.getInstance().prefWidthProperty().bind(this.widthProperty());
		hbAlinhaImagemCadastro.getChildren().addAll(ImagemProdutoUI.getInstance(), CadastroProdutoUI.getInstance());
		vbAlinhaGrade.getChildren().addAll(hbAlinhaImagemCadastro);
		alinhaUI.setCenter(vbAlinhaGrade);
		
		alinhaUI.setBottom(BotoesDefaultUI.getInstance());
		
		tabCadastro.setContent(alinhaUI);
		
//		this.getTabs().add(tabConsulta);
		this.getTabs().add(tabCadastro);
//		sc.setContent(this);
	}
	
	private Text fomatFonteTela(String texto) {
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
