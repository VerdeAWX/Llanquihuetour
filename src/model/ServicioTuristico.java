
package model;


public abstract class ServicioTuristico {
     protected String nombre;
    protected String ubicacion;
    protected double precio;

    public ServicioTuristico(String nombre, String ubicacion, double precio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    // Método que será sobrescrito
    public abstract void mostrarInformacion();
}
