
package model;


public class GuiaTuristico extends Persona {
     private String especialidad;

    public GuiaTuristico(String rut, String nombre, String telefono,
                         Direccion direccion, String especialidad) {

        super(rut, nombre, telefono, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nEspecialidad: " + especialidad;
    }
}
