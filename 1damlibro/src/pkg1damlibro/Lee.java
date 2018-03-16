
package pkg1damlibro;

import static java.lang.Thread.sleep;


public class Lee extends Thread {  
    private Contenedor contenedor;
    private int numero;
 //Constructor por parametros
    public Lee(Contenedor e,int numero) {
        this.numero = numero;
        this.contenedor=e;
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < 20; i++) {
            String num_lectores[] = new String[i];
            
            /*if(contenedor.get().replace("null","")!=null)*/
            System.out.println("Lector "+i+" lee : "+contenedor.get()); 
                try {
                        sleep(numero);
                        }   
                        catch (InterruptedException e) {
                            System.out.println("problem"+e);}
            }

        }

    private void replace(String anull, String _) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

