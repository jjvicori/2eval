/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author josej
 */
public class Cli extends Thread{
    private Clientes cliente;
    private int numero;
    long tiempoInicio;
    
    public Cli(Clientes c,int n){
        cliente=c;
        numero=n;
    }
    public Cli(){
        cliente=new Clientes(1);
    }
    public void run(){
             tiempoInicio= System.currentTimeMillis();
             double value,cuentaa0;
             int val;
             int rand;//Este valor va a coger un numero aleatorio para hacer la transferencia de una cuenta a otra
             do{
             /*
             Guardamos numero de cuentas en la variable n.
             Nos quedamos con el entero anteior generado y lo almacenamos en "val"
             Finalmente trabajamos con ndecuentabancaria en la posicion aleatoria
             */
             CuentaBancaria c=new CuentaBancaria();
             int n=cliente.getN_cuentas();
             cuentaa0=n;
             
              val = (int) Math.floor(Math.random()*n);
             
              System.out.println("valor "+val);
            // c= cliente.getCbank(val);
            
            
             do{ 
         long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        //Trabajamos de forma aleatoria con las distintas opciones del menu
         value = Math.random()*(40);
               
         
         
         if(totalTiempo>12000){
             int nt=(int)totalTiempo-12000;
             if(nt>1000 && nt<14000){
                 
                int ns=(int)nt/1000;
             if (c.gettipodecuenta())
                 c.setSaldo((float)0.25*c.getSaldo()*ns);
             else
                 c.setSaldo((float)0.1*c.getSaldo()*ns);
             }
                 
         }
             
         
        if (value>=0 && value<10)
                System.out.println("El dinero que tienes: "+c.getSaldo());
        else if (value>=10 && value<20){
            double  valu =  Math.floor(Math.random()*100);
            System.out.println("El cliente ha realizado ingreso en la cuenta bancaria "+n+" de  "+(int)valu);
            c.setSaldo((int)valu);
        }
            
        else if(value>=20 && value<30){
            double  valu =  Math.floor(Math.random()*300);
            if(!c.gettipodecuenta()){
            if(totalTiempo>12000){
                System.out.println("El cliente ha retirado en la cuenta bancaria "+n+" "+valu);
                if(c.getSaldo()>valu)
                    c.retirarDinero((int)valu);
                else
                    System.out.println("estas tieso, no tienes");
                }else
                    System.out.println("tu cuenta es de ahorro, no puedes retirar");
            }
            else{
                System.out.println("no puedes hacer retiro jaja");
            }
        }
            
        else if(value>=30 && value<40){
             if(!c.gettipodecuenta()){
             if(totalTiempo>12000){
                double  valu =  Math.floor(Math.random()*100);
               c.Transferencia(valu);
               int n_cuenta_transferida =  (int)Math.floor(Math.random()*cliente.getN_cuentas());
               System.out.println("cuenta transferdau:"+n_cuenta_transferida+" valor:"+valu);
              cliente.getCbank(n_cuenta_transferida).recibirTransferencia(valu);//aqui falla
               System.out.println("El cliente ha realizado transferencia en la cuenta bancaria "+n+" de"+ valu);
             }
             else{
                 System.out.println("no puedes hacer transferencia");
             }}else
                 System.out.println("No puedes, tu cuenta es de tipo ahorro");
               
        }
        
        
    
       
    try {
        sleep(numero);
        } catch (InterruptedException e) {}
    }while(c.getSaldo()>0);
             c.setTit(false);
             cuentaa0--;
             }while(cuentaa0>0);
    }
    
}





/*
public class Consumidor extends Thread {
    private CubbyHole cubbyhole;
    private int numero;
    
    public Consumidor(CubbyHole c, int numero) {
    cubbyhole = c;
    this.numero = numero;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get();
            System.out.println("Consumidor saca:"+value);
            try {
                sleep(numero);
            } catch (InterruptedException e) {
            System.out.println("problem"+e);
        }
    }
}
}
*/
