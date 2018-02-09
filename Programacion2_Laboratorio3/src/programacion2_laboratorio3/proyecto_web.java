/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio3;

import java.util.ArrayList;


public class proyecto_web extends Proyecto {
     ArrayList<DesarrolladorWeb> DesarrolladorWeb = new ArrayList();

    public proyecto_web() {
    }

    public ArrayList<DesarrolladorWeb> getDesarrollador_Web() {
        return DesarrolladorWeb;
    }


    public void setDesarrollador_Web(ArrayList<DesarrolladorWeb> DesarrolladorWeb) {

        this.DesarrolladorWeb = DesarrolladorWeb;
    }
     
     
     
}
