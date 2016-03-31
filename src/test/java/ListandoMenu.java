
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ListandoMenu extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		
		Group root = new Group();
		VBox alinhaGrade = new VBox(10);
		MenuBar mBar = new MenuBar();
		
		Menu mCliente = new Menu("Cliente");
		Menu mProduto = new Menu("Produto");
		
		MenuItem mICadastro = new MenuItem("Cadastro");
		MenuItem mIConsulta = new MenuItem("Consulta");
		
		MenuItem mIEstoque = new MenuItem("Estoque");
		MenuItem mITiposProduto = new MenuItem("Tipo produto");
		
		mCliente.getItems().add(mICadastro);
		mCliente.getItems().add(mIConsulta);
		
		mProduto.getItems().add(mIEstoque);
		mProduto.getItems().add(mITiposProduto);
		
		mBar.getMenus().add(mCliente);
		mBar.getMenus().add(mProduto);
		
		Button bt = new Button("Clique");
		
		bt.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				for (int i = 0; i < mBar.getMenus().size(); i++) {
						Menu menu = mBar.getMenus().get(i);
						System.out.println("Menu: "+menu.getText());
						for (int j = 0; j < menu.getItems().size(); j++) {
							MenuItem menuItem = menu.getItems().get(j);
							System.out.println("--Item do menu: "+menuItem.getText());
						}
				}
			}
		});

		alinhaGrade.getChildren().addAll(mBar, bt);

		primaryStage.setTitle("Listando os menus");
		Scene scene = new Scene(root, 300, 250, Color.WHITE);
		root.getChildren().add(alinhaGrade);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}