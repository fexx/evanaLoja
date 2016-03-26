package br.com.evana.loja.utils;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DiretorioArquivo {
	
	public static DiretorioArquivo INSTANCE = null;
	
	private String dirBase = "/br/com/evana/loja/";
	
	public static String CSS_MAIN = "main.css";
	public static String CSS_BOTAO_AZUL = "componentes/botao_azul.css";
	public static String CSS_ABA = "componentes/aba.css";
	
	public static String IMAGEM_HOME = "home.png";
	public static String IMAGEM_ENGRENAGEM = "run.png";
	
	private DiretorioArquivo() {}
	
	public ImageView getUrlImagemView(String uri){
		ImageView imageView = new ImageView();
		Image image = new Image(getClass().getResourceAsStream(dirBase+"imagem/"+uri));
		imageView.setImage(image);
		return imageView;
	}
	
	public String getUrlCSS(String uri){
		return getClass().getResource(dirBase+"css/"+uri).toExternalForm();
	}
	
	public static synchronized DiretorioArquivo getInstance(){
		if (INSTANCE == null) {
			INSTANCE = new DiretorioArquivo();
		}
		return INSTANCE;
	}
	
}
