package com.fundamentos.springboot.Fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTicketMEX implements  IComponentTickets{
    @Override
    public void ticketCompra(String articulo, double precio) {
        System.out.println("Articulo : " + articulo);
        System.out.println("Total : " + precio);
    }

    @Override
    public void pagoTarjetas(String Usuario, int NumeroTarjeta) {
        System.out.println("PAgo del Usuario: " + Usuario);
        System.out.println("PAgo del Numero de tarjeta: " + NumeroTarjeta);
    }
}
