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
public class Extranjeras extends Empresas{
    
    private String pais;
    private String ciudad;
    private String pagweb;

    public Extranjeras() {
    }

    

    public Extranjeras(String pais, String ciudad, String pagweb, String nombre, int telefono, String correo, String contraseña, String descripcion) {
        super(nombre, telefono, correo, contraseña, descripcion);
        this.pais = pais;
        this.ciudad = ciudad;
        this.pagweb = pagweb;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPagweb() {
        return pagweb;
    }

    public void setPagweb(String pagweb) {
        this.pagweb = pagweb;
    }

    @Override
    public String toString() {
        return "Extranjeras{" + "pais=" + pais + ", ciudad=" + ciudad + ", pagina web (URL)=" + pagweb + '}';
    }
    
    
    
}
