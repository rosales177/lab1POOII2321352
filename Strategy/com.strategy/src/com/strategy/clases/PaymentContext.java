/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.strategy.clases;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    private String customerName;
    private String paymentMethod;

    public PaymentContext(PaymentStrategy paymentStrategy, String customerName, String paymentMethod) {
        this.paymentStrategy = paymentStrategy;
        this.customerName = customerName;
        this.paymentMethod = paymentMethod;
    }

    public double processPayment(double productPrice) {
        return paymentStrategy.pay(productPrice);
    }

    public String getPaymentDetails() {
        return "Nombre del cliente: " + customerName + "\nMetodo de Pago: " + paymentMethod;
    }
}
    

