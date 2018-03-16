/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author josej
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          int g=(int)(Math.random()*8);
          System.out.println("g "+g);
             Clientes c=new Clientes(g);
        Cli cl=new Cli(c,1000);
        cl.start();
        }
        }
    

