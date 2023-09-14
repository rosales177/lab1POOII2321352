/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.strategy.clases;

/**
 *
 * @author rosales1015
 */
public interface PaymentStrategy {
    double pay(double amount);
}
// Implementaciones de las estrategias de pago
class VisaPayment implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public VisaPayment(String cardNumber, String cvv, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public double pay(double amount) {
        double totalAmount = amount + (amount * 0.07);
        // Aquí podrías realizar el procesamiento de pago con Tarjeta de Crédito VISA
        return totalAmount;
    }
}

class YapePayment implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        if (amount > 1000.0) {
            return amount - (amount * 0.07);
        } else {
            return amount;
        }
    }
}

class PlinPayment implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        double totalAmount = amount - (amount * 0.05);
        // Aquí podrías realizar el procesamiento de pago con Plin
        return totalAmount;
    }
}

class DebitCardPayment implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        // No se aplica ningún descuento para Tarjeta de Débito
        return amount;
    }
}