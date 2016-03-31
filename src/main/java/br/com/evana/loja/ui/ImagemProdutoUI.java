package br.com.evana.loja.ui;

import org.controlsfx.control.textfield.TextFields;

import br.com.evana.loja.componentes.Botao;
import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ImagemProdutoUI extends VBox{
	
	private static ImagemProdutoUI INSTANCE = null;
	
	public ImagemProdutoUI() {
		HBox txtAndBt = new HBox(5);
		
		StackPane stpPainelImagem = new StackPane();
		ImageView urlImagemView = DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_SEM_IMAGEM);
		urlImagemView.setFitWidth(100);
		urlImagemView.setFitHeight(100);
		stpPainelImagem.getChildren().add(urlImagemView);
		
		stpPainelImagem.getStyleClass().add("borda");
		
		Botao botao = new Botao("...");
		botao.setMinHeight(35);
		TextField txtCarregarImagem = TextFields.createClearableTextField();
		txtCarregarImagem.getStyleClass().add("textField-img-picture");
		txtAndBt.getChildren().addAll(txtCarregarImagem, botao);
		
		stpPainelImagem.setPrefSize(500, 200);
		this.getChildren().add(stpPainelImagem);
		this.getChildren().add(txtAndBt);
		
		
        this.getStyleClass().add("borda");
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
