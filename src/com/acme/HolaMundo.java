package com.acme;

public class HolaMundo {
    public static void main(String[] args){
        System.out.println("Hola Mundo");
        Mensaje msj = new Mensaje();
        String nombre = msj.solicitaDatos("Escribe tu nombre");
        msj.saludar(nombre);
    }
}
