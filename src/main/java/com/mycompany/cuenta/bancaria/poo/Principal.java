package com.mycompany.cuenta.bancaria.poo;

public class Principal {
    public static void main(String[] args) {
        // TODO: Adiciona aquí el código que deseas para la Cuenta Bancaria.
        CuentaBancaria c1 = new CuentaBancaria("Julian", "123456789", 2000000);
        System.out.println(c1.calcularInteres(2000000, 8));
        
         CuentaBancaria c2 = new CuentaBancaria("Diego", "123456788", 2000000);
        System.out.println(c1.calcularInteres(2000000, 15));
    }
}
