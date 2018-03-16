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
public class Clientes {
    
    CuentaBancaria[] cbank;
    int n_cuentas;
    public Clientes(int n) {
        cbank=new CuentaBancaria[n];
        for(int i=0;i<cbank.length;i++)
            cbank[i]=new CuentaBancaria();
        n_cuentas=n;
    }
 public Clientes() {
        cbank=new CuentaBancaria[1];
        n_cuentas=1;
       
    }
    public int getN_cuentas() {
        return n_cuentas;
    }

    public void setN_cuentas(int n_cuentas) {
        this.n_cuentas = n_cuentas;
    }

    public CuentaBancaria getCbank(int n) {
        return cbank[n];
    }

    public void setCbank(CuentaBancaria cbank,int n) {
        this.cbank[n] = cbank;
    }
    
}
