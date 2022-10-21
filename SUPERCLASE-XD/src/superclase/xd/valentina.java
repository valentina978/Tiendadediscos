
package superclase.xd;

import javax.swing.JOptionPane;

public class valentina extends SUPERCLASEXD{
    private String disquera; 


 
 
    public valentina(String genero, String autor, String titulo) {
        super(genero, autor, titulo);
        
        genero=JOptionPane.showInputDialog(null,"dame el genero del disco");
        autor=JOptionPane.showInputDialog(null,"dame el autor del disco ");
        titulo=JOptionPane.showInputDialog(null,"dame el titulo del disco ");
        
        
    }
    
     public void setdisquera(String disquera) {
         
         this.disquera=disquera;}
         
          public String getdisquera() {
     
      
      return disquera;
  }
          
          public void mostrata(){
              JOptionPane.showMessageDialog(null,"el genero del disco es "+getGenero()+"el autor del disco es "+getAutor()+"el titulo del disco es "+getTitulo());
          }
          
          
          
            
         
     }    
       
         
       
        
  
   
   

 
