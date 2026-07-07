
package data;

import java.util.ArrayList;
import java.util.List;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {
    private List<ServicioTuristico> listaServicios;

    public GestorServicios() {

        listaServicios = new ArrayList<>();

        listaServicios.add(new RutaGastronomica(
                "Ruta del Salmon",
                "Puerto Montt",
                25000,
                "Salmon Ahumado"));

        listaServicios.add(new PaseoLacustre(
                "Navegación Lago Llanquihue",
                "Puerto Varas",
                18000,
                "Catamaran"));

        listaServicios.add(new ExcursionCultural(
                "Museo Colonial",
                "Frutillar",
                15000,
                "Carlos Soto"));

        listaServicios.add(new RutaGastronomica(
                "Sabores del Sur",
                "Puerto Octay",
                22000,
                "Kuchen"));

        listaServicios.add(new PaseoLacustre(
                "Tour Volcan Osorno",
                "Ensenada",
                30000,
                "Lancha"));
    }

    public List<ServicioTuristico> obtenerServicios() {
        return listaServicios;
    }
}
