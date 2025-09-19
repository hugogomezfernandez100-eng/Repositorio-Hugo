package com.ercilla;

import java.util.Scanner;

public class Mensaje {

    public String SolicitarDatos(String mensaje) {
        System.out.println("Solicitando mensaje: " + mensaje);
        Scanner sc = new Scanner(System.in);
        return mensaje;
    }
}

