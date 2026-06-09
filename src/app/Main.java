
package app;

import model.Direccion;
import model.Persona;
import model.GuiaTuristico;

public class Main {

   
    public static void main(String[] args) {
        
       Direccion direccion1 = new Direccion(
                "Av. Costanera 123",
                "Llanquihue",
                "Los Lagos");

        Direccion direccion2 = new Direccion(
                "Calle Los Volcanes 456",
                "Puerto Varas",
                "Los Lagos");

        Direccion direccion3 = new Direccion(
                "Pasaje Alerce 789",
                "Frutillar",
                "Los Lagos");

        Persona cliente = new Persona(
                "11.111.111-1",
                "Carlos Soto",
                "987654321",
                direccion1);

        GuiaTuristico guia1 = new GuiaTuristico(
                "22.222.222-2",
                "Ana Perez",
                "912345678",
                direccion2,
                "Tours Culturales");

        GuiaTuristico guia2 = new GuiaTuristico(
                "33.333.333-3",
                "Pedro Gonzalez",
                "998877665",
                direccion3,
                "Rutas Gastronomicas");

        System.out.println("=== CLIENTE ===");
        System.out.println(cliente);

        System.out.println("\n=== GUIA 1 ===");
        System.out.println(guia1);

        System.out.println("\n=== GUIA 2 ===");
        System.out.println(guia2);
    } 
      
    }
    

