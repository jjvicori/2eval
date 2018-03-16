
package pkg1damlibro;

import java.util.Random;

public class Escribe extends Thread{
    private Contenedor contenedor;
    private int numero;

    public Escribe(Contenedor e, int numero) {
        this.contenedor = e;
        this.numero = numero;
    }

    public Contenedor getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override 
    public void run() {   
        int value;
        int aleat=(int)(Math.random()*10);
        //casting de char a string
        for (int i = 0; i < 10; i++) {
           
            value =(int) Math.random()*(30)+65;
            char c = (char)value;
            getContenedor().put(c);
            System.out.println("El escritor "+i+ " escribe: "+getContenedor().get().replace("null", " "));
             try {
                    sleep(getNumero());
                    }   
                    catch (InterruptedException e) {
                        System.out.println("problem"+e);}
        }
        
      
        
    }
}
 

