package br.com.evana.loja.componentes;

import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class Botao extends Button{
	
	private double largura;
	private double altura;
	private static Botao INSTANCE = null;
	
	private Botao() {
		this.configuracoesDefaultPvs();
	}
	
	public Botao(String descricao) {
		super(descricao);
		this.configuracoesDefaultPvs();
		this.setCursor(Cursor.HAND);
		this.getStylesheets().add(getCss());
	}
	
	public Botao(String descricao, Node node) {
		super(descricao, node);
		this.configuracoesDefaultPvs();
	}
	
	private void configuracoesDefaultPvs() {
		this.setId("botao-branco");
		this.setCursor(Cursor.HAND);
		this.getStylesheets().add(getCss());
	}
	
	public void setarBorda(String texto){
		this.getStyleClass().add(texto);
	}
	
	private String getCss() {
		String css = DiretorioArquivo.getInstance().getUrlCSS(DiretorioArquivo.CSS_BOTAO_BRANCO);
		return css;
	}
	
	public static synchronized Botao getInstance() {
		if(INSTANCE == null){
			INSTANCE = new Botao();
		}
		return INSTANCE;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.setMinWidth(largura);
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.setMinHeight(largura);
		this.altura = altura;
	}
}
