package br.com.evana.loja.factory;

import br.com.evana.loja.componentes.Aba;
import br.com.evana.loja.utils.DiretorioArquivo;
import br.com.evana.loja.view.EstoqueView;
import br.com.evana.loja.view.HomeView;
import br.com.evana.loja.view.ProdutoView;
import javafx.scene.control.TabPane;

public class TabFactory extends TabPane{ 
	
	private static TabFactory INSTANCE = null;

	private Aba abaHome = new Aba("Home", DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_HOME));
	private Aba abaProduto = new Aba("Produtos", DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_PRODUTO));
	private Aba abaEstoque = new Aba("Etoque", DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_CABIDE));
	private Aba abaConfiguracoes = new Aba("Configurações", DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_ENGRENAGEM));
	
	private TabFactory() {
		abaHome.setContent(new HomeView());
		abaEstoque.setContent(new EstoqueView());
		abaProduto.setContent(new ProdutoView());
		
//		this.getTabs().add(abaHome);
		this.getTabs().add(abaProduto);
//		this.getTabs().add(abaEstoque);
//		this.getTabs().add(abaConfiguracoes);
		this.getStylesheets().add(DiretorioArquivo.getInstance().getUrlCSS(DiretorioArquivo.CSS_ABA));
	}
	
	public static synchronized TabFactory getInstance(){
		if(INSTANCE == null){
			INSTANCE = new TabFactory();
		}
		return INSTANCE;
	}

	public Aba getAbaHome() {
		return abaHome;
	}

	public void setAbaHome(Aba abaHome) {
		this.abaHome = abaHome;
	}

	public Aba getAbaEstoque() {
		return abaConfiguracoes;
	}

	public void setAbaEstoque(Aba abaEstoque) {
		this.abaConfiguracoes = abaEstoque;
	}
	
	
	
}
