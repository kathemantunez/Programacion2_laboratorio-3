/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio3;

import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class DiseñadorGrafico extends Freelance{
    
     private ArrayList<proyecto_publicitario> listapp=new ArrayList();
    private String universidad;
    private String hobbies;

    public DiseñadorGrafico(String universidad, String hobbies, String nombre, String contraseña, String genero, int edad, double dinero, String ciudad, int telefono, String numidentidad, String correo) {
        super(nombre, contraseña, genero, edad, dinero, ciudad, telefono, numidentidad, correo);
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public ArrayList<proyecto_publicitario> getListapp() {
        return listapp;
    }

    public void setListapp(ArrayList<proyecto_publicitario> listapp) {
        this.listapp = listapp;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Dise\u00f1adorGrafico{" + "listapp=" + listapp + ", universidad=" + universidad + ", hobbies=" + hobbies + '}';
    }

    
}
