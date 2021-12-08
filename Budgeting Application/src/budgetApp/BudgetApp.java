/**
 * @created October 30, 2019
 * @author 	Lisa Mulhearn
 * @due 	December 10, 2019
 */

package budgetApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class BudgetApp extends Application {
	
	int i = 0;
	double userInput;
	double recInc;
	
	Stage window;
	Scene scene1, scene2, scene3, scene4, scene5, scene6;
	
	//Main
    public static void main(String[] args) {
    	launch(args);
    }		
    
    @Override
	public void start(Stage primaryStage) throws Exception {
    	
    	window = primaryStage;
    	 	
    	Text question1 = new Text("Over what time period would you like to budget for?");
    	question1.setStyle("-fx-font: 24 Verdana;");
    	
    	//Create the Buttons
    	RadioButton dailyButton = new RadioButton("Daily");
    	dailyButton.setStyle("-fx-font: 18 Verdana;");
    	RadioButton weeklyButton = new RadioButton("Weekly");
    	weeklyButton.setStyle("-fx-font: 18 Verdana;");
    	RadioButton biweeklyButton = new RadioButton("Bi-Weekly");
    	biweeklyButton.setStyle("-fx-font: 18 Verdana;");
    	RadioButton monthlyButton = new RadioButton("Monthly");
    	monthlyButton.setStyle("-fx-font: 18 Verdana;");
    	RadioButton yearlyButton = new RadioButton("Yearly");
    	yearlyButton.setStyle("-fx-font: 18 Verdana;");
    	
    	//Create toggle group
    	ToggleGroup buttons = new ToggleGroup();
    	dailyButton.setToggleGroup(buttons);
    	weeklyButton.setToggleGroup(buttons);
    	biweeklyButton.setToggleGroup(buttons);
    	monthlyButton.setToggleGroup(buttons);
    	yearlyButton.setToggleGroup(buttons);
    	
    	HBox s1Buttons = new HBox();
    	s1Buttons.setAlignment(Pos.BOTTOM_CENTER);
    	s1Buttons.getStyleClass().add("buttons");
        s1Buttons.getStylesheets().add("style.css");
        Button scene1to2Button = new Button("Next");
        s1Buttons.getChildren().add(scene1to2Button);
    	
        VBox layout1 = new VBox(15);
        VBox layout2 = new VBox(15);
        
    	//Perform these actions while transferring to scene 2
    	scene1to2Button.setOnAction(new EventHandler<ActionEvent>() {
		    @Override // Override the handle method
		    public void handle(ActionEvent e) {
		    		
		    	if(dailyButton.isSelected()){
	                double recInc = 1;
	                Text question2 = new Text("How much income do you recieve over the course of a day: ");
		        	question2.setStyle("-fx-font: 24 Verdana;");
		        	layout2.getChildren().add(question2);
		        	question2.toBack();
	                System.out.println(recInc);
	                i = 0;
	                window.setScene(scene2);
	            }
		    	
		    	else if(weeklyButton.isSelected()){
	                double recInc = 7;
	                Text question2 = new Text("How much income do you recieve over the course of a week: ");
		        	question2.setStyle("-fx-font: 24 Verdana;");
		        	layout2.getChildren().add(question2);
		        	question2.toBack();
	                System.out.println(recInc);
	                i = 0;
	                window.setScene(scene2);
	            }
		    	
		    	else if(biweeklyButton.isSelected()){
	                double recInc = 14;
	                Text question2 = new Text("How much income do you recieve over a bi-weekly period: ");
		        	question2.setStyle("-fx-font: 24 Verdana;");
		        	layout2.getChildren().add(question2);
		        	question2.toBack();
	                System.out.println(recInc);
	                i = 0;
	                window.setScene(scene2);
	            }
		    	
		    	else if(monthlyButton.isSelected()){
	                double recInc = 30.4;
	                Text question2 = new Text("How much income do you recieve over the course of a month: ");
		        	question2.setStyle("-fx-font: 24 Verdana;");
		        	layout2.getChildren().add(question2);
		        	question2.toBack();
	                System.out.println(recInc);
	                i = 0;
	                window.setScene(scene2);
	            }
		    	
		    	else if(yearlyButton.isSelected()){
	                double recInc = 365;
	                Text question2 = new Text("How much income do you recieve over the course of a year: ");
		        	question2.setStyle("-fx-font: 24 Verdana;");
		        	layout2.getChildren().add(question2);
		        	question2.toBack();
	                System.out.println(recInc);
	                i = 0;
	                window.setScene(scene2);
	            }
		    	else{
		    		System.out.println("No selection");
		    		window.setScene(scene1);
		    		Text error1 = new Text("Please make a valid selection");
		    	    error1.getStyleClass().add("my-text");
		    	    //to only display message once
		    	    if(i == 0) {
		    	    	layout1.getChildren().add(error1);
		    	    	i++;
		    	    }
		    	}
		    }
	    });

    	//Layout 1 - children are laid out in vertical column
    	layout1.getChildren().addAll(question1, dailyButton, weeklyButton, biweeklyButton, monthlyButton, yearlyButton, s1Buttons);
    	layout1.getStyleClass().add("bg");
    	layout1.getStylesheets().add("style.css");
    	scene1 = new Scene(layout1, 1200, 800);
    //	scene1.getStylesheets().add("style.css");
    	
    	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	// Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.setPadding(new Insets(1, 1, 1, 1));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
       
        final TextField inputIncome = new TextField();
        pane.add(inputIncome, 0, 0);
        
        HBox s2Buttons = new HBox();
        s2Buttons.setAlignment(Pos.BOTTOM_CENTER);
    //    Button scene2to1Button = new Button("Back");
        Button scene2to3Button = new Button("Next");
        s2Buttons.getChildren().addAll(scene2to3Button);
    	
   //     VBox layout2 = new VBox(15);
        
    	//Perform these actions while transferring to scene 3
    	scene2to3Button.setOnAction(new EventHandler<ActionEvent>() {
		    @Override // Override the handle method
		    public void handle(ActionEvent e) {
		    	try {
		    		userInput = Double.parseDouble(inputIncome.getText());
		    		System.out.println(userInput);
		    		window.setScene(scene3);
		    	} 
		    	catch (NumberFormatException nfe) {
		    	    System.out.println("Not a valid number");
		    	    window.setScene(scene2);
		    	    Text error = new Text("Enter a valid number in the box above");
		    	    error.getStyleClass().add("my-text");
		    	    if(i == 0) {
		    	    	layout2.getChildren().add(error);
		    	    	i++;
		    	    }
		    	}
		    }
	    });
    	
 /*   	//Go to scene 1
    	scene2to1Button.setOnAction(new EventHandler<ActionEvent>() {
    		@Override // Override the handle method
    		public void handle(ActionEvent e) {
    			window.setScene(scene1);
    			//remove question2 from layout2 so it does not repeat when going back and forth
    		}
    	});
 */
    	
    	//Layout 2 - children are laid out in vertical column
    	layout2.getChildren().addAll(pane, s2Buttons);
    	layout2.getStyleClass().add("bg");
    	layout2.getStylesheets().add("style2.css");
    	scene2 = new Scene(layout2, 1200, 800);
    	
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
    	
    	List<Double> amtList = new ArrayList<Double>();
    	amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
        amtList.add(0.0); 
    	List<String> customTFList = new ArrayList<String>();
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	customTFList.add("untitled");
    	
    	Text question3 = new Text("Enter the amount you would like to put towards each expenditure during your budgeting period");
    	question3.setStyle("-fx-font: 24 Verdana;");
    	
    	Text hint3 = new Text("~ Blank fields (where you place the money amount) will not be accounted for ~");
    	hint3.setStyle("-fx-font: 20 Kalam;");
    	hint3.getStyleClass().add("my-text");
    	
    	GridPane pane3 = new GridPane();
        pane3.setAlignment(Pos.CENTER_LEFT);
        pane3.setPadding(new Insets(1, 1, 1, 1));
        pane3.setHgap(5.5);
        pane3.setVgap(5.5);
            
        //place nodes in the pane
        //left column
        final Label label1 = new Label();
        label1.setText("Rent");
        pane3.add(label1, 0, 0);
        label1.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label1, 0.0);
        AnchorPane.setRightAnchor(label1, 0.0);
        label1.setAlignment(Pos.CENTER);
        
        final TextField input1 = new TextField();
        pane3.add(input1, 1, 0);
        
        final Label label2 = new Label();
        label2.setText("Groceries");
        pane3.add(label2, 0, 1);
        label2.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label2, 0.0);
        AnchorPane.setRightAnchor(label2, 0.0);
        label2.setAlignment(Pos.CENTER);
        
        final TextField input2 = new TextField();
        pane3.add(input2, 1, 1);
        
        final Label label3 = new Label();
        label3.setText("Gas");
        pane3.add(label3, 0, 2);
        label3.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label3, 0.0);
        AnchorPane.setRightAnchor(label3, 0.0);
        label3.setAlignment(Pos.CENTER);
        
        final TextField input3 = new TextField();
        pane3.add(input3, 1, 2);
        
        final Label label4 = new Label();
        label4.setText("Dining out");
        pane3.add(label4, 0, 3);
        label4.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label4, 0.0);
        AnchorPane.setRightAnchor(label4, 0.0);
        label4.setAlignment(Pos.CENTER);
        
        final TextField input4 = new TextField();
        pane3.add(input4, 1, 3);
        
        final TextField customTFLabel1 = new TextField();
        customTFLabel1.setText("Untitled");
        pane3.add(customTFLabel1, 0, 4);
        customTFLabel1.setAlignment(Pos.CENTER);
        customTFLabel1.getStyleClass().add("tf");
        
        final TextField input5 = new TextField();
        pane3.add(input5, 1, 4);
        
        final TextField customTFLabel2 = new TextField();
        customTFLabel2.setText("Untitled");
        pane3.add(customTFLabel2, 0, 5);
        customTFLabel2.setAlignment(Pos.CENTER);
        customTFLabel2.getStyleClass().add("tf");
        
        final TextField input6 = new TextField();
        pane3.add(input6, 1, 5);
        
        final TextField customTFLabel3 = new TextField();
        customTFLabel3.setText("Untitled");
        pane3.add(customTFLabel3, 0, 6);
        customTFLabel3.setAlignment(Pos.CENTER);
        customTFLabel3.getStyleClass().add("tf");
        
        final TextField input7 = new TextField();
        pane3.add(input7, 1, 6);
        
        final TextField customTFLabel4 = new TextField();
        customTFLabel4.setText("Untitled");
        pane3.add(customTFLabel4, 0, 7);
        customTFLabel4.setAlignment(Pos.CENTER);
        customTFLabel4.getStyleClass().add("tf");
        
        final TextField input8 = new TextField();
        pane3.add(input8, 1, 7);
        
        final TextField customTFLabel5 = new TextField();
        customTFLabel5.setText("Untitled");
        pane3.add(customTFLabel5, 0, 8);
        customTFLabel5.setAlignment(Pos.CENTER);
        customTFLabel5.getStyleClass().add("tf");
        
        final TextField input9 = new TextField();
        pane3.add(input9, 1, 8);
        
        //middle column
        final TextField customTFLabel6 = new TextField();
        customTFLabel6.setText("Untitled");
        pane3.add(customTFLabel6, 3, 0);
        customTFLabel6.setAlignment(Pos.CENTER);
        customTFLabel6.getStyleClass().add("tf");
        
        final TextField input10 = new TextField();
        pane3.add(input10, 4, 0);
        
        final TextField customTFLabel7 = new TextField();
        customTFLabel7.setText("Untitled");
        pane3.add(customTFLabel7, 3, 1);
        customTFLabel7.setAlignment(Pos.CENTER);
        customTFLabel7.getStyleClass().add("tf");
        
        final TextField input11 = new TextField();
        pane3.add(input11, 4, 1);
        
        final TextField customTFLabel8 = new TextField();
        customTFLabel8.setText("Untitled");
        pane3.add(customTFLabel8, 3, 2);
        customTFLabel8.setAlignment(Pos.CENTER);
        customTFLabel8.getStyleClass().add("tf");
        
        final TextField input12 = new TextField();
        pane3.add(input12, 4, 2);
        
        final TextField customTFLabel9 = new TextField();
        customTFLabel9.setText("Untitled");
        pane3.add(customTFLabel9, 3, 3);
        customTFLabel9.setAlignment(Pos.CENTER);
        customTFLabel9.getStyleClass().add("tf");
        
        final TextField input13 = new TextField();
        pane3.add(input13, 4, 3);
        
        final TextField customTFLabel10 = new TextField();
        customTFLabel10.setText("Untitled");
        pane3.add(customTFLabel10, 3, 4);
        customTFLabel10.setAlignment(Pos.CENTER);
        customTFLabel10.getStyleClass().add("tf");
        
        final TextField input14 = new TextField();
        pane3.add(input14, 4, 4);
        
        final TextField customTFLabel11 = new TextField();
        customTFLabel11.setText("Untitled");
        pane3.add(customTFLabel11, 3, 5);
        customTFLabel11.setAlignment(Pos.CENTER);
        customTFLabel11.getStyleClass().add("tf");
        
        final TextField input15 = new TextField();
        pane3.add(input15, 4, 5);
        
        final TextField customTFLabel12 = new TextField();
        customTFLabel12.setText("Untitled");
        pane3.add(customTFLabel12, 3, 6);
        customTFLabel12.setAlignment(Pos.CENTER);
        customTFLabel12.getStyleClass().add("tf");
        
        final TextField input16 = new TextField();
        pane3.add(input16, 4, 6);
        
        final TextField customTFLabel13 = new TextField();
        customTFLabel13.setText("Untitled");
        pane3.add(customTFLabel13, 3, 7);
        customTFLabel13.setAlignment(Pos.CENTER);
        customTFLabel13.getStyleClass().add("tf");
        
        final TextField input17 = new TextField();
        pane3.add(input17, 4, 7);
        
        final TextField customTFLabel14 = new TextField();
        customTFLabel14.setText("Untitled");
        pane3.add(customTFLabel14, 3, 8);
        customTFLabel14.setAlignment(Pos.CENTER);
        customTFLabel14.getStyleClass().add("tf");
        
        final TextField input18 = new TextField();
        pane3.add(input18, 4, 8);
        
        
        HBox s3Buttons = new HBox();
        s3Buttons.setAlignment(Pos.BOTTOM_CENTER);
        Button scene3to2Button = new Button("Back");
        //Button necAdd = new Button("Add Necessity");
        Button scene3to4Button = new Button("Next");
        s3Buttons.getChildren().addAll(scene3to2Button, scene3to4Button);
        
    	//Go to scene 2
    	scene3to2Button.setOnAction(e -> window.setScene(scene2));
    	
    	//Perform these actions while transferring to scene 5
    	scene3to4Button.setOnAction(new EventHandler<ActionEvent>() {
		    @Override // Override the handle method
		    public void handle(ActionEvent e) {
		    	try {
		    		amtList.set(0, (Double.parseDouble(input1.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(0, 0.0);
		    	}
		    	try {
			    	amtList.set(1, (Double.parseDouble(input2.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(1, 0.0);
		    	}
		    	try {
			    	amtList.set(2, (Double.parseDouble(input3.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(2, 0.0);
		    	}
		    	try {
			    	amtList.set(3, (Double.parseDouble(input4.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(3, 0.0);
		    	}
		    	try {
			    	amtList.set(4, (Double.parseDouble(input5.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(4, 0.0);
		    	}
		    	try {
			    	amtList.set(5, (Double.parseDouble(input6.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(5, 0.0);
		    	}
		    	try {
			    	amtList.set(6, (Double.parseDouble(input7.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(6, 0.0);
		    	}
		    	try {
			    	amtList.set(7, (Double.parseDouble(input8.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(7, 0.0);
		    	}
		    	try {
			    	amtList.set(8, (Double.parseDouble(input9.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(8, 0.0);
		    	}
		    	try {
			    	amtList.set(9, (Double.parseDouble(input10.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(9, 0.0);
		    	}
		    	try {
			    	amtList.set(10, (Double.parseDouble(input11.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(10, 0.0);
		    	}
		    	try {
			    	amtList.set(11, (Double.parseDouble(input12.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(11, 0.0);
		    	}
		    	try {
			    	amtList.set(12, (Double.parseDouble(input13.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(12, 0.0);
		    	}
		    	try {
			    	amtList.set(13, (Double.parseDouble(input14.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(13, 0.0);
		    	}
		    	try {
			    	amtList.set(14, (Double.parseDouble(input15.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(14, 0.0);
		    	}
		    	try {
			    	amtList.set(15, (Double.parseDouble(input16.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(15, 0.0);
		    	}
		    	try {
			    	amtList.set(16, (Double.parseDouble(input17.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(16, 0.0);
		    	}
		    	try {
			    	amtList.set(17, (Double.parseDouble(input18.getText())));
		    	}
		    	catch (NumberFormatException nfe) {
		    	    amtList.set(17, 0.0);
		    	}
			    try {
			    	customTFList.set(0, customTFLabel1.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(0, "untitled");
			    }
			    try {
			    	customTFList.set(1, customTFLabel2.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(1, "untitled");
			    }
			    try {
			    	customTFList.set(2, customTFLabel3.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(2, "untitled");
			    }
			    try {
			    	customTFList.set(3, customTFLabel4.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(3, "untitled");
			    }
			    try {
			    	customTFList.set(4, customTFLabel5.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(4, "untitled");
			    }
			    try {
			    	customTFList.set(5, customTFLabel6.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(5, "untitled");
			    }
			    try {
			    	customTFList.set(6, customTFLabel7.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(6, "untitled");
			    }
			    try {
			    	customTFList.set(7, customTFLabel8.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(7, "untitled");
			    }
			    try {
			    	customTFList.set(8, customTFLabel9.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(8, "untitled");
			    }
			    try {
			    	customTFList.set(9, customTFLabel10.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(9, "untitled");
			    }
			    try {
			    	customTFList.set(10, customTFLabel11.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(10, "untitled");
			    }
			    try {
			    	customTFList.set(11, customTFLabel12.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(11, "untitled");
			    }
			    try {
			    	customTFList.set(12, customTFLabel13.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(12, "untitled");
			    }
			    try {
			    	customTFList.set(13, customTFLabel14.getText());
			    }
			    catch(NumberFormatException nfe) {
			    	customTFList.set(13, "untitled");
			    }
		    	window.setScene(scene4);
		    }
	    });
    	
    	//Layout 3 - children are laid out in vertical column
    	VBox layout3 = new VBox(15);
    	layout3.getChildren().addAll(question3, hint3, pane3, s3Buttons);
    	layout3.getStyleClass().add("bg");
    	layout3.getStylesheets().add("style3.css");
    	scene3 = new Scene(layout3, 1200, 800);
    	
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    	Button displayResults = new Button("Display Results");
    	VBox layout4 = new VBox(15);
    	
    	HBox s4Buttons = new HBox();
        s4Buttons.setAlignment(Pos.BOTTOM_CENTER);
        Button scene4to3Button = new Button("Back");
        s4Buttons.getChildren().add(scene4to3Button);
        
      //Go to scene 3
    	scene4to3Button.setOnAction(e -> window.setScene(scene3));
    	
    	displayResults.setOnAction(new EventHandler<ActionEvent>() {
		    @Override // Override the handle method
		    public void handle(ActionEvent e) {
		    	
		    	if(userInput - ( amtList.get(0) + amtList.get(1) + amtList.get(2) + amtList.get(3) + amtList.get(4)
		    	+ amtList.get(5) + amtList.get(6) + amtList.get(7) + amtList.get(8) + amtList.get(9) + amtList.get(10) + amtList.get(11) + amtList.get(12) 
		    	+ amtList.get(13) + amtList.get(14) + amtList.get(15) + amtList.get(16) + amtList.get(17) ) < 0) {
		    		Text results = new Text ("Unfortunately, your budget plan will not work. Your planned expenditures\n exceed your income over the budget period. "
		    				+ "It is recommended that you first\n list expenditures for things that are absolutely necessary for you to pay during\n your budget period."
		    				+ "Once you do that, view your budget plan outcome - If it\n works, then slowly add in your non-necessary expenditures for that period.");
		    		results.setStyle("-fx-font: 30 arial;");
		    		layout4.getChildren().add(results);
		    	}
		    	else {
		    	
		    	PieChart pieChart = new PieChart();
		    	
		    	if(amtList.get(0) != 0.0) {
		    		PieChart.Data slice1 = new PieChart.Data("Rent", amtList.get(0));
		    		pieChart.getData().add(slice1);
		    	}
		    	if(amtList.get(1) != 0.0) {
		    		PieChart.Data slice2 = new PieChart.Data("Groceries", amtList.get(1));
		    		pieChart.getData().add(slice2);
		    	}
		    	if(amtList.get(2) != 0.0) {
		    		PieChart.Data slice3 = new PieChart.Data("Gas", amtList.get(2));
		    		pieChart.getData().add(slice3);
		    	}
		    	if(amtList.get(3) != 0.0) {
		    		PieChart.Data slice4 = new PieChart.Data("Dining out", amtList.get(3));
		    		pieChart.getData().add(slice4);
		    	}
		    	if(amtList.get(4) != 0.0) {
		    		PieChart.Data slice5 = new PieChart.Data(customTFList.get(0), amtList.get(4));
		    		pieChart.getData().add(slice5);
		    	}
		    	if(amtList.get(5) != 0.0) {
		    		PieChart.Data slice6 = new PieChart.Data(customTFList.get(1), amtList.get(5));
		    		pieChart.getData().add(slice6);
		    	}
		    	if(amtList.get(6) != 0.0) {
		    		PieChart.Data slice7 = new PieChart.Data(customTFList.get(2), amtList.get(6));
		    		pieChart.getData().add(slice7);
		    	}
		    	if(amtList.get(7) != 0.0) {
		    		PieChart.Data slice8 = new PieChart.Data(customTFList.get(3), amtList.get(7));
		    		pieChart.getData().add(slice8);
		    	}
		    	if(amtList.get(8) != 0.0) {
		    		PieChart.Data slice9 = new PieChart.Data(customTFList.get(4), amtList.get(8));
		    		pieChart.getData().add(slice9);
		    	}
		    	if(amtList.get(9) != 0.0) {
		    		PieChart.Data slice10 = new PieChart.Data(customTFList.get(5), amtList.get(9));
		    		pieChart.getData().add(slice10);
		    	}
		    	
		    	if(amtList.get(10) != 0.0) {
		    		PieChart.Data slice11 = new PieChart.Data(customTFList.get(6), amtList.get(10));
		    		pieChart.getData().add(slice11);
		    	}
		    	if(amtList.get(11) != 0.0) {
		    		PieChart.Data slice12 = new PieChart.Data(customTFList.get(7), amtList.get(11));
		    		pieChart.getData().add(slice12);
		    	}
		    	if(amtList.get(12) != 0.0) {
		    		PieChart.Data slice13 = new PieChart.Data(customTFList.get(8), amtList.get(12));
		    		pieChart.getData().add(slice13);
		    	}
		    	if(amtList.get(13) != 0.0) {
		    		PieChart.Data slice14 = new PieChart.Data(customTFList.get(9), amtList.get(13));
		    		pieChart.getData().add(slice14);
		    	}
		    	if(amtList.get(14) != 0.0) {
		    		PieChart.Data slice15 = new PieChart.Data(customTFList.get(10), amtList.get(14));
		    		pieChart.getData().add(slice15);
		    	}
		    	if(amtList.get(15) != 0.0) {
		    		PieChart.Data slice16 = new PieChart.Data(customTFList.get(11), amtList.get(15));
		    		pieChart.getData().add(slice16);
		    	}
		    	if(amtList.get(16) != 0.0) {
		    		PieChart.Data slice17 = new PieChart.Data(customTFList.get(12), amtList.get(16));
		    		pieChart.getData().add(slice17);
		    	}
		    	if(amtList.get(17) != 0.0) {
		    		PieChart.Data slice18 = new PieChart.Data(customTFList.get(13), amtList.get(17));
		    		pieChart.getData().add(slice18);
		    	}
		    	
		    	PieChart.Data leftoverSlice = new PieChart.Data("Leftover", userInput - ( amtList.get(0) + amtList.get(1) + amtList.get(2) + amtList.get(3) + amtList.get(4)
		    	+ amtList.get(5) + amtList.get(6) + amtList.get(7) + amtList.get(8) + amtList.get(9) + amtList.get(10) + amtList.get(11) + amtList.get(12) 
		    	+ amtList.get(13) + amtList.get(14) + amtList.get(15) + amtList.get(16) + amtList.get(17) ) );
	    		pieChart.getData().add(leftoverSlice);
	    		
		    	//chart.setLegendSide(Side.LEFT);
		        pieChart.setTitle("Results");
		        layout4.getChildren().add(pieChart);
		        
		        //Have the pie chart display the percentage when you click on a slice
		        //Did not have adequate time to add this feature into the final display
/*		        final Label caption = new Label("");
		        caption.setTextFill(Color.DARKORANGE);
		        caption.setStyle("-fx-font: 24 arial;");

		        for (final PieChart.Data data : pieChart.getData()) {
		        pieChart.setOnMouseClicked(f -> {
		            if (f.getButton() == MouseButton.PRIMARY) {
		            	 double total = userInput;
		                //    for (PieChart.Data d : pieChart.getData()) {
		                //    	System.out.println(d.getPieValue());
		                //        total += d.getPieValue();
		                //    }
		            	 	System.out.println(data.getPieValue());
		                    caption.setTranslateX(f.getSceneX());
		                    caption.setTranslateY(f.getSceneY());
		                    String text = String.format("%.1f%%", 100*data.getPieValue()/total) ;
		                    caption.setText(text);
		            }
		          });
		        }
		        layout4.getChildren().add(caption);
*/
		      }
		    }
    	});
    
    	
        layout4.getChildren().add(displayResults);
        layout4.getStyleClass().add("bg");
    	layout4.getStylesheets().add("style4.css");
        scene4 = new Scene(layout4, 1200, 800);
    	
    	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	window.setScene(scene1); //display scene 1 first
    	window.setTitle("Final Project");
    	window.show(); //display window
    	
	}

}