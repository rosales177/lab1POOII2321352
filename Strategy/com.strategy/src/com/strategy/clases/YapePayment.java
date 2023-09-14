/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.strategy.clases;

/**
 *
 * @author rosales1015
 */
public class YapePayment implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        if (amount > 1000.0) {
            return amount - (amount * 0.07);
        } else {
            return amount;
        }
    }
}