/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio3;

import javax.swing.JOptionPane;

/**
 *
 * @author KATHERINE
 */
public class Programacion2_Laboratorio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String opcion = " ";
        while (!opcion.equals("f")) {
            opcion=JOptionPane.showInputDialog("CONNECTIVE LINEL\n"
                    + "a. Empresas\n"
                    + "b. Personas\n"
                    + "c. Proyectos\n"
                    + "d. Ingresos\n"
                    + "e. Connective Line\n"
                    + "f. Salir \n");
           if(opcion.equals("a")){
               empresas();
               
           }
           if(opcion.equals("b")){
               personas();
           }
           if(opcion.equals("c")){
               proyectos();
           }
           if(opcion.equals("d")){
               ingresos();
           }
           if(opcion.equals("e")){
               connectiveline();
           }
        }
                    
    }
    public static void empresas(){
        
    }
    public static void personas(){
        
    }
    public static void proyectos(){
        
    }
    public static  void ingresos(){
        
    }
    public static void connectiveline(){
        
    }
    
}
