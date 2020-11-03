import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class Main extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		GridPane gp = new GridPane();
		Button btn1=new Button("Color 1");
		Button btn2=new Button("Color 2");
		Button btn3=new Button("Color 3");
		Text txt = new Text("");
		HBox root=new HBox();
		customize(btn1,btn2,btn3,txt,root,gp);
		gp.add(root, 0,0);
		gp.add(txt, 0, 1);
		Scene scene= new Scene(gp,300,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void customize(Button btn1,Button btn2,Button btn3,Text txt, HBox root,GridPane gp) {
		btn1.setOnAction(event -> {color1(gp, txt);});
		btn2.setOnAction(event -> {color2(gp, txt);});
		btn3.setOnAction(event -> {color3(gp, txt);});
		root.setSpacing(15);
		root.getChildren().addAll(btn1,btn2,btn3);
	}
	
	public void color1(GridPane root,Text txt) {
		root.setStyle("-fx-background-color: #FB2900;");
	}
	
	public void color2(GridPane root,Text txt) {
		root.setStyle("-fx-background-color: #136F4F;");
	}
	
	public void color3(GridPane root,Text txt) {
		root.setStyle("-fx-background-color: #0021FF;");
	
	}
	
	public static void main(String args[]) {
		launch();
	}
}
