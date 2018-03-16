/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizhilos;

/**
 *
 * @author josej
 */
public class Hilomatriz2 extends Thread {
    private CubbyHole cubbyhole;
    int d;
   private int[][] a;
     private int[][] m1;
      private int[][] m2;
    public Hilomatriz2(CubbyHole c, int[][] resultado,int[][] m1,int[][] m2,int d){
           cubbyhole = c;
               a = resultado; // retardo aplicado al productor
               this.m1=m1;
               this.m2=m2;
               this.d=d;
    }
    

   
    
    @Override
     public void run(){	
      //matriz multiplicacion

        for (int i = 0; i < 2; i++) {
            for(int j=0;j<2;j++){
                
                    
                    a[i][j]+=m1[i][j]*m2[j][i];
                    System.out.print(a[i][j]+" ");
                    
            }
            System.out.println();
                
        }
                    try {
                     sleep(d);
                    }   
                    catch (InterruptedException e) {
                        System.out.println("problem"+e);}
        }
    }
    





