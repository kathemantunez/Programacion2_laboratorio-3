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
public class Fotografo {
     private ArrayList<proyecto_publicitario> listapp=new ArrayList();
     private String marca;
     private String modelocamara;

    public Fotografo(String marca, String modelocamara) {
        this.marca = marca;
        this.modelocamara = modelocamara;
    }

    public ArrayList<proyecto_publicitario> getListapp() {
        return listapp;
    }

    public void setListapp(ArrayList<proyecto_publicitario> listapp) {
        this.listapp = listapp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelocamara() {
        return modelocamara;
    }

    public void setModelocamara(String modelocamara) {
        this.modelocamara = modelocamara;
    }

    @Override
    public String toString() {
        return "Fotografo{" + "lista proyecto publicitario=" + listapp + ", marca=" + marca + ", modelocamara=" + modelocamara + '}';
    }
     
    
}
