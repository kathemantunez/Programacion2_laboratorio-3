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
public class Administrador extends Personas{
    
    private String usuario;
    private String conraseña;

    public Administrador() {
    }
    
    public Administrador(String usuario, String conraseña, String numidentidad, String correo) {
        super(numidentidad, correo);
        this.usuario = usuario;
        this.conraseña = conraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getConraseña() {
        return conraseña;
    }

    public void setConraseña(String conraseña) {
        this.conraseña = conraseña;
    }

    @Override
    public String toString() {
        return "Administrador{" + "usuario=" + usuario + ", conrase\u00f1a=" + conraseña + '}';
    }
    
    
    
}
