package javafxx;





import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GridPaneBasics extends Application{
	
	public void start(Stage st) {
		
		Label nameLabel=new Label("name");
		TextField nameField=new TextField();
		
		Label emailLabel=new Label("email");
		TextField emailField=new TextField();
		
		Button sbt = new Button("submitt");
		
		GridPane grid=new GridPane();
		
		grid.setPadding(new Insets(100));
		grid.setHgap(10);
		grid.setVgap(10);
		

        grid.add(nameLabel, 0, 0); //(c,r)
        grid.add(nameField, 1, 0);

        grid.add(emailLabel, 0, 1);
        grid.add(emailField, 1, 1);

        grid.add(sbt, 0, 2);
       
        sbt.setOnAction(e->{
        	System.out.println("Clicked!!!!!!!!");
        	Alert alert=new Alert(Alert.AlertType.INFORMATION);
        	alert.setTitle("Toby");
           	alert.setContentText("Button is Clicked");
        	alert.showAndWait();
        	System.out.println("Completed");
        });
        
        sbt.setOnMouseEntered(e->{
        	sbt.setStyle("-fx-background-color:red");
        });
        
        TextField t=new TextField();
        t.setOnKeyPressed(e->{
        	t.setText(e.getCode().toString());
        });
        grid.add(t, 1, 4);
        Scene scene=new Scene(grid,500,800);
        st.setTitle("Java Grid");
        st.setScene(scene);

         st.show();
		
		
	}
	
	public static void main(String[] args) {
		
		   launch(args);
		
		
	}

}
