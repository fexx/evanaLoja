package br.com.evana.loja.componentes;

import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class BotaoAzul extends Button{
	
	private double largura;
	private double altura;
	private static BotaoAzul INSTANCE = null;
	
	private BotaoAzul() {
		this.configuracoesDefaultPvs();
	}
	
	public BotaoAzul(String descricao) {
		super(descricao);
		this.configuracoesDefaultPvs();
		this.getStylesheets().add(getCss());
	}
	
	public BotaoAzul(String descricao, Node node) {
		super(descricao, node);
		this.configuracoesDefaultPvs();
	}
	
	private void configuracoesDefaultPvs() {
		this.setId("botao-azul");
		this.setCursor(Cursor.HAND);
		this.getStylesheets().add(getCss());
	}
	
	public void setarBorda(String texto){
		this.getStyleClass().add(texto);
	}
	
	private String getCss() {
		String css = DiretorioArquivo.getInstance().getUrlCSS(DiretorioArquivo.CSS_BOTAO_AZUL);
		return css;
	}
	
	public static synchronized BotaoAzul getInstance() {
		if(INSTANCE == null){
			INSTANCE = new BotaoAzul();
		}
		return INSTANCE;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.setWidth(largura);
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.setHeight(largura);
		this.altura = altura;
	}
}
