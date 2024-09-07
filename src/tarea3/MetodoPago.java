/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author PC
 */
public class MetodoPago {
    
    public Pago CrearPago(String tipo){
            
        if (tipo.equals("Paypal")){
            return new Paypal();
        } else if (tipo.equals("TarjetaCredito")){
            return new TarjetaCredito();
        } else if (tipo.equals("TarjetaDebito")){
            return new TarjetaDebito();
        } else if (tipo.equals("Efectivo")){
            return new Efectivo();
        } else {
            return new Pago() {

                @Override
                public void RealizarPago(Double total) {
                    System.out.println("No exite el metodo de pago");
                }

                @Override
                public void EntregarFactura(Double total, String nombreCliente) {
                                System.out.println("");
                }
            };
        }
    }
}
     