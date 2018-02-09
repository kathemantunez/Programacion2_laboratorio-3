/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio3;

import java.util.ArrayList;


public class proyecto_web extends Proyecto {
     ArrayList<Desarrollador_web> Desarrollador_Web = new ArrayList();

    public proyecto_web() {
    }

    public ArrayList<Desarrollador_web> getDesarrollador_Web() {
        return Desarrollador_Web;
    }

    public void setDesarrollador_Web(ArrayList<Desarrollador_web> Desarrollador_Web) {
        this.Desarrollador_Web = Desarrollador_Web;
    }
     
     
     
}
