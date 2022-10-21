
package superclase.xd;

import javax.swing.JOptionPane;

public class Manuel extends SUPERCLASEXD{
    
    private String discografica;
    
    public Manuel(String genero, String autor, String titulo) {
        super(genero, autor, titulo);
        
        genero = JOptionPane.showInputDialog("Genero: ");
        autor = JOptionPane.showInputDialog("Autor: ");
        titulo = JOptionPane.showInputDialog("Titulo: ");
        discografica = JOptionPane.showInputDialog("Discografica: ");

    }
    
    public void setDiscografica (String discografica){
        
        this.discografica = discografica;
    }
    
    public String getDiscografico(){
        return discografica;
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"El genero es: " + getGenero() + "El autor es: " + getAutor() + "El titulo es: " + getTitulo() + "La dsicografica es: " + getDiscografico());
    }
            
   
  
        
    
}
