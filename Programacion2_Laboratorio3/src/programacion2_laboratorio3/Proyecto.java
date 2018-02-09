
package programacion2_laboratorio3;

import java.util.ArrayList;
import java.util.Date;


public class Proyecto {
    private String nombre;
    private ArrayList<Empresas> Empresa = new ArrayList();
    private double precio;
    private String estado;
    private String Descripcion;
    private Date fecha_inicio;
    private Date fecha_entrega;  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empresas> getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(ArrayList<Empresas> Empresa) {
        this.Empresa = Empresa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
    
}
