package ar.com.curso.java.centro8.interfaces;

import ar.com.curso.java.centro8.entidades.Vehiculo;

public interface IContratoConcesionaria {
    default void margenesTopBottom() {
        System.out.println(" ");
        System.out.println(" ");
    }

    default void divisionSeccion() {
        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");
    }

    void agregarVehiculo(Vehiculo vehiculo);

    void reporteConcesionaria(String letra);

    void buscarPorLetra(String letra);

    void mostrarVehiculoMasCaro();

    void mostrarVehiculoMasBarato();

    void mostrarLista();

    void mostrarListaNatural();

    void ordenadosPorPrecio();

    default void ejecutarReporteCompleto(String letraBuscada) {
        margenesTopBottom();

        mostrarLista();

        divisionSeccion();
        mostrarVehiculoMasCaro();
        mostrarVehiculoMasBarato();
        buscarPorLetra(letraBuscada);

        divisionSeccion();

        ordenadosPorPrecio();
        divisionSeccion();

        mostrarListaNatural();

        margenesTopBottom();
    }
}
