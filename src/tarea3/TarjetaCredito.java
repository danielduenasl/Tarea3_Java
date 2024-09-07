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
public class TarjetaCredito implements Pago {

    @Override
    public void RealizarPago(Double total) {
        System.out.println("Se ha realizado un pago con tarjeta de credito por un total de: " + total);
    }

    @Override
    public void EntregarFactura(Double total, String nombreCliente) {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = fechaActual.format(formatoFecha);

        Double precioProductoA = total * 0.5;
        Double precioProductoB = total * 0.5;

        System.out.println("********************************");
        System.out.println("*          FACTURA             *");
        System.out.println("********************************");
        System.out.println("* Fecha: " + fechaFormateada + " *");
        System.out.println("* Cliente: " + nombreCliente + " *");
        System.out.println("*                                *");
        System.out.println("* Descripción           Precio   *");
        System.out.println("* Producto A            $" + String.format("%.2f", precioProductoA) + "   *");
        System.out.println("* Producto B            $" + String.format("%.2f", precioProductoB) + "   *");
        System.out.println("* ------------------------------*");
        System.out.println("*Metodo de pago: Tarjeta de credito*");
        System.out.println("* Subtotal:             $" + String.format("%.2f", total - (total * 0.12)) + "  *");
        System.out.println("* IVA (12%):            $" + String.format("%.2f", total * 0.12) + "   *");
        System.out.println("* Total:                $" + String.format("%.2f", total) + "  *");
        System.out.println("********************************");
        System.out.println("*   ¡Gracias por su compra!     *");
        System.out.println("********************************");
    }

    
}

