/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author Eli
 */
public class ProcesoATM {
    
    private double saldo =5200;
    
    public double obtnersaldo(){
        dosDec(saldo);
        return saldo;
    }
    
    public boolean RealizarDeposito(int valor){
        saldo+= valor;
        return true;
    }
    
    public boolean RealizarRetiro(int valor){
        saldo-= valor;
        return true;
    }
    
    
    private double dosDec(double valor){
        valor=valor*100;
        valor=Math.round(valor);
        valor=valor/100;
        return valor;
    }
    
    
    public static String DosDecimales(int numero) {
//    return String.format("%.2f", (float) number);
    String numeroFormateado = String.format("%,.2f", numero);
        return numeroFormateado;
}
    
    
}
