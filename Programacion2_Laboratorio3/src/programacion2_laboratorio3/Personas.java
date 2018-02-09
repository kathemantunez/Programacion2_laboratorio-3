/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio3;

/**
 *
 * @author KATHERINE
 */
public class Personas {
    private String numidentidad;
    private String correo;

    public Personas() {
    }

    public Personas(String numidentidad, String correo) {
        this.numidentidad = numidentidad;
        this.correo = correo;
    }

    public String getNumidentidad() {
        return numidentidad;
    }

    public void setNumidentidad(String numidentidad) {
        this.numidentidad = numidentidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Personas{" + "numero de identidad=" + numidentidad + ", correo=" + correo + '}';
    }
    
    
    
}
