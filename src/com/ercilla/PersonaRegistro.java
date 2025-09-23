package com.ercilla;

public record PersonaRegistro(String nombre, String apellido,) {

    public String toString() {
        //Pepito comento la linea de codigo que se puede eliminar 
        System.out.println("Esta instruccion es inservible");
        return String.format("Nombre: %s, Apellido: %s", this.nombre, this.apellido);
    }
}

