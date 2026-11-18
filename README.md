# Concesionaria Java

## Descripción

Proyecto de ejemplo en Java que simula una **concesionaria** de vehículos.  
Incluye las entidades `Vehiculo`, `Auto` y `Moto`, una interfaz `IContratoConcesionaria` que define las operaciones de la concesionaria y una implementación `Concesionaria` que gestiona un inventario interno.

## Tecnologías

- Java 17 (compatible con versiones 8+)
- Maven para la gestión de dependencias y el ciclo de vida de compilación
- Lombok (para generar getters y constructores automáticamente)
- JUnit 5 (pruebas unitarias)

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

## Compilación y ejecución

```bash
# Desde la raíz del proyecto
mvn clean compile          # compila el código
mvn exec:java -Dexec.mainClass=ar.com.curso.java.centro8.tests.ConcesionariaTest   # ejecuta la clase de pruebas (ejemplo)
```

> **Nota:** `ConcesionariaTest` contiene un `main` simple para demostrar el uso de la clase; también puedes ejecutar los tests con `mvn test`.

## Ejecutar pruebas

```bash
mvn test
```

Los tests utilizan JUnit 5 y cubren los siguientes casos:
- Agregar vehículos al inventario.
- Mostrar el vehículo más caro y el más barato.
- Buscar por letra en marca/modelo.
- Listado ordenado por precio y por orden natural.
- Generación del reporte completo (método `default` de la interfaz).

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

## Contribuir

1. Fork del repositorio.
2. Crea una rama para tu feature o corrección (`git checkout -b mi-feature`).
3. Realiza los cambios y asegura que las pruebas siguen pasando (`mvn test`).
4. Haz push a tu fork y abre un Pull Request.

## Licencia

Este proyecto está bajo la licencia **MIT**. Consulta el archivo `LICENSE` para más detalles.
