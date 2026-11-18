# Concesionaria Java

## Descripción

Proyecto de ejemplo en Java que simula una **concesionaria** de vehículos.  
Incluye las entidades `Vehiculo`, `Auto` y `Moto`, una interfaz `IContratoConcesionaria` que define las operaciones de la concesionaria y una implementación `Concesionaria` que gestiona un inventario interno.


## Estructura del proyecto

```
concesionaria/
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  └─ ar/com/curso/java/centro8/
│  │  │        ├─ entidades/
│  │  │        │   ├─ Vehiculo.java
│  │  │        │   ├─ Auto.java
│  │  │        │   ├─ Moto.java
│  │  │        │   └─ Concesionaria.java
│  │  │        └─ interfaces/
│  │  │            └─ IContratoConcesionaria.java
│  │  └─ resources/ (opcional)
│  └─ test/
│     └─ java/ar/com/curso/java/centro8/tests/
│          └─ ConcesionariaTest.java
├─ pom.xml
└─ README.md   <-- este archivo
```

> **Nota:** `ConcesionariaTest` contiene un `main` simple para demostrar el uso de la clase.


## Uso básico

```java
Concesionaria concesionaria = new Concesionaria();
concesionaria.agregarVehiculo(new Auto("Toyota", "Corolla", 15000.0));
concesionaria.agregarVehiculo(new Moto("Honda", "CBR500R", "500cc", 7200.0));

concesionaria.mostrarLista();
concesionaria.mostrarVehiculoMasCaro();
concesionaria.ordenadosPorPrecio();
concesionaria.reporteConcesionaria("T"); // genera reporte completo
```
