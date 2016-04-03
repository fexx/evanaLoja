package br.com.evana.loja.tabs;

import br.com.evana.loja.ui.BotoesDefaultUI;
import br.com.evana.loja.ui.CadastroProdutoUI;
import br.com.evana.loja.ui.ImagemProdutoUI;
import br.com.evana.loja.ui.TituloPrincipalUI;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class CadastroProdutoTAB extends Tab{
	
	private VBox vbAlinhaGrade = new VBox(10);
	private HBox hbAlinhaImagemCadastro = new HBox(10);
	private BorderPane alinhaUI = new BorderPane();
	private Text titulo = TituloPrincipalUI.fomatFonteTela("Cadastro de produtos");
	
	public CadastroProdutoTAB() {
		alinhaUI.setTop(new TituloPrincipalUI(titulo));
		
//		CadastroProdutoUI.getInstance().prefWidthProperty().bind(ProdutoView.getInstance().widthProperty());
		hbAlinhaImagemCadastro.getChildren().addAll(ImagemProdutoUI.getInstance(), CadastroProdutoUI.getInstance());
		vbAlinhaGrade.getChildren().addAll(hbAlinhaImagemCadastro);
		alinhaUI.setCenter(vbAlinhaGrade);
		
		alinhaUI.setBottom(new BotoesDefaultUI());
		
//		BorderPane.setMargin(alinhaUI, new Insets(20, 20, 20, 20));
		this.setContent(alinhaUI);
		this.setText("Cadastro de produto");
	}

}
