/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingrese el nombre del cliente");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el total a pagar");
        Double total = Double.parseDouble(entrada.next());
        System.out.println("Elija su metodo de pago");
        System.out.println("1. Efectivo");
        System.out.println("2. Paypal");
        System.out.println("3. Tarjeta de credito");
        System.out.println("4. Tarjeta de debito");
        System.out.println("");
        int opcion = entrada.nextInt();
        
        MetodoPago mp = new MetodoPago();
        Pago pago = null;
        
        switch (opcion){
            case 1:
                pago = mp.CrearPago("Efectivo");
                break;
            case 2:
                pago = mp.CrearPago("Paypal");
                break;
            case 3:
                pago = mp.CrearPago("TarjetaCredito");
                break;
            case 4:
                pago = mp.CrearPago("TarjetaDebito");
                break;
        }

        pago.RealizarPago(total);
        pago.EntregarFactura(total, nombre);
    }
    
}