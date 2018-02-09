
package programacion2_laboratorio3;

import java.util.ArrayList;


public class contador {
    private ArrayList <proyecto_comercial> proyecto_comercial = new ArrayList();
    private String universidad;
    private String Estado_Inscripcion;
    private String Hobbies;

    public contador() {
    }

    public contador(String universidad, String Estado_Inscripcion, String Hobbies) {
        this.universidad = universidad;
        this.Estado_Inscripcion = Estado_Inscripcion;
        this.Hobbies = Hobbies;
    }

    public ArrayList<proyecto_comercial> getProyecto_comercial() {
        return proyecto_comercial;
    }

    public void setProyecto_comercial(ArrayList<proyecto_comercial> proyecto_comercial) {
        this.proyecto_comercial = proyecto_comercial;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getEstado_Inscripcion() {
        return Estado_Inscripcion;
    }

    public void setEstado_Inscripcion(String Estado_Inscripcion) {
        this.Estado_Inscripcion = Estado_Inscripcion;
    }

    public String getHobbies() {
        return Hobbies;
    }

    public void setHobbies(String Hobbies) {
        this.Hobbies = Hobbies;
    }
    
    
}
