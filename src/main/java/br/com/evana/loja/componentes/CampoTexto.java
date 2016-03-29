package br.com.evana.loja.componentes;

import javafx.scene.control.TextField;

public class CampoTexto extends TextField{
	
	public CampoTexto() {
		this.configuracoesDefaultPvs();
	}
	
	public CampoTexto(String descricao) {
		super(descricao);
		this.configuracoesDefaultPvs();
	}

	private void configuracoesDefaultPvs() {
		this.setMinSize(330, 37);
//		this.setStyle("-fx-text-fill: green; -fx-font-size: 13pt; -fx-font-weight: bold;");
	}
	
	public void setarBorda(String texto){
		this.getStyleClass().add(texto);
	}
	
	public void larguraMinima(double largura) {
		this.setMinWidth(largura);
	}
}
