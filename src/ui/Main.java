
package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {

  
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();

        System.out.println("==================================");
        System.out.println("   AGENCIA LLANQUIHUE TOUR");
        System.out.println("==================================");
        System.out.println();

        for (ServicioTuristico servicio : gestor.obtenerServicios()) {

            servicio.mostrarInformacion();

        }
    }
    
}
