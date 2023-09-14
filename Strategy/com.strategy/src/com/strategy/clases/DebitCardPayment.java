/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.strategy.clases;

/**
 *
 * @author rosales1015
 */
public class DebitCardPayment implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        // No se aplica ningún descuento para Tarjeta de Débito
        return amount;
    }
}