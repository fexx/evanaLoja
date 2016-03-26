package br.com.evana.loja.view;

import br.com.evana.loja.componentes.Aba;
import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.scene.control.TabPane;

public class ManagerTabs extends TabPane{ 
	
	private static ManagerTabs INSTANCE = null;

	private Aba abaHome = new Aba("Home");
	private Aba abaConfiguracoes = new Aba("Configurações");
	
	private ManagerTabs() {
		abaHome.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_HOME));
		abaConfiguracoes.setGraphic(DiretorioArquivo.getInstance().getUrlImagemView(DiretorioArquivo.IMAGEM_ENGRENAGEM));
		
		
		this.getTabs().add(abaHome);
		this.getTabs().add(abaConfiguracoes);
		this.getStylesheets().add(DiretorioArquivo.getInstance().getUrlCSS(DiretorioArquivo.CSS_ABA));
	}
	
	public static synchronized ManagerTabs getInstance(){
		if(INSTANCE == null){
			INSTANCE = new ManagerTabs();
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
