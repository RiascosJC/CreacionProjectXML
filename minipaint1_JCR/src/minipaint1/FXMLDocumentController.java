/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint1;




import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author juan.Riascos
 */
public class FXMLDocumentController implements Initializable {
    
     // Valores del triangulo //
    
        double x[] = {100, 150, 50};
        double y[] = {100, 210, 210, 50};
    
    
    @FXML
    private Canvas lienzo;
    private GraphicsContext g;
   
     // Creaccion de Formas por menu // 
    
    @FXML 
    private void crearCuadrado(ActionEvent event) {
      
       g.setStroke(Color.ROYALBLUE);
       g.strokeRect(10, 45, 45, 45);
             
    }
    
       @FXML
    private void crearCirculo(ActionEvent event) {
        
       g.setFill(Color.GREENYELLOW);
       g.fillOval(150, 70, 90, 90);
    }
    
    @FXML
    private void crearTriangulo(ActionEvent event) {
      
           // Valores del triangulo //
    
        double x[] = {100, 150, 50};
        double y[] = {100, 210, 210, 50};
        
        g.setFill(Color.GOLD);
        g.fillPolygon(x, y, 3);
    }
    
    
    @FXML
    private void transicionC(ActionEvent event){
        
      PathTransition transition = new PathTransition();
      transition.setNode(cr);
      transition.setDuration(javafx.util.Duration.seconds(5));
      transition.setPath(cr);
      transition.setCycleCount(PathTransition.INDEFINITE);
      transition.play();
    }
    
    @FXML
    Circle cr;
    Polygon z;
    
    
     // Creaccion de Formas por click //
   
     
     
     
     // Cambio de color aleatorio //
      
     @FXML
     private void CambiarColor(ActionEvent event){
         
         
         
      g.setFill(Color.rgb((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255)));
      g.fillPolygon(x, y, 3);       // Triangulo //
      g.fillOval(150, 70, 90, 90);  // Circulo //
      g.strokeRect(10, 45, 45, 45); // Cuadrado todavia no funciona //
      
       
     }
     
        // Borrado del canva //
     
     @FXML
     private void Delete (ActionEvent event){
         
        g.clearRect(5, 5, 350, 250);
       
     }
     
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // Creaccion del lienzo //
        
        g=lienzo.getGraphicsContext2D();
        
        
        double w = lienzo.getWidth();
        double h = lienzo.getHeight();
        
        g.setStroke(Color.RED);
        g.setLineWidth(3);
        g.strokeRect(0, 0, w, h);
        
     
        
     
     
        
     
     
 
    
    
    
    
    
    
     
        
    }    
    
   
    
}
