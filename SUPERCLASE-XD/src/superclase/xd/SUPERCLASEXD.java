
package superclase.xd;

//<<<<<<< HEAD
//=======
import javax.swing.JOptionPane;

/**
 *
 * @author cante
 */
//>>>>>>> 27c6afe7e9b15b93c3ec2f08b3ca88092ccbc13e
public class SUPERCLASEXD {

     private String genero;
    
      private String autor;
      private String titulo;
      
       public SUPERCLASEXD( String genero,String autor,String titulo){
           this. genero=genero;
                   this.autor=autor;
                   this.titulo=titulo;
       }

    SUPERCLASEXD() {
         }
      
       public String getGenero(){return genero;}
         public String getAutor(){return autor;}
           public String getTitulo(){return titulo;}
//<<<<<<< HEAD
    
}
//=======
  /*  public static void main(String[] args) {
        Caro caro= new Caro(JOptionPane.showInputDialog("Ingrese el genero del disco"), JOptionPane.showInputDialog("Ingrese Autor del disco "),
                JOptionPane.showInputDialog("Ingrese el Titulo "));
        
        caro.mostrarAtrib();
        
    }
}
>>>>>>> 27c6afe7e9b15b93c3ec2f08b3ca88092ccbc13e*/
