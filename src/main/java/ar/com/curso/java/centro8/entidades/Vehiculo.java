package ar.com.curso.java.centro8.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter

/**
 * 
 *
 * Vehiculo ->> Es la clase padre de Auto y Moto, otorga los atributos generales
 * marca, modelo y precio a las
 * dos entidades, implementa la interface Comparable para que compare los
 * objetos que van antes o despues y
 * obtener un orden natural.
 * 
 * @param otro En el metodo compareTo, el segundo vehículo que se va a comparar
 *             contra la instancia
 *             actual (this).
 * 
 * @return Un entero negativo si este vehículo es menor, cero si son iguales,
 *         o un entero positivo si es mayor que el vehículo especificado. Si
 *         marca es igual desempata con modelo,
 *         si tambien son iguales, desempata por precio (de menor a mayor
 *         gracias a Double.compare).
 * 
 * @author Tamir Barrera
 */

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
