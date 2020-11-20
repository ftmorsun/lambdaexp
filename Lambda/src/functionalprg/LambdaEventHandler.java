/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package functionalprg;

import com.sun.java.swing.action.ApplyAction;

/**
 *
 * @author Producer
 */
public class LambdaEventHandler extends ApplyAction {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        //inner class
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        // btn.setOnAction( event -> System.out.println("Hello World!"));
        
        /* code for EventHandler Interface: 
           public interface ActionListener extends EventListener {   
           public void actionPerformed(ActionEvent e);
           }
        */
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
