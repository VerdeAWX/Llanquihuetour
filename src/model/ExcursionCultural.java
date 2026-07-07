
package model;


public class ExcursionCultural extends ServicioTuristico{
    private String guia;

    public ExcursionCultural(String nombre, String ubicacion, double precio, String guia) {
        super(nombre, ubicacion, precio);
        this.guia = guia;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("===== EXCURSIÓN CULTURAL =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Precio: $" + precio);
        System.out.println("Guia: " + guia);
        System.out.println();
    }
}
