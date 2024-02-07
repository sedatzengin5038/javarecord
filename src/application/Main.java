package application;

import javafx.scene.control.Button;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.server.Operation;
import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Main extends Application {
	
	int i = 0;
	static RestrictTheTextField textfield = new RestrictTheTextField();
	
	static RestrictTheTextField textfield1 = new RestrictTheTextField();
	static RestrictTheTextField textfield2 = new RestrictTheTextField();
	static RestrictTheTextField textfield3 = new RestrictTheTextField();
	static RestrictTheTextField textfield4 = new RestrictTheTextField();
	static RestrictTheTextField textfield5 = new RestrictTheTextField();
	static RestrictTheTextField textfield6 = new RestrictTheTextField();
	
	static Button b1 = new Button();
	static Button b2 = new Button();
	static Button b3 = new Button();
	static Button b4 = new Button();
	static Button b5 = new Button();
	static Button b6 = new Button();
	static Button b7 = new Button();
	static Button b8 = new Button();
	
	@Override
	public void start(Stage primaryStage) {
		
		StackPane pane = new StackPane();
		BorderPane root = new BorderPane(pane);
		
		
		
	
	
		
		
	
		Text text1 = new Text();
		text1.setText("ID");
		Text text2 = new Text();
		text2.setText("Name");
		Text text3 = new Text();
		text3.setText("Street");
		Text text4 = new Text();
		text4.setText("City");
		Text text5 = new Text();
		text5.setText("Search/Update ID");
		Text text6 = new Text();
		text6.setText("Gender");
		Text text7 = new Text();
		text7.setText("Zip");
		
	
		
		
		GridPane grid = new GridPane();
		GridPane grid1 = new GridPane();
		GridPane grid2 = new GridPane();
		

		grid.addRow(0, b1,b2,b3,b4,b5,b6,b7,b8);
		
	
	    
	    
	
		pane.getChildren().add(grid1);
		pane.getChildren().add(grid2);
		grid1.addColumn(0, text1);
		grid1.addColumn(0, text2);
		grid1.addColumn(0, text3);
		grid1.addColumn(0, text4);
		grid1.addRow(0, text5);
		grid1.addColumn(0, text6);
		grid1.addColumn(0, text7);
		
		
	
		GridPane.setMargin(text1, new Insets(26,0,0,90));
		GridPane.setMargin(text2, new Insets(10,0,0,90));
		GridPane.setMargin(text3, new Insets(10,0,0,90));
		GridPane.setMargin(text4, new Insets(10,0,0,90));
		GridPane.setMargin(text5, new Insets(24,0,0,-184));
		GridPane.setMargin(text6, new Insets(-19,0,0,282));
		GridPane.setMargin(text7, new Insets(-19,0,0,358));
		
	
		
		
		 
		GridPane.setMargin(b1, new Insets(0,2,0,25));
		GridPane.setMargin(b2, new Insets(0,2,0,0));
		GridPane.setMargin(b3, new Insets(0,2,0,0));
		GridPane.setMargin(b4, new Insets(0,2,0,0));
		GridPane.setMargin(b5, new Insets(0,2,0,0));
		GridPane.setMargin(b6, new Insets(0,2,0,0));
		GridPane.setMargin(b7, new Insets(0,2,0,0));
		
	
		grid2.getChildren().add(textfield);
		grid2.getChildren().add(textfield1);
		grid2.getChildren().add(textfield2);
		grid2.getChildren().add(textfield3);
		grid2.getChildren().add(textfield4);
		grid2.getChildren().add(textfield5);
		grid2.getChildren().add(textfield6);
		
		
		
		textfield.setMaxWidth(60);
		textfield.setMaxHeight(3);
		textfield1.setMaxWidth(158);
		textfield1.setMaxHeight(3);
		textfield4.setMaxWidth(150);
		textfield4.setMaxHeight(3);
		textfield5.setMaxWidth(30);
		textfield5.setMaxHeight(3);
		textfield6.setMaxWidth(60);
		
		
		
		GridPane.setMargin(textfield, new Insets(-60,0,0,130));
		GridPane.setMargin(textfield1, new Insets(-60,0,0,290));
		GridPane.setMargin(textfield2, new Insets(-5,0,0,130));
		GridPane.setMargin(textfield3, new Insets(48,0,0,130));
		GridPane.setMargin(textfield4, new Insets(103,0,0,130));
		GridPane.setMargin(textfield5, new Insets(103,0,0,325));
		GridPane.setMargin(textfield6, new Insets(103,0,0,380));
		
	
		
		
	
		
		root.setBottom(grid);
		
		Scene scene = new Scene(root);
	
		
		
		
	
		
		


	
		

		
		

		
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		primaryStage.setTitle("Address Book");
		Image image = new Image("icon.jpg");
		primaryStage.setWidth(550);
		primaryStage.setHeight(220);
		primaryStage.getIcons().add(image);
		 
		 //Add
		b1.setText("Add");
		
		b1.setMaxSize(40, 10);
		
		//First
		
		b2.setText("First");
		
		b2.setMaxSize(40, 10);
	    
		//Next
	    
		
		b3.setText("Next");
		
		b3.setMaxSize(50, 10);
	
		
		//Previous
		b4.setText("Previous");
	
		b4.setMaxSize(70, 10);
		//Last

		b5.setText("Last");
	
		b5.setMaxSize(70, 10);
		//Update by ID

		b6.setText("UpdatebyID");
	
		b6.setMaxSize(80, 10);
		//Search by ID

		b7.setText("SearchbyID");
	
		b7.setMaxSize(80, 10);
		//Clean Text Fields


		b8.setText("CleanTextFields");
	
		b8.setMaxSize(100, 10);
		
		
	
		textfield1.setMaxLength(4);
		textfield1.setIntegerField();
		textfield2.setMaxLength(32);
		textfield3.setMaxLength(32);
		textfield4.setMaxLength(20);
		textfield5.setMaxLength(1);
		textfield6.setMaxLength(5);
		textfield6.setIntegerField();
	
		textfield.setDisable(true);
		
		
		
		
	
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) throws Exception {
	 
		
		
		Person[] person = new Person[Operations.counterId("record.txt") + 100];
		
		for(int i = 0;i<Operations.counterId("record.txt");i++) {
			person[i] = new Operations();
			person[i].setId(i + 1);
			person[i].setName(Operations.readTheLine("record.txt",
					Operations.findLineNumber("Id= " + (i + 1) , "record.txt")));
			person[i].setStreet(Operations.readTheLine("record.txt",
					Operations.findLineNumber("Id= " + (i + 1) , "record.txt") + 1));
			person[i].setCity(Operations.readTheLine("record.txt",
					Operations.findLineNumber("Id= " + (i + 1) , "record.txt") + 2));
			person[i].setGender(Operations.readTheLineIntChar("record.txt",
					Operations.findLineNumber("Id= " + (i + 1) , "record.txt") + 3).charAt(0));
			person[i].setZip(Integer.parseInt(Operations.readTheLineIntChar("record.txt",
					Operations.findLineNumber("Id= " + (i + 1) , "record.txt") + 4)));
			
		}
	
		
	
			Operations o = new Operations();
			
		
		
		
	
		
		
		
		
		
		
	b1.setOnMouseClicked((MouseEvent event) ->{
		
			
			try {
				
				o.add();
				for(int i = 0;i<Operations.counterId("record.txt");i++) {
					person[i] = new Operations();
					person[i].setId(i + 1);
					person[i].setName(Operations.readTheLine("record.txt",
							Operations.findLineNumber("Id= " + (i + 1) , "record.txt")));
					person[i].setStreet(Operations.readTheLine("record.txt",
							Operations.findLineNumber("Id= " + (i + 1) , "record.txt") + 1));
					person[i].setCity(Operations.readTheLine("record.txt",
							Operations.findLineNumber("Id= " + (i + 1) , "record.txt") + 2));
					person[i].setGender(Operations.readTheLineIntChar("record.txt",
							Operations.findLineNumber("Id= " + (i + 1) , "record.txt") + 3).charAt(0));
					person[i].setZip(Integer.parseInt(Operations.readTheLineIntChar("record.txt",
							Operations.findLineNumber("Id= " + (i + 1) , "record.txt") + 4)));
					
				}
				
				
			} catch (IOException e) {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
				
			
			
			
		});
	
	b2.setOnMouseClicked((MouseEvent event) ->{
		try {
		o.first(person);
		}
		catch(Exception e) {
			AlertBox.displayError("Click The Button", "There is no info");
		}
	});
	
	b5.setOnMouseClicked((MouseEvent event) ->{
		try {
			o.last(person, Operations.counterId("record.txt") - 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			AlertBox.displayError("Click The Button", "There is no info");
		}
		
	});
	b3.setOnMouseClicked((MouseEvent event) ->{
		try {
			o.nextPrevious(person, Integer.parseInt(textfield.getText()));
		} catch (Exception e) {
			AlertBox.displayError("Click The Button", "There is no info");
		}
		
	
		
	});
	
	b4.setOnMouseClicked((MouseEvent event) ->{
		try {
			o.nextPrevious(person, Integer.parseInt(textfield.getText()) - 2);
		} catch (Exception e) {
			AlertBox.displayError("Click The Button", "There is no info");
		}
		
		
		
	});
	b6.setOnMouseClicked((MouseEvent event) ->{
		try {
			o.updateById(Integer.valueOf(textfield1.getText()), person);
			AlertBox.displayInfo("Information window", " the data succesfully updated ");
		} catch (Exception e) {
			AlertBox.displayError("Click The Button", "Please enter an id or right one or fill the empty spots");
		}
		
	});
	
	b7.setOnMouseClicked((MouseEvent event) ->{
		
	
			
			try {
				o.searchById(person);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				AlertBox.displayError("Click The Button", "There is no info");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				AlertBox.displayError("Click The Button", "There is no info");
			}
			catch(Exception e) {
				AlertBox.displayError("Click The Button", "There is no info");
			}
		
		
		
	});
		
	b8.setOnMouseClicked((MouseEvent event) ->{
		
		textfield.setText("");
		textfield1.setText("");
		textfield2.setText("");
		textfield3.setText("");
		textfield4.setText("");
		textfield5.setText("");
		textfield6.setText("");
		
	});
		
		
		
		
		
		
		launch(args);
	}}
	

