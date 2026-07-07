LlanquihueTourApp
Descripción

Este proyecto corresponde al desarrollo de la aplicación LlanquihueTourApp, realizada en Java utilizando NetBeans.

En esta etapa se implementó el uso de polimorfismo y colecciones genéricas, permitiendo administrar distintos tipos de servicios turísticos mediante una única colección de objetos.

Se desarrolló una jerarquía de clases compuesta por:

ServicioTuristico (superclase)
RutaGastronomica
PaseoLacustre
ExcursionCultural

Cada subclase sobrescribe el método mostrarInformacion(), permitiendo que la información específica de cada servicio sea mostrada mediante polimorfismo.

Además, se creó la clase GestorServicios, la cual administra una colección List<ServicioTuristico> que almacena distintos servicios turísticos y los recorre utilizando un ciclo for-each.

Tecnologías utilizadas
Java
NetBeans IDE
Programación Orientada a Objetos (POO)
Polimorfismo
Herencia
Colecciones Genéricas (ArrayList y List)
Git y GitHub
Estructura del proyecto
src/
│
├── model/
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data/
│   └── GestorServicios.java
│
└── ui/
    └── Main.java
Instrucciones para compilar y ejecutar
Abrir el proyecto en NetBeans.
Esperar que el IDE cargue las dependencias.
Ejecutar la clase Main.java ubicada en el paquete ui.
La consola mostrará la información de todos los servicios turísticos almacenados en la colección, utilizando polimorfismo para invocar el método mostrarInformacion() correspondiente a cada objeto.

Autor
Nicolás Orozco Robles

Proyecto desarrollado para la asignatura de Programación Orientada a Objetos.
