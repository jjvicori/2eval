
package proghilos;

import static java.lang.Thread.sleep;


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