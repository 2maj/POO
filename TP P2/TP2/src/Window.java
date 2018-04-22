import java.util.Observable;
import java.util.Observer;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Window extends Stage implements Observer{
	private TextField temp;
	private Label label;
	
	public Window(){
		this.setTitle("Température");
		this.setResizable(true);
		this.setScene(new Scene(creerContenu()));
	}
	
	private Parent creerContenu() {
		VBox left =new VBox();
		
		BorderPane racine= new BorderPane();
		label = new Label("0");
		temp = new TextField();
		
		left.getChildren().add(temp);
		left.getChildren().add(label);
		left.setMargin(label, new Insets(10));
		
		racine.setLeft(left);
		racine.setMargin(left, new  Insets(10));
		racine.setPadding(new Insets(50));
		
		return racine;
	}

	public String toString(int val){
		String str=String.valueOf(val);
		return str;
		
	}
	public void update(Observable Av, Object arg1) {
		// TODO Auto-generated method stub
		Avertisseur A= (Avertisseur) Av;
		label.setText(toString(A.getValue()));
	}

	public TextField getTemp() {
		return temp;
	}

	public void setTemp(TextField temp) {
		this.temp = temp;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}
	
}

