import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Principale extends Application{
	public void start(Stage Window) throws Exception {
		Avertisseur av= new Avertisseur();
		Window f1 = new Window();
		f1.setX(500.0);
		Window f2 = new Window();
		f2.setX(10.0);
		av.addObserver(f2);
		av.addObserver(f1);
		
		f1.getTemp().setOnAction(e->{
			if(!f1.getTemp().getText().isEmpty()){
				av.setValue(Integer.parseInt(f1.getTemp().getText()));
			}
			
		});
		f1.show();
		f2.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
		//Application.launch(args);
		Avertisseur Brest=new Avertisseur();
		Averti Europe=new Averti();
		Brest.addObserver(Europe);
		Brest.setValue(18);
		//System.out.println(Europe.getValeur());
	}

}
