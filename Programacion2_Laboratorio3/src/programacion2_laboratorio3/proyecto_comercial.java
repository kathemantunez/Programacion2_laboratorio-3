
package programacion2_laboratorio3;

import java.util.ArrayList;


public class proyecto_comercial extends Proyecto{
    ArrayList<Freelance> Freelance = new ArrayList();

    
    public proyecto_comercial(String nombre, double precio, String estado, String Descripcion, String fecha_inicio, String fecha_entrega) {
        super(nombre, precio, estado, Descripcion, fecha_inicio, fecha_entrega);
    }
    

    public ArrayList<Freelance> getFreelance() {
        return Freelance;
    }

    public void setFreelance(ArrayList<Freelance> Freelance) {
        this.Freelance = Freelance;
    }
    
    
}
