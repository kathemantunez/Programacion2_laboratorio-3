
package programacion2_laboratorio3;

import java.util.ArrayList;


public class medios_audiovisuales {
    private ArrayList <proyecto_comercial> proyecto_comercial = new ArrayList();
    private String nombre_marca;
    private String modelo_camara;

    public medios_audiovisuales() {
    }

    public medios_audiovisuales(String nombre_marca, String modelo_camara) {
        this.nombre_marca = nombre_marca;
        this.modelo_camara = modelo_camara;
    }

    public ArrayList<proyecto_comercial> getProyecto_comercial() {
        return proyecto_comercial;
    }

    public void setProyecto_comercial(ArrayList<proyecto_comercial> proyecto_comercial) {
        this.proyecto_comercial = proyecto_comercial;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public String getModelo_camara() {
        return modelo_camara;
    }

    public void setModelo_camara(String modelo_camara) {
        this.modelo_camara = modelo_camara;
    }
    
    
}
