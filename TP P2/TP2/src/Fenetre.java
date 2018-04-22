
import java.util.Observable;
import java.util.Observer;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tp2.Temperature;

public class Fenetre extends Stage implements Observer{
	private TextField temp;
	private Label label;
	private Label label2;
	private TextField temp2;
	private Avertisseur field;
	private Avertisseur field2;
	private Averti display;
	
	public Fenetre(){
		this.setTitle("Température");
		this.setResizable(true);
		this.setScene(new Scene(creerContenu()));
	}
	
	private Parent creerContenu() {
		VBox left =new VBox();
		VBox right=new VBox();
		
		field=new Avertisseur();
		field2=new Avertisseur();
		
		display=new Averti();
		field.addObserver(display);
		field2.addObserver(display);
		
		BorderPane racine= new BorderPane();
		label = new Label(toString(display.getValeur()));
		label2 = new Label(toString(display.getValeur()));
		temp = new TextField();
		temp2 = new TextField();
		
		left.getChildren().add(temp);
		left.getChildren().add(label);
		right.getChildren().add(temp2);
		right.getChildren().add(label2);
		left.setMargin(label, new Insets(10));
		right.setMargin(label2, new Insets(10));
		
		racine.setLeft(left);
		racine.setMargin(left, new  Insets(10));
		racine.setMargin(right, new  Insets(10));
		racine.setRight(right);
		racine.setPadding(new Insets(50));
		
		temp.setOnAction(e->{
			if(!this.temp.getText().isEmpty()){
				display.setValeur(Integer.parseInt(temp.getText()));
				field.setValue(Integer.parseInt(temp.getText()));
				label.setText(toString(field.getValue()));
				label2.setText(toString(field.getValue()));
			}
			
		});
		temp2.setOnAction(e->{
			if(!this.temp2.getText().isEmpty()){
				display.setValeur(Integer.parseInt(temp2.getText()));
				field2.setValue(Integer.parseInt(temp2.getText()));
				label.setText(toString(field2.getValue()));
				label2.setText(toString(field2.getValue()));
			}
			
		});
		return racine;
	}

	public String toString(int val){
		String str=String.valueOf(val);
		return str;
		
	}
	public void informeMoi(Avertisseur av) {
		temp.setOnAction(e->{
			if(!this.temp.getText().isEmpty()){
				display.setValeur(Integer.parseInt(temp.getText()));
				av.setValue(Integer.parseInt(temp.getText()));
				label.setText(toString(av.getValue()));
			}
		});
	}

	public Avertisseur getField() {
		return field;
	}

	public void setField(Avertisseur field) {
		this.field = field;
	}

	public Averti getDisplay() {
		return display;
	}

	public void setDisplay(Averti display) {
		this.display = display;
	}

	@Override
	public void update(Observable Av, Object arg1) {
		// TODO Auto-generated method stub
		Avertisseur A= (Avertisseur) Av;
		//setValeur(A.getValue());
	}
	
}
