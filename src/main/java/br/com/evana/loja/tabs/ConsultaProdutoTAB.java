package br.com.evana.loja.tabs;

import br.com.evana.loja.ui.BotoesDefaultUI;
import br.com.evana.loja.ui.TituloPrincipalUI;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ConsultaProdutoTAB extends Tab{
	
	private VBox vbAlinhaGrade = new VBox(10);
	private BorderPane alinhaUI = new BorderPane();
	private Text titulo = TituloPrincipalUI.fomatFonteTela("Consulta produto");
	private BotoesDefaultUI botoesDefaultUI = new BotoesDefaultUI();
	
//	private static ConsultaProdutoTAB INSTACE = null;
	
	public ConsultaProdutoTAB() {
		alinhaUI.setTop(new TituloPrincipalUI(titulo));
		
		vbAlinhaGrade.getChildren().addAll(new GridPane());
		alinhaUI.setCenter(vbAlinhaGrade);
		alinhaUI.setBottom(new BotoesDefaultUI());
		
//		BorderPane.setMargin(alinhaUI, new Insets(20, 20, 20, 20));
		this.setContent(alinhaUI);
		this.setText("Consulta produto");
	}

	

//	private static synchronized ConsultaProdutoTAB getInstance() {
//		if(INSTACE == null){
//			INSTACE = new ConsultaProdutoTAB();
//		}
//		return INSTACE;
//	}
	
	public BotoesDefaultUI getBotoesDefaultUI() {
		return botoesDefaultUI;
	}

	public void setBotoesDefaultUI(BotoesDefaultUI botoesDefaultUI) {
		this.botoesDefaultUI = botoesDefaultUI;
	}
}
