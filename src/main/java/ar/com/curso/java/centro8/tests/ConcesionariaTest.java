package ar.com.curso.java.centro8.tests;

import ar.com.curso.java.centro8.entidades.Auto;
import ar.com.curso.java.centro8.entidades.Concesionaria;
import ar.com.curso.java.centro8.entidades.Moto;
import ar.com.curso.java.centro8.interfaces.IContratoConcesionaria;

public class ConcesionariaTest {
    public static void main(String[] args) {
        IContratoConcesionaria concesionaria = new Concesionaria();
        
        concesionaria.agregarVehiculo(new Auto("Peugeot", "206", 4, 2000000));
        concesionaria.agregarVehiculo(new Moto("Honda", "Titan", "125c", 60000));
        concesionaria.agregarVehiculo(new Auto("Peugeot", "208", 5, 250000));
        concesionaria.agregarVehiculo(new Moto("Yamaha", "YBR", "160c", 80500.50));

        concesionaria.ejecutarReporteCompleto("Y");


    }

}
