Descripción:
Su objetivo es representar la información de las personas vinculadas a una agencia de turismo mediante clases organizadas en paquetes, aplicando conceptos de encapsulamiento, herencia y composición.
El sistema permite registrar personas y guías turísticos, incorporando además información de dirección para cada registro.

Estructura del proyecto

Paquete model:

Contiene las clases del dominio del sistema:

Direccion.java
   - Representa la dirección de una persona.
    - Incluye calle, ciudad y región.
Persona.java
   - Clase base del sistema.
   - Contiene información común como RUT, nombre, teléfono y dirección.
GuiaTuristico.java
   - Hereda de la clase Persona.
   - Agrega el atributo especialidad.
Paquete app

Main.java
    - Clase principal encargada de crear los objetos y mostrar la información por consola.

Conceptos de POO utilizados:
    - Encapsulamiento mediante atributos privados.
    - Métodos getters y setters.
    - Constructores para inicializar objetos.
    - Método toString() para mostrar información.
    - Herencia entre Persona y GuiaTuristico.
    - Composición entre Persona y Direccion.

Cómo compilar y ejecutar:

    - Abrir el proyecto en IntelliJ IDEA o NetBeans.
    - Verificar que la estructura de paquetes sea correcta.
    - Ejecutar la clase:

app.Main:

    - Observar los resultados en la consola.

Autor

Nicolás Orozco Robles.