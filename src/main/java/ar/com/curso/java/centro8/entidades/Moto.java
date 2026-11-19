package ar.com.curso.java.centro8.entidades;

import lombok.Getter;

@Getter

public class Moto extends Vehiculo {

    protected String cilindrada;

    public Moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " + cilindrada + " // Precio: $" + formatearString();
    }
}
