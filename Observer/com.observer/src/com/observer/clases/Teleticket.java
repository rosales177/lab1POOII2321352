/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer.clases;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String mensaje);
}

/**
 *
 * @author rosales1015
 */


public class Teleticket {
    private List<Observer> observadores = new ArrayList<>();
    private String mensaje;

    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

    public void notificar() {
        for (Observer observer : observadores) {
            observer.update(mensaje);
        }
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        notificar();
    }
}