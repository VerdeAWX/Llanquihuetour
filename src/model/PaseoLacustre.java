
package model;


public class PaseoLacustre extends ServicioTuristico {
     private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, String ubicacion, double precio, String tipoEmbarcacion) {
        super(nombre, ubicacion, precio);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("===== PASEO LACUSTRE =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Precio: $" + precio);
        System.out.println("Embarcacion: " + tipoEmbarcacion);
        System.out.println();
    }
}
