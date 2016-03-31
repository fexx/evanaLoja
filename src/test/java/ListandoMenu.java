
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
		
		
		 VBox vBox = new VBox();
		bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent t) {
                
                final Stage stage = new Stage();
                Group rootGroup = new Group();
                Scene scene = new Scene(rootGroup, 200, 200, Color.TRANSPARENT);
                stage.setScene(scene);
                stage.centerOnScreen();
    			stage.setMinWidth(300);
    			stage.setMinHeight(500);
                stage.show();

               
                Button clique = new Button("Listar menus");
                clique.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent event) {
								
                    	clique.setOnMouseClicked(new EventHandler<Event>() {
						
									@Override
									public void handle(Event event) {
										for (int i = 0; i < mBar.getMenus().size(); i++) {
												Menu menu = mBar.getMenus().get(i);
												vBox.getChildren().add(new Label("Menu: "+String.valueOf(menu.getText())));
												for (int j = 0; j < menu.getItems().size(); j++) {
													MenuItem menuItem = menu.getItems().get(j);
													vBox.getChildren().add(new Label("--Item do menu: "+String.valueOf(menuItem.getText())));
												}
										}
									}
								});
                    }
                });

               
                vBox.setSpacing(10);
                vBox.setPadding(new Insets(60, 0, 0, 20));
                vBox.setAlignment(Pos.TOP_CENTER);
                vBox.getChildren().add(clique);

                rootGroup.getChildren().addAll(vBox);
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