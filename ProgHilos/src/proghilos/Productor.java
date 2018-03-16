
package proghilos;


public class Productor extends Thread{
            private CubbyHole cubbyhole;
            private int numero;
            public Productor(CubbyHole c, int numero) {
                cubbyhole = c;
                this.numero = numero; // retardo aplicado al productor
            }
            public void run() {
                for (int i = 0; i < 10; i++) {
                    cubbyhole.put(i);
                    System.out.println("Productor pone: " +i);
                    try {
                     sleep(numero);
                    }   
                    catch (InterruptedException e) {
                        System.out.println("problem"+e);}
        }
    }
} 

