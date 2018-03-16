
package pkg1damlibro;


public class MainDam {
    
    public static void main(String[] args) {
    
        Contenedor c=new Contenedor(); 
        Escribe escritor=new Escribe(c,1000);
        Lee lector=new Lee(c,1000);
        escritor.start();
        lector.start();
    
    }
    
}
