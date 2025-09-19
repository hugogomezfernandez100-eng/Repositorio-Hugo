package com.ercilla;

public record PersonaRegistro(String nombre, String apellido,) {

    public String toString() {
        System.out.println("Esta instruccion es inservible");
        return String.format("Nombre: %s, Apellido: %s", this.nombre, this.apellido);
    }
}

