
package programacion2_laboratorio3;

import java.util.ArrayList;

public class proyecto_publicitario extends Proyecto {
    ArrayList<FreeLance> Freelance = new ArrayList();

    public proyecto_publicitario() {
    }

    public ArrayList<FreeLance> getFreelance() {
        return Freelance;
    }

    public void setFreelance(ArrayList<FreeLance> Freelance) {
        this.Freelance = Freelance;
    }
    
    
}
