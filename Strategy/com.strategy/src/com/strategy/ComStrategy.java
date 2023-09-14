/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.strategy;

import com.strategy.clases.DebitCardPayment;
import com.strategy.clases.PaymentContext;
import com.strategy.clases.PaymentStrategy;
import com.strategy.clases.PlinPayment;
import com.strategy.clases.VisaPayment;
import com.strategy.clases.YapePayment;

/**
 *
 * @author rosales1015
 */
public class ComStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaymentStrategy visaPayment = new VisaPayment("1234-5678-9012-3456", "123", "12/25");
        PaymentContext context1 = new PaymentContext(visaPayment, "Cliente 1", "Tarjeta de Crédito VISA");
        double productPrice1 = 1000.0;
        double totalAmount1 = context1.processPayment(productPrice1);
        System.out.println(context1.getPaymentDetails());
        System.out.println("Monto total: " + totalAmount1);

        PaymentStrategy yapePayment = new YapePayment();
        PaymentContext context2 = new PaymentContext(yapePayment, "Cliente 2", "Yape");
        double productPrice2 = 1200.0;
        double totalAmount2 = context2.processPayment(productPrice2);
        System.out.println(context2.getPaymentDetails());
        System.out.println("Monto total: " + totalAmount2);

        PaymentStrategy plinPayment = new PlinPayment();
        PaymentContext context3 = new PaymentContext(plinPayment, "Cliente 3", "Plin");
        double productPrice3 = 800.0;
        double totalAmount3 = context3.processPayment(productPrice3);
        System.out.println(context3.getPaymentDetails());
        System.out.println("Monto total: " + totalAmount3);

        PaymentStrategy debitCardPayment = new DebitCardPayment();
        PaymentContext context4 = new PaymentContext(debitCardPayment, "Cliente 4", "Tarjeta de Débito");
        double productPrice4 = 1500.0;
        double totalAmount4 = context4.processPayment(productPrice4);
        System.out.println(context4.getPaymentDetails());
        System.out.println("Monto total: " + totalAmount4);
    }
    
}
