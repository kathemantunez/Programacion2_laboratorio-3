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
public class Freelance extends Personas{
    
  private  String nombre;
  private String contraseña;
  private String genero;
  private int edad;
 private ArrayList<Empresas> listaemp=new ArrayList();
 private double dinero;
 private String ciudad;
 private int telefono;


    public Freelance(String nombre, String contraseña, String genero, int edad, double dinero, String ciudad, int telefono, String numidentidad, String correo) {
        super(numidentidad, correo);
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.genero = genero;
        this.edad = edad;
        this.dinero = dinero;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Empresas> getListaemp() {
        return listaemp;
    }

    public void setListaemp(ArrayList<Empresas> listaemp) {
        this.listaemp = listaemp;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Freelance{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", genero=" + genero + ", edad=" + edad + ", lista de empresas=" + listaemp + ", dinero=" + dinero + ", ciudad=" + ciudad + ", telefono=" + telefono + '}';
    }
    
 
 
}
