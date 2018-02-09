/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio3;



import javax.swing.JOptionPane;

/**
 *
 * @author FABIO
=======
import javax.swing.JOptionPane;

/**
 *
 * @author KATHERINE
>>>>>>> 1602bfb7cddbe39744a6480aeb2e4471bfb9b0a1
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
                    + "a. Registrar\n"
                    + "b. Login\n"
                    + "C. Salir \n");
           if(opcion.equals("a")){
               empresas();
               
           }
           if(opcion.equals("b")){
               login();
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
    public static void login(){
            String usuario = JOptionPane.showInputDialog("Ingrese Usuario \n");
            String contraseña = JOptionPane.showInputDialog("Ingrese contraseña \n");
             for (int i = 0; i < listaMaestros.size(); i++) {
                if(listaMaestros.get(i).getUsuario().equals(usuario)){
                    if(contraseña.equals(listaMaestros.get(i).getContraseña())){
                        serEmpresa(i);
                    }else{
                        System.out.println("Datos incorrectos");
                    }
                }else{
                    if(listaAlumnos.get(i).getUsuario().equals(usuario)){
                        if(contraseña.equals(listaAlumnos.get(i).getContraseña())){
                            serAdmin(i);
                        }else{
                            System.out.println("Datos incorrectos");
                        }
                    }
                }else{
                    if(listaAlumnos.get(i).getUsuario().equals(usuario)){
                        if(contraseña.equals(listaAlumnos.get(i).getContraseña())){
                            serFrelance(i);
                        }else{
                            System.out.println("Datos incorrectos");
                        }
                    }
                }
            }    
    }//fin de login
    public static void serEmpresa(int pos){
        
    }
    public static void serAdmin(int pos){
        
    }
    public static void serFreelance(int pos){
        
    }
    }


