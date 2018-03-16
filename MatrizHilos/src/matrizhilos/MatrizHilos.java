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
public class MatrizHilos {
    
 public void mostrarMatriz(int result[][]){
        for (int i = 0; i < result.length; i++) {
            for(int j=0;j<result[i].length;j++){
                System.out.println(result[i][j]);
            }
            
        }
    }
    
    public static void main(String[] args) {
        CubbyHole c=new CubbyHole();
        int numero = 1;
       int [][] m1 = {{6,0}, {3, 8}};
       int [][] m2 = {{6,7}, {2, 4}};
       

       
       int filasm1=m1.length;
       int colm1=m1[0].length;
       
       
       int filasm2=m2.length;
       int colm2=m2[0].length;
        int[][] resultado=new int[filasm1][colm2];       
      
        //hilos
        
       int numhilos=4;
       int [][] mhi1 = {{6,0}, {3, 8}};
       int [][] mhi2 = {{6,7}, {2, 4}};
       
       int filasm1hi=mhi1.length;
       int colm1hi=mhi1[0].length;
       
       int filasm2hi=mhi2.length;
       int colm2hi=mhi2[0].length;
       
       int[][] resultadohi1=new int[4][4];    
           
      
       Hilomatriz2 hilo1= new Hilomatriz2(c, resultadohi1,mhi1,mhi2,numero);
       Hilomatriz2 hilo2= new Hilomatriz2(c,  resultadohi1,mhi1,mhi2,numero);
       Hilomatriz2 hilo3= new Hilomatriz2(c, resultadohi1,mhi1,mhi2,numero);
       Hilomatriz2 hilo4= new Hilomatriz2(c,  resultadohi1,mhi1,mhi2,numero);
       
       int resultop=0;
       
           hilo1.start();
           hilo2.start();
           hilo3.start();
           hilo4.start();
       

        /*for (int p = ; p < resultadohi1.length; p++) {
            int[] is = resultadohi1[p];*/
        
        
        }
        
    }
        
   
   
    


    
