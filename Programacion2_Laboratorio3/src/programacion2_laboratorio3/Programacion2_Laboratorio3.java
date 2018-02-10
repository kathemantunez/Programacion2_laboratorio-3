/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio3;



import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

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

//static ArrayList <Administrador> administradores=new ArrayList();
//static ArrayList <Freelance>freelance=new ArrayList();
//static ArrayList <Empresas> empresas=new ArrayList();
//static ArrayList <Proyecto> proyectos = new ArrayList();
        static Connective_Line connective=new Connective_Line();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

       String opcion = " ";
        while (!opcion.equals("c")) {
            opcion=JOptionPane.showInputDialog("CONNECTIVE LINE\n"
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
                 connective.getAdministradores().add(new Administrador(usuario, contraseña, numidentidad, correo));
//                 administradores.add(new Administrador(usuario, contraseña, numidentidad, correo));
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
                 connective.getFreelance().add(new DesarrolladorWeb(lenguaajeprogra, universdad, idioma, 
                         nombre, contraseña2, nombre, edad, dinero, ciudad, telefono, numidentidad2, correo2));
//                 freelance.add(new DesarrolladorWeb(lenguaajeprogra, universdad, idioma,
//                         nombre, contraseña2, nombre, edad, dinero, ciudad, telefono, numidentidad2, correo2));

                 
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
                 connective.getFreelance().add(new Fotografo(marca, modelocamara, nombre, contraseña2, 
                         genero, edad, dinero, ciudad, telefono, numidentidad2, correo2));
//                 freelance.add(new Fotografo(marca, modelocamara, nombre, contraseña2, 
//                         genero, edad, dinero, ciudad, telefono, numidentidad2, correo2));
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
                 connective.getFreelance().add(new DiseñadorGrafico(universidad, hobbies, nombre, contraseña2, genero, edad, dinero,
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
                 connective.getFreelance().add(new medios_audiovisuales(nombre_marca, modelo_camara, nombre,
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
                 connective.getFreelance().add(new marketing(Red_social, nombre, contraseña2, genero, edad, dinero,
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
                 connective.getFreelance().add(new contador(universidad, estado_inscripcion, hobbies, nombre, 
                         contraseña2, genero, edad, dinero, ciudad, telefono, numidentidad2, correo2));
                
                 
                 }
                 break;
             case "c":
                  String opcion3=JOptionPane.showInputDialog("a. Extranjeras\n"
                          + "b. Nacionales");
               if(opcion3.equals("a")){
//                   String pais, String ciudad, String pagweb, String nombre,
//int telefono, String correo, String contraseña, String descripcion
                 String pais=JOptionPane.showInputDialog("pais");
                    String ciudad=JOptionPane.showInputDialog("ciudad");
                     String pagweb=JOptionPane.showInputDialog("pagina web");
                     String nombre=JOptionPane.showInputDialog("nombre");
                    int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                    String correo2=JOptionPane.showInputDialog("correo");
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 String descrpcion=JOptionPane.showInputDialog("descripcion");
                 connective.getEmpresa().add(new Extranjeras(pais, ciudad, pagweb, nombre, telefono, correo2, contraseña2, descrpcion));

               }
               if(opcion3.equals("b")){
//                   String departamento, String municipio, String cuidad, String mision, 
//                   String vision, String nombre, int telefono, String correo, String contraseña, String descripcion
                    String departamento=JOptionPane.showInputDialog("departamento");
                     String municipio=JOptionPane.showInputDialog("municipio");
                     String ciudad=JOptionPane.showInputDialog("ciudad");
                     String mision=JOptionPane.showInputDialog("mision");
                     String vision=JOptionPane.showInputDialog("vision");
                     String nombre=JOptionPane.showInputDialog("nombre");
                    int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                    String correo2=JOptionPane.showInputDialog("correo");
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 String descrpcion=JOptionPane.showInputDialog("descripcion");
                 connective.getEmpresa().add(new Nacionales(departamento, municipio, ciudad, mision, 
                         vision, nombre, telefono, correo2, contraseña2, descrpcion));
                   
               }
        
    }
        
    }

    public static void connectiveline(){
        

    }
    public static void login(){
            String usuario = JOptionPane.showInputDialog("Ingrese Usuario \n");
            String contraseña = JOptionPane.showInputDialog("Ingrese contraseña \n");
             for (int i = 0; i < connective.getEmpresa().size(); i++) {

                if(connective.getEmpresa().get(i).getCorreo().equals(usuario)){
                    if(contraseña.equals(connective.getEmpresa().get(i).getContraseña())){
                        serEmpresa(i);
                    }else{
                        System.out.println("Datos incorrectos");
                    }

                
                    
                }else
                    if(connective.getAdministradores().get(i).getUsuario().equals(usuario)){
                        if(contraseña.equals(connective.getAdministradores().get(i).getConraseña())){
                            serAdmin(i);
                        }else{
                            System.out.println("Datos incorrectos");
                        }

                    

                }else
                    if(connective.getFreelance().get(i).getCorreo().equals(usuario)){
                        if(contraseña.equals(connective.getFreelance().get(i).getContraseña())){
                            serFreelance(i,connective.getFreelance().get(i));

                        }else{
                            System.out.println("Datos incorrectos");
                        }
                    }
             }
                       
             
    }//fin de login
    public static void serEmpresa(int pos){
        String opcion = " ";
        while (!opcion.equals("c")) {
            opcion=JOptionPane.showInputDialog("EMPRESA\n"
                    + "a. Crear Proyecto\n"
                    + "b. Modificar Proyecto\n"
                    + "C. Eliminar Proyecto \n");
            if(opcion.equals("a")){
            String proyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto \n");
            String usuario = JOptionPane.showInputDialog("Ingrese Usuario \n"); 
            }

    }
    }
    public static void serAdmin(int pos){
        
        
        
    }
    public static void serFreelance(int pos,Freelance usuario){
        String opcion="";
     while (!opcion.equals("c")) {
         opcion=JOptionPane.showInputDialog("a. modificar\n"
                 + "b. eliminar \n"
                 + "c.salir" );
         if(opcion.equals("a")){//
             int c=1;
             String cadena="";
//             carros.get(pos-1).setAltura(altura);
                if(usuario instanceof DesarrolladorWeb){
                 String lenguaajeprogra=JOptionPane.showInputDialog("lenguaje de programacion");
                    if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setLenguajeprogra(lenguaajeprogra);
                    }
                 String universdad=JOptionPane.showInputDialog("universidad");
                 if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setUniversidad(universdad);
                    }
                 String idioma=JOptionPane.showInputDialog("idioma");
                 if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setIdioma(idioma);
                    }
                 String nombre=JOptionPane.showInputDialog("nombre");
                 if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setNombre(nombre);
                    }
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setContraseña(contraseña2);
                    }
                 int  edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                 if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setEdad(edad);
                    }
                 double dinero=Double.parseDouble(JOptionPane.showInputDialog("dinero"));
                 if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setDinero(dinero);
                    }
                String ciudad=JOptionPane.showInputDialog("ciudad");
                if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setCiudad(ciudad);
                    }
                int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setTelefono(telefono);
                    }
                String numidentidad2=JOptionPane.showInputDialog("numero de indentidad");
                if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setNumidentidad(numidentidad2);
                    }
                 String correo2=JOptionPane.showInputDialog("correo");
                 if (connective.getFreelance().get(pos) instanceof DesarrolladorWeb) {
                        ((DesarrolladorWeb)connective.getFreelance().get(c)).setCorreo(correo2);
                    }
                }
                if(usuario instanceof Fotografo){
                 String marca=JOptionPane.showInputDialog("marca");
                 if (connective.getFreelance().get(pos) instanceof Fotografo) {
                        ((Fotografo)connective.getFreelance().get(c)).setMarca(marca);
                    }
                 String modelocamara=JOptionPane.showInputDialog("modelo camara ");
                 if (connective.getFreelance().get(pos) instanceof Fotografo) {
                        ((Fotografo)connective.getFreelance().get(c)).setModelocamara(modelocamara);
                    }
                 String nombre=JOptionPane.showInputDialog("nombre");
                 if (connective.getFreelance().get(pos) instanceof Fotografo) {
                        ((Fotografo)connective.getFreelance().get(c)).setNombre(nombre);
                    }
                 String contraseña2=JOptionPane.showInputDialog("contraseña");
                 if (connective.getFreelance().get(pos) instanceof Fotografo) {
                        ((Fotografo)connective.getFreelance().get(c)).setContraseña(contraseña2);
                    }
                 String genero=JOptionPane.showInputDialog("genero");
                 if (connective.getFreelance().get(pos) instanceof Fotografo) {
                        ((Fotografo)connective.getFreelance().get(c)).setGenero(genero);
                    }
                 
                  int  edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                  if (connective.getFreelance().get(pos) instanceof Fotografo) {
                        ((Fotografo)connective.getFreelance().get(c)).setEdad(edad);
                    
                   double dinero=Double.parseDouble(JOptionPane.showInputDialog("dinero"));
                   if (connective.getFreelance().get(pos) instanceof Fotografo) {
                        ((Fotografo)connective.getFreelance().get(c)).setDinero(dinero);
                    }
                   String ciudad=JOptionPane.showInputDialog("ciudad");
                   
                   int  telefono=Integer.parseInt(JOptionPane.showInputDialog("telefono"));
                String numidentidad2=JOptionPane.showInputDialog("numero de indentidad");
                 String correo2=JOptionPane.showInputDialog("correo");
                    
             
         }
         
//             String cadena="";
//                       int c=1;
//                           for (int i = 0; i < carros.size(); i++) {
//                               cadena+="\n"+c+"."+carros.get(i);
//                               c++;
//                           }
//                           int pos=Integer.parseInt(JOptionPane.showInputDialog(cadena+"\nCarro a modificar:"));
//                            String funcion=JOptionPane.showInputDialog("Nueva Función:");
//                            carros.get(pos-1).setFuncion(funcion);
//                            int capacidad=Integer.parseInt(JOptionPane.showInputDialog("Nueva Capacidad (kg):"));
//                            carros.get(pos-1).setCapacidad(capacidad);
//                            int longitud=Integer.parseInt(JOptionPane.showInputDialog("Nueva Longitud:"));
//                            carros.get(pos-1).setLongitud(longitud);
//                            int altura=Integer.parseInt(JOptionPane.showInputDialog("Nueva Altura:"));
//                            carros.get(pos-1).setAltura(altura);
             
         }
         
//        while (!opcion.equals("c")) {
//            opcion=JOptionPane.showInputDialog("a. Proyecto web\n"
//                    + "b. Proyecto publicitario\n"
//                    + "c. Proyecto Comercial" );
//            if(opcion.equals("a")){
//                String cadena="";
//              int c=1;
//              
//                for (int i = 0; i <connective.getFreelance().size(); i++) {
//                    cadena+="\n"+c+"."+connective.
//                    c++;
//                }
//                    
//                }
//            }
//            if(opcion.equals("b")){
//                
//            }
//            if(opcion.equals("c")){
//                
            }
        
        
    }
    }

