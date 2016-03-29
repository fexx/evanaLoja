package br.com.evana.loja.ui;

import org.controlsfx.control.textfield.TextFields;

import br.com.evana.loja.componentes.Botao;
import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ImagemProdutoUI extends BorderPane{
	
	private static ImagemProdutoUI INSTANCE = null;
	
	public ImagemProdutoUI() {
		VBox vbAcoes = new VBox(10);
		HBox txtAndBt = new HBox(5);
		
		StackPane stpPainelImagem = new StackPane();
		stpPainelImagem.getChildren().add(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_JAQUETA_FEMININA));
		stpPainelImagem.getStyleClass().add("borda");
		
		Botao botao = new Botao("...");
		botao.setMinHeight(35);
		TextField txtCarregarImagem = TextFields.createClearableTextField();
		txtCarregarImagem.getStyleClass().add("textField-img-picture");
		txtAndBt.getChildren().addAll(txtCarregarImagem, botao);
		
		vbAcoes.getChildren().add(stpPainelImagem);
		vbAcoes.getChildren().add(txtAndBt);
		
		this.setTop(vbAcoes);
		
//        this.getStyleClass().add("borda");
        ImagemProdutoUI.setMargin(this, new Insets(5, 5, 5, 5));
        this.getStylesheets().add(DiretorioArquivo.getInstance().getUrlCSS(DiretorioArquivo.CSS_IMAGEM_PRODUTO_UI));
	}
	
	public static synchronized ImagemProdutoUI getInstance(){
		if(INSTANCE == null){
			INSTANCE = new ImagemProdutoUI();
		}
		return INSTANCE;
	}

}
