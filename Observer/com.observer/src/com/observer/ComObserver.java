/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.observer;

import com.observer.clases.Fanatico;
import com.observer.clases.Teleticket;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author rosales1015
 */
public class ComObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teleticket teleticket = new Teleticket();

        Fanatico fan1 = new Fanatico("Manuel", "Zegarra");
        Fanatico fan2 = new Fanatico("Geraldo", "Rosales");

        teleticket.addObserver(fan1);
        teleticket.addObserver(fan2);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
          @Override
          public void run() {
            Calendar calendar = Calendar.getInstance();
            int diaDelMes = calendar.get(Calendar.DAY_OF_MONTH);
            if (diaDelMes == 15) {
              teleticket.setMensaje("Entradas disponibles para el concierto de su artista.");
            }
          }
        }, new Date(), 24 * 60 * 60 * 1000);

        teleticket.setMensaje("Nuevo mensaje de Teleticket");

        teleticket.removeObserver(fan2);

        teleticket.setMensaje("Otro mensaje de Teleticket");
    }
    
}
