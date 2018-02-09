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
static ArrayList<Administrador> administradores=new ArrayList();
static ArrayList<Freelance>freelance=new ArrayList();
static ArrayList <Empresas>empresas=new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

       String opcion = " ";
        while (!opcion.equals("c")) {
            opcion=JOptionPane.showInputDialog("CONNECTIVE LINEL\n"
                    + "a. Registrar\n"

                    + "b. Login\n"
                    + "C. Salir \n");

           if(opcion.equals("a")){
               registrar();
           }
           if(opcion.equals("b")){

               login();

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
                 String lenguaajeprogra=JOptionPane.showInputDialog("lenguaje de programacion");
                 String universdad=JOptionPane.showInputDialog("universidad");
                 String idioma=JOptionPane.showInputDialog("idioma");
                 String nombre=JOptionPane.showInputDialog("nombre");
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 int  edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                 double dinero=Double.parseDouble(JOptionPane.showInputDialog("dinero"));
                String ciudad=JOptionPane.showInputDialog("ciudad");
                int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                String numidentidad2=JOptionPane.showInputDialog("numero de indentidad");
                 String correo2=JOptionPane.showInputDialog("correo");
                 freelance.add(new DesarrolladorWeb(lenguaajeprogra, universdad, idioma,
                         nombre, contraseña2, nombre, edad, dinero, ciudad, telefono, numidentidad2, correo2));

                 
                 }
                 if(opcion2.equals("b")){
//                     String marca, String modelocamara, String nombre, String contraseña,
//                     String genero, int edad, double dinero, String ciudad, int telefono, String numidentidad, String correo
                String marca=JOptionPane.showInputDialog("marca");
                 String modelocamara=JOptionPane.showInputDialog("modelo camara ");
                 String nombre=JOptionPane.showInputDialog("nombre");
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 String genero=JOptionPane.showInputDialog("genero");
                 
                  int  edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                   double dinero=Double.parseDouble(JOptionPane.showInputDialog("dinero"));
                   String ciudad=JOptionPane.showInputDialog("ciudad");
                   int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                String numidentidad2=JOptionPane.showInputDialog("numero de indentidad");
                 String correo2=JOptionPane.showInputDialog("correo");
                 freelance.add(new Fotografo(marca, modelocamara, nombre, contraseña2, 
                         genero, edad, dinero, ciudad, telefono, numidentidad2, correo2));
                 }
                 if(opcion2.equals("c")){
//                     String universidad, String hobbies, String nombre, String contraseña, 
//                     String genero, int edad, double dinero, String ciudad, int telefono, String numidentidad, String correo
                        String universidad=JOptionPane.showInputDialog("universidad");
                        String hobbies=JOptionPane.showInputDialog("hobbies");
                        String nombre=JOptionPane.showInputDialog("nombre");
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 String genero=JOptionPane.showInputDialog("genero");
                 
                  int  edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                   double dinero=Double.parseDouble(JOptionPane.showInputDialog("dinero"));
                   String ciudad=JOptionPane.showInputDialog("ciudad");
                   int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                String numidentidad2=JOptionPane.showInputDialog("numero de indentidad");
                 String correo2=JOptionPane.showInputDialog("correo");
                 freelance.add(new DiseñadorGrafico(universidad, hobbies, nombre, contraseña2, genero, edad, dinero,
                         ciudad, telefono, numidentidad2, correo2));
                 
                 
                 }
                 if(opcion2.equals("d")){
//                     String nombre_marca, String modelo_camara, String nombre, String contraseña, 
//                     String genero, int edad, double dinero, String ciudad, int telefono, String numidentidad, String correo
                    String nombre_marca=JOptionPane.showInputDialog("nombre de la marca");
                 String modelo_camara=JOptionPane.showInputDialog("modelo de la camara");
                String nombre=JOptionPane.showInputDialog("nombre");
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 String genero=JOptionPane.showInputDialog("genero");
                 
                  int  edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                   double dinero=Double.parseDouble(JOptionPane.showInputDialog("dinero"));
                   String ciudad=JOptionPane.showInputDialog("ciudad");
                   int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                String numidentidad2=JOptionPane.showInputDialog("numero de indentidad");
                 String correo2=JOptionPane.showInputDialog("correo");
                 freelance.add(new medios_audiovisuales(nombre_marca, modelo_camara, nombre,
                         contraseña2, genero, edad, dinero, ciudad, telefono, numidentidad2, correo2));
                 }
                 if(opcion2.equals("e")){
//                     String Red_Social, String nombre, String contraseña, String genero, int edad,
//                             double dinero, String ciudad, int telefono, String numidentidad, String correo
                 String Red_social=JOptionPane.showInputDialog("red social");
                String nombre=JOptionPane.showInputDialog("nombre");
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 String genero=JOptionPane.showInputDialog("genero");
                 
                  int  edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                   double dinero=Double.parseDouble(JOptionPane.showInputDialog("dinero"));
                   String ciudad=JOptionPane.showInputDialog("ciudad");
                   int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                String numidentidad2=JOptionPane.showInputDialog("numero de indentidad");
                 String correo2=JOptionPane.showInputDialog("correo");
                 freelance.add(new marketing(Red_social, nombre, contraseña2, genero, edad, dinero,
                         ciudad, telefono, numidentidad2, correo2));
                    
         }
                 if(opcion2.equals("f")){
//                      String universidad, String Estado_Inscripcion, String Hobbies, String nombre, String contraseña, String genero, 
//                      int edad, double dinero, String ciudad, int telefono, String numidentidad, String correo
                    String universidad=JOptionPane.showInputDialog("universidad");
                    String estado_inscripcion=JOptionPane.showInputDialog("estado de inscripcion");
                     String hobbies=JOptionPane.showInputDialog("hobbies");
                     String nombre=JOptionPane.showInputDialog("nombre");
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 String genero=JOptionPane.showInputDialog("genero");
                 
                  int  edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                   double dinero=Double.parseDouble(JOptionPane.showInputDialog("dinero"));
                   String ciudad=JOptionPane.showInputDialog("ciudad");
                   int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                String numidentidad2=JOptionPane.showInputDialog("numero de indentidad");
                 String correo2=JOptionPane.showInputDialog("correo");
                 freelance.add(new contador(universidad, estado_inscripcion, hobbies, nombre, 
                         contraseña2, genero, edad, dinero, ciudad, telefono, numidentidad2, correo2));
                
                 
                 }
                 break;
             case "c":
                 break;
        
    }
        
    }
    
    public static void connectiveline(){
        

    }
    public static void login(){
            String usuario = JOptionPane.showInputDialog("Ingrese Usuario \n");
            String contraseña = JOptionPane.showInputDialog("Ingrese contraseña \n");
             for (int i = 0; i < empresas.size(); i++) {
                if(empresas.get(i).getCorreo().equals(usuario)){
                    if(contraseña.equals(empresas.get(i).getContraseña())){
                        serEmpresa(i);
                    }else{
                        System.out.println("Datos incorrectos");
                    }
                }else{
                    if(administradores.get(i).getUsuario().equals(usuario)){
                        if(contraseña.equals(administradores.get(i).getConraseña())){
                            serAdmin(i);
                        }else{
                            System.out.println("Datos incorrectos");
                        }
                    }
                }else{
                    if(freelance.get(i).getCorreo().equals(usuario)){
                        if(contraseña.equals(freelance.get(i).getContraseña())){
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


