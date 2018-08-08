/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author jorge.romero
 */
public class Empleado extends Persona {
    
        private String codigoEmpleado;
        private String departamento;

    public Empleado() {
    }
  
    public Empleado(String codigoEmpleado, String departamento, String nombre, String direccion, int edad) {
        super(nombre, direccion, edad);
        this.codigoEmpleado = codigoEmpleado;
        this.departamento = departamento;
    }

    public Empleado(String nombre, String direccion, int edad, String Codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "El nombre del empleado es:" + super.toString()+ "y" + " su codigo es" + codigoEmpleado +  "y" + "ubicado/a en el departamento:" + departamento ;
    }

    public boolean guardarEmpleados(LinkedList<Empleado> listaEmpleados) {
        
     boolean g = false;
        FileWriter flwriter = null;
        
        try{
            flwriter = new FileWriter("empleados.txt");
            BufferedWriter bfWriter = new BufferedWriter(flwriter);
            
            for (int i = 0; i < listaEmpleados.size(); i++){
                bfWriter.write(listaEmpleados.get(i)+ "\n");
            }
            bfWriter.close();
            System.out.println("archivo creado");
            g = true;
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(flwriter != null){
                try{
                    flwriter.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        
        return g;        
        
        
        
    }



    
}
