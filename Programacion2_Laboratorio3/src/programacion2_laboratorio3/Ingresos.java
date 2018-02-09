/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio3;

import java.util.ArrayList;
import java.util.Date;


public class Ingresos {
  
private ArrayList <Empresas> empresa = new ArrayList();
private ArrayList <Freelance> freelance = new ArrayList();
private double dinero;

    public Ingresos() {
    }

    public Ingresos(double dinero, ArrayList <Empresas> empresa, ArrayList <Freelance> freelance) {
        this.dinero = dinero;
        this.empresa = empresa;
        this.freelance = freelance;
    }

    public ArrayList<Empresas> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<Empresas> empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Freelance> getFreelance() {
        return freelance;
    }

    public void setFreelance(ArrayList<Freelance> freelance) {
        this.freelance = freelance;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    


    
}
