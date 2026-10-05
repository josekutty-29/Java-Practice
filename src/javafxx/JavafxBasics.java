package javafxx;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
public class JavafxBasics extends Application{
	
	
	public void start(Stage stage) throws Exception{
		   
		Label newLabel=new Label("Name: ");
		TextField txtField=new TextField();
		txtField.setPromptText("Type Name here");
	
		PasswordField passField=new PasswordField();
		passField.setPromptText("Type Password here");
		
		Button submitt =new Button("Submit");
		
		TextArea addressArea=new TextArea();
		addressArea.setPromptText("Type Address here");
		
		DatePicker date=new DatePicker();
		
		CheckBox java= new CheckBox("java");
		CheckBox python= new CheckBox("python");
		CheckBox angular= new CheckBox("angular");
		
		RadioButton male=new RadioButton("male");
		RadioButton female=new RadioButton("female");
		
		ToggleGroup genterToggle=new ToggleGroup();
		male.setToggleGroup(genterToggle);
		female.setToggleGroup(genterToggle);
		
		ComboBox<String> courseComboBox =new ComboBox<>();
		
		courseComboBox .getItems().addAll(
				    "java",
				    "python",
				    "angular",
				    "dotnet"
				    );
		
		
		ListView<String> listview =new ListView<>();
		listview.getItems().addAll(
				"java",
			    "python",
			    "angular",
			    "dotnet"
				);
		
		TableView<Student> table=new TableView<>();
		
		TableColumn<Student,Integer> idColumn = new TableColumn<>("ID");
		
		TableColumn<Student,String> StudentNameColumn = new TableColumn<>("Name");
		
		idColumn.setCellValueFactory(
				new PropertyValueFactory<>("id")
				);
		
		StudentNameColumn.setCellValueFactory(
				new PropertyValueFactory<>("name")
				);
		
		table.getColumns().addAll(idColumn,StudentNameColumn);
		
		ObservableList<Student> students = FXCollections.observableArrayList(
		        new Student(1, "Jose"),
		        new Student(2, "Akash"),
		        new Student(3, "John")
		);

		

		table.setItems(students);
		
		table.setPrefSize(200, 500);
		
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		
		
		VBox root=new VBox(10);
		root.getChildren().addAll(
				newLabel,
				txtField,
				new Label("Password "),
				passField,
				submitt,
				new Label("Address"),
				addressArea,
				new Label("Course"),
				java,
				python,
				angular,
				new Label("Gender"),
				male,
				female,
				new Label("Date Of Birth"),
				date,
				new Label("Courses"),
				courseComboBox,
				new Label("Select Skills"),
				listview,
				table
												
				);
				
		Scene scene =new Scene(root,500,500);
		stage.setTitle("New");
		stage.setScene(scene);
		stage.show(); 
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

	
	
}
