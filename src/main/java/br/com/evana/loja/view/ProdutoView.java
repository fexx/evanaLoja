package br.com.evana.loja.view;

import br.com.evana.loja.tabs.CadastroProdutoTAB;
import br.com.evana.loja.tabs.ConsultaProdutoTAB;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class ProdutoView extends TabPane{
	
	private static ProdutoView INSTACE = null;
	
	private Tab tabConsulta = new ConsultaProdutoTAB();
	private Tab tabCadastro = new CadastroProdutoTAB();

	public ProdutoView() {
//		new PersistenceController().loadPersistenceContext();
		this.setStyle("-fx-background-color: #FBFBFB;");
		this.getTabs().add(tabConsulta);
		this.getTabs().add(tabCadastro);
	}
	
	public static synchronized ProdutoView getInstance() {
	if(INSTACE == null){
		INSTACE = new ProdutoView();
	}
	return INSTACE;
}
	
}
