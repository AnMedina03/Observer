import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class Main extends Application{
	private Label acuse;
	private operacion o;
	@Override
	public void start(Stage primaryStage) {
		o= new operacion();
		GridPane gp = new GridPane();
		Button btn1=new Button("Color 1");
		Button btn2=new Button("Color 2");
		Button btn3=new Button("Color 3");
		Text txt = new Text();
		Text txt2 = new Text("Suma de colores:"+"\n"+"Instrucciones: Conforme le da click a un boton correspondiente,"
				+ "\n"+" estos se sumaran constantemente."
				+"\n"+"Los valores son: "+"\n"+"Color 1: 10"+"\n"+"Color 2: 20"+"\n"+"Color 3: 30");
		Text txt3 = new Text("Resultado");
		HBox root=new HBox();
		customize(btn1,btn2,btn3,txt,txt2,txt3,root,gp);
		Scene scene= new Scene(gp,400,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void customize(Button btn1,Button btn2,Button btn3,Text txt, Text txt2, Text txt3, HBox root,GridPane gp) {
		btn1.setOnAction(event -> {color1(gp, txt);
		o.sumar1();
		acuse.setText(o.getnumero()+"");
		});
		btn2.setOnAction(event -> {color2(gp, txt);
		o.sumar2();
		acuse.setText(o.getnumero()+"");
		
		});
		btn3.setOnAction(event -> {color3(gp, txt);
		o.sumar3();
		acuse.setText(o.getnumero()+"");
		});
		acuse= new Label("0");
		root.setSpacing(15);
		root.getChildren().addAll(btn1,btn2,btn3);
		gp.add(root, 0,0);
		gp.add(txt, 0, 1);
		gp.add(txt2, 0, 2);
		gp.add(txt3,0,3);
		gp.add(acuse,0,4);
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
