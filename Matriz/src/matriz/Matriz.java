
package matriz;
import java.util.Arrays;

public class Matriz {

    public void mostrarMatriz(int result[][]){
        for (int i = 0; i < result.length; i++) {
            for(int j=0;j<result[i].length;j++){
                System.out.println(result[i][j]);
            }
            
        }
    }

    public static void main(String[] args) {
       
       int [][] m1 = {{6,0}, {3, 8}};
       int [][] m2 = {{6,7}, {2, 4}};
       

       
       int filasm1=m1.length;
       int colm1=m1[0].length;
       
       
       int filasm2=m2.length;
       int colm2=m2[0].length;
        int[][] resultado=new int[filasm1][colm2];       
       ///matriz multiplicacion

        for (int i = 0; i < resultado.length; i++) {
            for(int j=0;j<resultado[i].length;j++){
                for (int k = 0; k < m1.length; k++) {
                   resultado[i][j]+=m1[i][k]*m2[k][j];
                }
                    
            }
                
        }
         for (int i = 0; i < resultado.length; i++) {
            for(int j=0;j<resultado[i].length;j++){
                System.out.println(resultado[i][j]);
            }
        //mostrarMatriz(resultado);
        }
        
    }
        
    }
   
    

