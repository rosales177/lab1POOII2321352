package com.observer.clases;

class Fanatico implements Observer {
    private String nombre;
    private String apellido;

    public Fanatico(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void update(String mensaje) {
        System.out.println(nombre + " " + apellido + " recibio la notificacion: " + mensaje);
    }
}