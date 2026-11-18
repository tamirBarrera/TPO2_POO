package ar.com.curso.java.centro8.entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.com.curso.java.centro8.interfaces.IContratoConcesionaria;
import lombok.Getter;

@Getter
public class Concesionaria implements IContratoConcesionaria {

    private final List<Vehiculo> vehiculos = new ArrayList<>();

    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);

    }

    public void ejecutarReporteCompleto() {
    }

    @Override
    public void reporteConcesionaria(String letra) {
    }

    @Override
    public void buscarPorLetra(String letra) {
        if (letra == null || letra.isEmpty())
            return null;

//lista de elementos que contengan la letra asignada
        List<Vehiculo> encontrados = vehiculos.stream() //
                .filter(v -> v.modelo.toLowerCase().contains(letra.toLowerCase()))
                .toList();
        if (encontrados.isEmpty()) {
                                     // si da nulo
            System.out.println("No hay vehiculos ingresados con esa letra '" + letra + "'.");
        } else {
            encontrados.forEach(v -> System.out.println("Vehiculo con la letra '"
                    + letra + "': " + v.marca + " " + v.modelo + " $" + v.precio));
        }
    }

    @Override
    public void mostrarVehiculoMasCaro() {
        Vehiculo masCaro = vehiculos.stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .orElse(null);
        if (masCaro != null) {
            System.out.println("Vehiculo más caro: " + masCaro.marca + " " + masCaro.modelo);
        } else {
            System.out.println("No hay vehiculos ingresados.");
        }
    }

    @Override
    public void mostrarVehiculoMasBarato() {
        Vehiculo masBarato = vehiculos.stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .orElse(null);
        if (masBarato != null) {
            System.out.println("Vehiculo más barato: " + masBarato.marca + " " + masBarato.modelo);
        } else {
            System.out.println("No hay vehiculos ingresados.");
        }
    }

    @Override
    public void mostrarLista() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    @Override
    public void mostrarListaNatural() {
        System.out.println("Vehiculos ordenados por orden (marca, modelo, precio):");
        vehiculos.stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Override
    public void ordenadosPorPrecio() {
        System.out.println("Vehiculos de mayor a menor:");
        vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
                .forEach(v -> System.out.println(v.marca + " " + v.modelo));
    }

}
