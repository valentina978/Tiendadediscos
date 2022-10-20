/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclase.xd;

import javax.swing.JOptionPane;

/**
 *
 * @author cante
 */
public class SUPERCLASEXD {

    /**
     * @param args the command line arguments
     */
     private String genero;
    
      private String autor;
      private String titulo;
      
       public SUPERCLASEXD( String genero,String autor,String titulo){
           this. genero=genero;
                   this.autor=autor;
                   this.titulo=titulo;
       }
      
       public String getGenero(){return genero;}
         public String getAutor(){return autor;}
           public String getTitulo(){return titulo;}
    public static void main(String[] args) {
        Caro caro= new Caro(JOptionPane.showInputDialog("Ingrese el genero del disco"), JOptionPane.showInputDialog("Ingrese Autor del disco "),
                JOptionPane.showInputDialog("Ingrese el Titulo "));
        
        caro.mostrarAtrib();
        
    }
}