
package programacion2_laboratorio3;

import java.util.ArrayList;


public class Connective_Line {
    private ArrayList <Empresas> empresa = new ArrayList();
    private ArrayList <Freelance> freelance = new ArrayList();
    private ArrayList <Administrador> administradores=new ArrayList();
    
    private double dinero;

    public Connective_Line() {
    }

    public Connective_Line(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    public ArrayList<Empresas> getEmpresa() {
        return empresa;
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

