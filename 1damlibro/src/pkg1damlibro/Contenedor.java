
package pkg1damlibro;

import java.util.ArrayList;


public class Contenedor{
    String c;
    
    public Contenedor() {
       
    }

    public Contenedor(char x) {
        c+=x;
    }

     public String get() {
         
            return c;
        
    }
      public void put(char x) {
          c+=x;
        
    }
    
}
