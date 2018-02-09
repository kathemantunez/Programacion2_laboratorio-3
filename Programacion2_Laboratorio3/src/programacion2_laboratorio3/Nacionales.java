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
public class Nacionales extends Empresas{
    
    private String departamento;
    private String municipio;
    private String cuidad;
    private String mision;
    private String vision;

    public Nacionales() {
    }

    public Nacionales(String departamento, String municipio, String cuidad, String mision, String vision, String nombre, int telefono, String correo, String contraseña, String descripcion) {
        super(nombre, telefono, correo, contraseña, descripcion);
        this.departamento = departamento;
        this.municipio = municipio;
        this.cuidad = cuidad;
        this.mision = mision;
        this.vision = vision;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    @Override
    public String toString() {
        return "Nacionales{" + "departamento=" + departamento + ", municipio=" + municipio + ", cuidad=" + cuidad + ", mision=" + mision + ", vision=" + vision + '}';
    }
    
    
    
    
}
