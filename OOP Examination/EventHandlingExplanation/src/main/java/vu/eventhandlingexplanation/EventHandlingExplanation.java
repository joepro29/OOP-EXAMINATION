/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.eventhandlingexplanation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlingExplanation {
    
    @Override
    public void start(Stage primaryStage) {
        // Explanation of event registration and handling process
        System.out.println("=== EVENT HANDLING PROCESS IN JAVA GUI ===");
        System.out.println("\n1. EVENT REGISTRATION PROCESS:");
        System.out.println("   - Create the GUI component (e.g., Button)");
        System.out.println("   - Implement EventHandler interface for the specific event type");
        System.out.println("   - Register the handler with the component using setOnAction()");
        System.out.println("   - When event occurs, JavaFX runtime calls the handle() method");
        
        System.out.println("\n2. EVENT HANDLING STEPS:");
        System.out.println("   a) Event Source: Component that generates the event (Button)");
        System.out.println("   b) Event Object: Contains event details (ActionEvent)");
        System.out.println("   c) Event Handler: Code that responds to the event");
        System.out.println("   d) Registration: Linking handler to source component");
        
        // Practical demonstration
        Button demoButton = new Button("Click Me to See Event Handling");
        
        // EVENT REGISTRATION: Using anonymous inner class (as shown in notes)
        demoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("\n✅ EVENT HANDLED: Button was clicked!");
                System.out.println("   - Event Source: " + event.getSource());
                System.out.println("   - Event Type: " + event.getEventType());
                System.out.println("   - Handler executed successfully");
            }
        });
        
        // Alternative using lambda expression (modern approach)
        Button lambdaButton = new Button("Lambda Event Handler");
        lambdaButton.setOnAction(event -> {
            System.out.println("✅ Lambda handler executed!");
        });
        
        VBox root = new VBox(10, demoButton, lambdaButton);
        Scene scene = new Scene(root, 400, 200);
        
        primaryStage.setTitle("Event Handling Demonstration");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
