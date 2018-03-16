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
public class CuentaBancaria {
    float saldo;
    String numc;
String[] titular;
boolean tit;
boolean tipodecuenta;
int probcuenta;
    public CuentaBancaria() {
        saldo=3000;
        probcuenta=(int) (Math.random()*2);
        if (probcuenta==0)
            tipodecuenta=true;
        
        //este tipo de cuenta, es una cuenta de ahorro
        else
            tipodecuenta=false;
    }

    public CuentaBancaria(float saldo, String numc, boolean tit) {
        this.saldo = saldo;
        this.numc = numc;
        this.tit = tit;
    }
    
    public boolean gettipodecuenta() {
        return tipodecuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void añadirSaldo(float saldo) {
        this.saldo = saldo+this.saldo;
    }
 public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
 public void retirarDinero(float saldo) {
        this.saldo = saldo-this.saldo;
    }
    public String getNumc() {
        return numc;
    }

    public void setNumc(String numc) {
        this.numc = numc;
    }

    public boolean isTit() {
        return tit;
    }

    public void setTit(boolean tit) {
        this.tit = tit;
    }
    public void Transferencia(double cantidad){
        if (cantidad>saldo)
            System.out.println("No tienes tanta pasta haha");
        else 
            saldo -=cantidad;
    }
    public void recibirTransferencia(double cantidad){
        saldo+=cantidad;
    }
}
