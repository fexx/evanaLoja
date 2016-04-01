package br.com.evana.loja.ui;

import br.com.evana.loja.componentes.Botao;
import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ImagemProdutoUI extends VBox{
	
	private static ImagemProdutoUI INSTANCE = null;
	
	public ImagemProdutoUI() {
		
		StackPane stpPainelImagem = new StackPane();
		ImageView urlImagemView = DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_SEM_IMAGEM);
		urlImagemView.setFitWidth(100);
		urlImagemView.setFitHeight(100);
		stpPainelImagem.getChildren().add(urlImagemView);
		
		Botao botao = new Botao("Carregar imagens...");
		
		botao.prefWidthProperty().bind(this.widthProperty());
		
		stpPainelImagem.setStyle("-fx-background-color: #FFFFFF;");
		stpPainelImagem.setPrefSize(500, 200);
		this.getChildren().addAll(stpPainelImagem, botao);
		
		
        this.getStyleClass().add("border");
        ImagemProdutoUI.setMargin(this, new Insets(5, 5, 5, 5));
        this.setPadding(new Insets(10));
        this.getStylesheets().add(DiretorioArquivo.getInstance().getUrlCSS(DiretorioArquivo.CSS_IMAGEM_PRODUTO_UI));
	}
	
	public static synchronized ImagemProdutoUI getInstance(){
		if(INSTANCE == null){
			INSTANCE = new ImagemProdutoUI();
		}
		return INSTANCE;
	}

}
