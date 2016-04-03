package br.com.evana.loja.ui;

import br.com.evana.loja.componentes.Botao;
import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class BotoesDefaultUI extends HBox{
	
	private Botao btNovo = new Botao("Novo");
	private Botao btSalvar = new Botao("Salvar");
	private Botao btCancelar = new Botao("Cancelar");
	private Botao btExcluir = new Botao("Excluir");
	private Botao btEditar = new Botao("Editar");
	
	public BotoesDefaultUI() {
		
		btNovo.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_ADD));
		btSalvar.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_SALVAR));
		btCancelar.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_CANCELAR));
		btExcluir.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_REMOVE));
		btEditar.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_EDITAR));
		
		this.getChildren().addAll(btNovo, btSalvar, btEditar, btCancelar, btExcluir);
		this.setSpacing(30);
		this.setPrefHeight(70);
		this.getStyleClass().add("border");
		this.setAlignment(Pos.CENTER_RIGHT);
		this.setPadding(new Insets(20));
	}
	
}
