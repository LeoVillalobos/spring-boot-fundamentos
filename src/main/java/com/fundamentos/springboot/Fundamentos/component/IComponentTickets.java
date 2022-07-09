package com.fundamentos.springboot.Fundamentos.component;

public interface IComponentTickets {

    void ticketCompra (String articulo, double precio);

    void pagoTarjetas (String Usuario, int NumeroTarjeta);
}
