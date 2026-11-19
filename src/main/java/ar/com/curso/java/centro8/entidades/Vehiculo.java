package ar.com.curso.java.centro8.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter


public abstract class Vehiculo implements Comparable<Vehiculo> {
    protected String marca;
    protected String modelo;
    protected double precio;

    @Override
    public int compareTo(Vehiculo otro) {
        // Marca y modelo por orden alfabetico
        int compMarca = this.marca.compareTo(otro.marca);
        if (compMarca != 0) {
            return compMarca;
        }

        int compModelo = this.modelo.compareTo(otro.modelo);
        if (compModelo != 0) {
            return compModelo;
        }

        return Double.compare(this.precio, otro.precio);
    }

    protected String formatearString(){
        return String.format(java.util.Locale.of("es", "AR"),
    "$%,.2f", precio);
    }

}
