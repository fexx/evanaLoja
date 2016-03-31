import br.com.evana.loja.ui.CadastroProdutoUI;
import br.com.evana.loja.ui.ImagemProdutoUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class SampleGrindPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root,400,400);
//            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            ButtonPanel2 bp = new ButtonPanel2();
            root.setCenter(bp);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//end start

    public static void main(String[] args) {
        launch(args);
    }//end main
}//end class main


class ButtonPanel2 extends AnchorPane {

    GridPane grid;

    Button ba, bb, bc, bd;


    /**Construct a new button panel object.**/
    public ButtonPanel2(){
        //Create Grid and gaps
        grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        grid.prefWidthProperty().bind(this.widthProperty());
        grid.getStyleClass().add("test");

        //Init buttons
        ba = new Button("A");
        bb = new Button("B");
        bc = new Button("C");
        bd = new Button("D");


        ImagemProdutoUI.getInstance().setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        CadastroProdutoUI.getInstance().setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        bc.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        bd.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        //Add items to grid.
        //Node, colIndex, rowIndex, colSpan, rowSpan
        grid.add(ImagemProdutoUI.getInstance(),0,0,1,1);//
        grid.add(CadastroProdutoUI.getInstance(),1,0,2,1);//
//        grid.add(bc,0,1,1,2);//
//        grid.add(bd,1,1,2,2);//


        //Grid contstraints.
        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(25);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(75);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(25);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(75);

        grid.getRowConstraints().addAll(row1,row2);
        grid.getColumnConstraints().addAll(col1,col2);


        //anchor grid to parent container (anchor)
        AnchorPane.setTopAnchor(grid, 0.0);
        AnchorPane.setBottomAnchor(grid, 0.0);
        AnchorPane.setLeftAnchor(grid, 0.0);
        AnchorPane.setRightAnchor(grid, 0.0);

        this.getChildren().add(grid);

        this.getStyleClass().add("test");
    }//end buttonPanel2

}//end buttonPanel2