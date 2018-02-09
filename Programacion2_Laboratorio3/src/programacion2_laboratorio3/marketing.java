
package programacion2_laboratorio3;

import java.util.ArrayList;


public class marketing {
   private ArrayList <proyecto_comercial> proyecto_comercial = new ArrayList();
   private String Red_Social;

    public marketing() {
    }

    public marketing(String Red_Social) {
        this.Red_Social = Red_Social;
    }

    public ArrayList<proyecto_comercial> getProyecto_comercial() {
        return proyecto_comercial;
    }

    public void setProyecto_comercial(ArrayList<proyecto_comercial> proyecto_comercial) {
        this.proyecto_comercial = proyecto_comercial;
    }

    public String getRed_Social() {
        return Red_Social;
    }

    public void setRed_Social(String Red_Social) {
        this.Red_Social = Red_Social;
    }
    
}
