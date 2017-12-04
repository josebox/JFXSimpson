package view;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Controlador2 implements Initializable {

	@FXML
	private AnchorPane panelPrueba3;
	
	@FXML
	public Button login;
	
	public void translateAnimation(double duration, Node node, double byX) {
		// TODO Auto-generated method stub
		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(duration), node);
		translateTransition.setByX(byX);
		translateTransition.play();
			
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		translateAnimation(0.5, panelPrueba3, 2000);
		
		login.setOnMouseClicked(event -> {
			translateAnimation(0.5, panelPrueba3, -2000);

		});

	}


}
