package ar.com.curso.java.centro8.entidades;

import lombok.Getter;

@Getter
public class Auto extends Vehiculo {
    protected int puertas;

    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + puertas + " // Precio: $"
                + precio;
    }

}
