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
public class Empresas {
    private String nombre;
    private int telefono;
    private ArrayList<Proyectos> listap=new ArrayList();
    private String correo;
    private String contraseña;
    private String descripcion;

    public Empresas() {
    }

    public Empresas(String nombre, int telefono, String correo, String contraseña, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
        this.descripcion = descripcion;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Proyectos> getListap() {
        return listap;
    }

    public void setListap(ArrayList<Proyectos> listap) {
        this.listap = listap;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Empresas{" + "nombre=" + nombre + ", telefono=" + telefono + ", lista proyecto=" + listap + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
