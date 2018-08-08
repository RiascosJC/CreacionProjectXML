/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creararchivosxml;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Empleado;

/**
 *
 * @author juan_camilo.riascos
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lTitulo;
    
    @FXML
    private Label lNombre;
      
    @FXML
    private Label lDirecccion;
    
    @FXML
    private Label lEdad;
    
    @FXML
    private Label lCodigo;
          
    @FXML
    private Label lDepart;
            
    @FXML
    private TextField tNombre;
     
    @FXML
    private TextField tDireccion;
       
    @FXML
    private TextField tEdad;
         
    @FXML
    private TextField tCodigo;
           
    @FXML
    private TextField tDepart;
    
    LinkedList<Empleado> ListaEmpleados;
    
    
    
    @FXML
    private void AggEmpleadoL(ActionEvent event) {
       
     String nombre = tNombre.getText();
     String direccion = tDireccion.getText();
     int edad = Integer.parseInt(tEdad.getText());
     String Codigo = tDepart.getText();
     
     
     Empleado objEmpl = new Empleado(nombre, direccion, edad, Codigo);
     ListaEmpleados.add(objEmpl);
                
        
        
      
        System.out.println("You clicked me!");
        lTitulo.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ListaEmpleados = new LinkedList<>();
        // TODO
    }    
    
}
