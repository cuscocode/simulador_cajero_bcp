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
public class PruebaEjecucion {
    
    public static void main(String[] args){
        
        //Variables
        double saldo;
        //datos
        //Proceso
        
        ProcesoATM service = new ProcesoATM();
        
        //Obtener saldo
        
        saldo = service.obtnersaldo();
        System.out.println("Saldo inical: "+ saldo);
        
        //Realiza retiro
        service.RealizarRetiro(20);
        System.out.println("Retiro: "+ 20);
        
        saldo = service.obtnersaldo();
        System.out.println("Saldo luego del retiro: "+ saldo);
        
        //Realizar deposito
        
        service.RealizarDeposito(100);
        System.out.println("Depósito:  "+ 100);
        saldo= service.obtnersaldo();
        System.out.println("Saldo luego del depósito: "+ saldo);
        
 
//    return String.format("%.2f", (float) number);
        String numeroFormateado = String.format("%,.2f", saldo);
        System.out.println("Saldo luego del depósito: "+ numeroFormateado);
        
    }
    
}
