/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclase.xd;

import javax.swing.JOptionPane;

/**
 *
 * @author karol
 */
public class Caro extends SUPERCLASEXD{
    
      private String Formato;
     
      
    
    
     public Caro (String genero, String autor, String titulo) { 
    super(genero, autor, titulo); 
    
   
     genero="";
     autor="";
     titulo="";
     Formato=JOptionPane.showInputDialog("Ingrese El formato ");
 
                  } 
     
     
     public void setFormato (String Formato){
         this.Formato = Formato; } 
     public String getFormato () { return Formato; } 
    
     public void mostrarAtrib() { 
      JOptionPane.showMessageDialog(null,"Genero del disco:" + getGenero() + " Autor del disco " + getAutor() +" Titulo del disco " + getTitulo() + " con Id de profesor: " + getFormato());
     
     }
}
    
    
    

