
package ordenarfichero;

import java.io.*;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarFichero{
    
  

    public static void main(String[] args) throws IOException  {
        String ruta,cadena; 
        ruta= "src/ordenarfichero/ficherolectura.txt";
          String mensajeExcepcion = "Ruta incorrecta, introduzca ruta correcta: ";
        String linea = leeFichero(ruta, mensajeExcepcion);
        String[] lineas=linea.split("\n");
       String[] a= ordenar(lineas);
         muestraArray(a);
       /* try{
            // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
        File  al = new File (ruta);
            FileReader f = new FileReader(al);
            BufferedReader b = new BufferedReader(f);
           ArrayList<String> arrayList = new ArrayList<String>();
            while((cadena = b.readLine())!=null) {
                arrayList.add(cadena);
            }
            b.close();
            String temp;
            for(int i=1;i < arrayList.size();i++){
            for (int j=0 ; j < arrayList.size()- 1; j++){
                if (arrayList.get(j).length() > arrayList.get(j+1).length()){
                    temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                    
                }
                else if(arrayList.get(j).length() > arrayList.get(j+1).length()){
                    boolean a=false;
                    String l=arrayList.get(j),l1=arrayList.get(j+1);
                    for(int k=0;k<arrayList.get(j).length();k++)
                        if(l.charAt(k)>l1.charAt(k))
                            a=true;
                    if(a==true){
                         temp = arrayList.get(j);
                            arrayList.set(j,arrayList.get(j+1));
                            arrayList.set(j+1,temp);
                    }
                        
                }
                
            }
            }*/
          
       
    }
    public static String leeFichero(String rutaFichero, String mensajeExcepcion){        
        Scanner lecturaScanner = null;                        
        Scanner rutaScanner = null;
        while(lecturaScanner==null){
            try{            
                lecturaScanner = new Scanner(new FileInputStream(rutaFichero));
            }
            catch(FileNotFoundException ex){
                System.out.println(mensajeExcepcion);
                rutaScanner = new Scanner(System.in);
                rutaFichero = rutaScanner.nextLine();
            }       
        }
        
        String linea = "";
        while(lecturaScanner.hasNext()){
            linea += lecturaScanner.nextLine();
            linea += "\n";
        }
        lecturaScanner.close();  
        if(rutaScanner!=null)   rutaScanner.close();
        return linea;
    }
   public static void muestraArray(String[] a) throws IOException {
       System.out.println("El array ordenado");
        for(int i=0;i<a.length;i++)
            System.out.println("En la posicion "+i+" es:"+a[i]);
    }
   public static String[] ordenar(String[] lista2){
       String temp;
       for(int i=1;i < lista2.length ;i++){
            for (int j=0 ; j < lista2.length - 1; j++){
                if (lista2[j].length() > lista2[j+1].length()){
                    temp = lista2[j];
                    lista2[j]=lista2[j+1];
                    lista2[j+1]=temp;
                    
                }
                else if(lista2[j].length() == lista2[j+1].length()){
                    boolean a=false;
                    String l=lista2[j],l1=lista2[j+1];
                    for(int k=0;k<l.length();k++){
                        
                        if(k>0)
                        if(l.charAt(k)>l1.charAt(k) && l.charAt(k-1)>l1.charAt(k-1)){
                            a=true;
                        }
                           else if(l.charAt(k)>l1.charAt(k))
                             a=true;
                    if(a==true){
                         temp = lista2[j];
                            lista2[j]=lista2[j+1];
                            lista2[j+1]=temp;
                            a=false;
                    }}
                        
                }
                
            }
           
            
      
   }
         return lista2;
}
}
    

