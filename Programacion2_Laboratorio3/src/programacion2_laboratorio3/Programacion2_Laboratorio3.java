/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio3;



import java.util.ArrayList;
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
static ArrayList administradores=new ArrayList();
static ArrayList freelance=new ArrayList();
static ArrayList empresas=new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

       String opcion = " ";
        while (!opcion.equals("c")) {
            opcion=JOptionPane.showInputDialog("CONNECTIVE LINEL\n"
                    + "a. Registrar\n"
<<<<<<< HEAD
                    + "b. Login\n"
                    + "C. Salir \n");
=======
                    + "b. LOG IN\n"
                    + "c. salir");
>>>>>>> 826a93b52ffcbcb6344da8125e669d80801c04cb
           if(opcion.equals("a")){
               registrar();
           }
           if(opcion.equals("b")){
<<<<<<< HEAD
               login();
=======
               LOGIN();
>>>>>>> 826a93b52ffcbcb6344da8125e669d80801c04cb
           }
           
        }
    }
    public static void registrar(){
        
         String opcion=JOptionPane.showInputDialog("a. Administrador\n"
                 + "b. Freelance\n"
                 + "c. Empresas");
         switch (opcion){
             case "a":
                 String usuario=JOptionPane.showInputDialog("Usuario");
                 String contraseña=JOptionPane.showInputDialog("Contraeña");
                 
                 String numidentidad=JOptionPane.showInputDialog("Numero de idnetidad");
                 String correo=JOptionPane.showInputDialog("correo");
                 administradores.add(new Administrador(usuario, contraseña, numidentidad, correo));
                 break;
             case "b":
                 String opcion2=JOptionPane.showInputDialog("a. desarrollador web\n"
                         + "b. fotógrafo\n"
                         + "c. diseñador grafico\n"
                         + "d. medios udiovisuales\n"
                         + "e. marketing \n"
                         + "f. contador");
                 if(opcion2.equals("a")){
//                     String lenguajeprogra, String universidad, String idioma, String nombre, String contraseña, 
//String genero, int edad, double dinero, String ciudad, int telefono, String numidentidad, String correo
                    
                 }
                 if(opcion2.equals("b")){
                     
                 }
                 if(opcion2.equals("c")){
                     
                 }
                 if(opcion2.equals("d")){
                     
                 }
                 if(opcion2.equals("e")){
                     
                 }if(opcion2.equals("f")){
                     
                 }
                 
                 
                 break;
             case "c":
                 break;
        
    }
        
    }
    public static void LOGIN(){
        
    }
<<<<<<< HEAD
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


=======
               
           }
           
>>>>>>> 826a93b52ffcbcb6344da8125e669d80801c04cb
