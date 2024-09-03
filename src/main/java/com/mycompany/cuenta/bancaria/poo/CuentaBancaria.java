package com.mycompany.cuenta.bancaria.poo;

import java.util.Scanner;

public class CuentaBancaria {
    // TODO: Aquí va el código de la clase CuentaBancaria
    Scanner sc = new Scanner(System.in);
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres = 0.015;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Ingresar(double cantidad) {
        cantidad += saldo;

    }

    public void Retirar(double cantidad) {
        if (cantidad < saldo && cantidad >= 0) {
            cantidad -= saldo;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double calcularInteres(double saldo, double tipoInteres) {
        return saldo += saldo*(tipoInteres/100);
    }

    public void setTipoInteres(double tipoInteres) {
        if (tipoInteres<=10) {
          this.tipoInteres = tipoInteres;
        }else {
            System.out.println("El interes no puede ser mayor al 10%");
            this.tipoInteres = 10;
        }
        
    }
    
}
