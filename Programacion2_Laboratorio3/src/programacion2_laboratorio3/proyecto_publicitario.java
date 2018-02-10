
package programacion2_laboratorio3;

import java.util.ArrayList;

public class proyecto_publicitario extends Proyecto {
    ArrayList<Freelance> Freelance = new ArrayList();

    public proyecto_publicitario(String nombre, double precio, String estado, String Descripcion, String fecha_inicio, String fecha_entrega) {
        super(nombre, precio, estado, Descripcion, fecha_inicio, fecha_entrega);
    }

    

    public ArrayList<Freelance> getFreelance() {
        return Freelance;
    }

    public void setFreelance(ArrayList<Freelance> Freelance) {
        this.Freelance = Freelance;
    }

   
    
    
}
