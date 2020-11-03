import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public aspect Aspecto {
	pointcut color() : execution(* color*(..));
	after(): color() {
		Alert show = new Alert(Alert.AlertType.WARNING);
		show.setHeaderText("ÉXITO!!!!");
        show.setTitle("TITULO DEL MENSAJE");
		Text arg = (Text) thisJoinPoint.getArgs()[1];
		if(thisJoinPoint.getSignature().toString().equals("void Main.color1(GridPane, Text)")) {
			arg.setText("Color 1: Rojo");
			arg.setFill(Color.YELLOW);
	        show.setContentText("Cambio a color Rojo");
			System.out.println("Color 1: Rojo");
		}
		else if(thisJoinPoint.getSignature().toString().equals("void Main.color2(GridPane, Text)")) {
			arg.setText("Color 2: Verde");
			arg.setFill(Color.WHITE);
	        show.setContentText("Cambio a color Verde");
			System.out.println("Color 2: Verde");
		}else{
			arg.setText("Color 3: Azul");
			arg.setFill(Color.LIGHTBLUE);
	        show.setContentText("Cambio a color Azul");
			System.out.println("Color 3: Azul");
		}
        show.showAndWait();
	}
}
