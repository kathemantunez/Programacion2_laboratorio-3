
package programacion2_laboratorio3;

import java.util.ArrayList;


public class proyecto_comercial extends Proyecto{
    ArrayList<Freelance> Freelance = new ArrayList();

    public proyecto_comercial() {
    }

    public ArrayList<Freelance> getFreelance() {
        return Freelance;
    }

    public void setFreelance(ArrayList<Freelance> Freelance) {
        this.Freelance = Freelance;
    }
    
    
}
