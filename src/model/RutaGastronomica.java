
package model;


public class RutaGastronomica extends ServicioTuristico {
    private String platoTipico;

    public RutaGastronomica(String nombre, String ubicacion, double precio, String platoTipico) {
        super(nombre, ubicacion, precio);
        this.platoTipico = platoTipico;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("===== RUTA GASTRONÓMICA =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Precio: $" + precio);
        System.out.println("Plato típico: " + platoTipico);
        System.out.println();
    }
}
