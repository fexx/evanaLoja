package br.com.evana.loja.main;

import br.com.evana.loja.factory.TabFactory;
import br.com.evana.loja.utils.DiretorioArquivo;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	private static Scene scene;
	private Stage stage;
	public static BorderPane borderPanePrincipal = new BorderPane();

	@Override
	public void start(Stage stage) throws Exception {
		borderPanePrincipal.setTop(TabFactory.getInstance());
		Group root = new Group();
		scene = new Scene(root);
		scene.getStylesheets().add(DiretorioArquivo.getInstance().getUrlCSS(DiretorioArquivo.CSS_MAIN));
		borderPanePrincipal.prefHeightProperty().bind(scene.heightProperty());
		borderPanePrincipal.prefWidthProperty().bind(scene.widthProperty());
		root.getChildren().add(borderPanePrincipal);
		stage.setScene(scene);
		stage.setMinHeight(500);
		stage.setMinWidth(1000);
		stage.setMaximized(true);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
