/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.strategy.clases;

/**
 *
 * @author rosales1015
 */
public class PlinPayment implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        double totalAmount = amount - (amount * 0.05);
        // Aquí podrías realizar el procesamiento de pago con Plin
        return totalAmount;
    }
}
