package com.fundamentos.springboot.Fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTickerUSA implements IComponentTickets{
    @Override
    public void ticketCompra(String articulo, double precio) {
        System.out.println("Poduct : " + articulo);
        System.out.println("Total : " + precio);
    }

    @Override
    public void pagoTarjetas(String Usuario, int NumeroTarjeta) {
        System.out.println("user payment: " + Usuario);
        System.out.println("Payment of the card number: " + NumeroTarjeta);
    }
}
