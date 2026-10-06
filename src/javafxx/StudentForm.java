package javafxx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentForm extends Application {
	
	public void start(Stage stage1) {
		
		
		TextField nameField=new TextField();
		TextField ageField=new TextField();
		TextField emailField=new TextField();
		TextField phoneField=new TextField();
		TextField stateField=new TextField();
		
		Button btn =new Button("save");
		
		btn.setOnAction(e->{
			String name=nameField.getText();
			String age=ageField.getText();
			String email=emailField.getText();
			String phone=phoneField.getText();
			String state=stateField.getText();
			
			Stage stage2=new Stage();
			VBox root2=new VBox();
			root2.getChildren().addAll(
					new Label("Name : "+name),
					new Label("Age : "+age),
					new Label("Email : "+email),
					new Label("Phone Number : "+phone),
					new Label("State : "+state)
					
					
					);
			Scene scene2=new Scene(root2,500,500);
			stage2.setTitle("Form Display");
			stage2.setScene(scene2);
			stage2.show();
		});
		
		VBox root1=new VBox();
		root1.getChildren().addAll(
				
				new Label("Name"),
				nameField,
				new Label("Age"),
				ageField,
				new Label("Email"),
				emailField,
				new Label("Phone"),
				phoneField,
				new Label("State"),
				stateField,
				btn
				
				);
		Scene scene1=new Scene(root1,500,500);
		stage1.setTitle("Form");
		stage1.setScene(scene1);
		stage1.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	
	

}
