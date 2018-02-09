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
public class DesarrolladorWeb extends Freelance{
    private String lenguajeprogra;
    private String universidad;
    private String idioma;
    private ArrayList<proyecto_web> listaproyec=new ArrayList();

    public DesarrolladorWeb(String lenguajeprogra, String universidad, String idioma, String nombre, String contraseña, String genero, int edad, double dinero, String ciudad, int telefono, String numidentidad, String correo) {
        super(nombre, contraseña, genero, edad, dinero, ciudad, telefono, numidentidad, correo);
        this.lenguajeprogra = lenguajeprogra;
        this.universidad = universidad;
        this.idioma = idioma;
    }

    public String getLenguajeprogra() {
        return lenguajeprogra;
    }

    public void setLenguajeprogra(String lenguajeprogra) {
        this.lenguajeprogra = lenguajeprogra;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<proyecto_web> getListaproyec() {
        return listaproyec;
    }

    public void setListaproyec(ArrayList<proyecto_web> listaproyec) {
        this.listaproyec = listaproyec;
    }

    @Override
    public String toString() {
        return "DesarrolladorWeb{" + "lenguaje progra=" + lenguajeprogra + ", universidad=" + universidad + ", idioma=" + idioma + ", listaproyec=" + listaproyec + '}';
    }

    
    
    
    
}
