import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        login leerUsuarios= new login();
        List<Usuarios> listaUsuarios= leerUsuarios.leerArchivo();
        
        Scanner scanner = new Scanner (System.in);
        String usuario, usuario2;
        String contraseña;
        
        
        
        
        for(Usuarios usuarios : listaUsuarios){
            while(true){
        
                System.out.println("Ingrese el usuario");
                usuario = scanner.nextLine();
                usuario2=usuarios.getUsuario();

                   //contraseña 

                String contrasena, contrasena2;
                int mensaje;
                System.out.println("Ingrese contrasena");
                contrasena = scanner.nextLine(); 

                char array[] = contrasena.toCharArray(); 

                Encriptacion encriptacion = new Encriptacion(contrasena, array); 

                contrasena= encriptacion.encriptar(contrasena, array);
                contrasena2= usuarios.getContraseña();
                
//                contrasena2= encriptacion.encriptar(contrasena2, array);
                
                ValidacionUsuarioContrasena validacion= new ValidacionUsuarioContrasena(usuario,contrasena,usuario2,contrasena2);
                mensaje=validacion.validacion(usuario, contrasena, usuario2, contrasena2);
                
                if (mensaje==0){
                    System.out.println("");
                }else {
                    break; 
                }
                
            }

            
        }
        
        

        LeerArchivo leerArchivo = new LeerArchivo();
        List<Estudiante> listaEstudiantes = leerArchivo.leerArchivo(); 

        //Ingresar calificaciones
        
        int calificacion=0; 

        for(Estudiante estudiante : listaEstudiantes){
            while(true){
        
                System.out.println("Ingrese la calificacion de " + estudiante.getPrimerApellido() + " " + estudiante.getSegundoApellido() + " " + estudiante.getNombres() + ": ");
                try{
                    calificacion = scanner.nextInt();
                }   
                catch(InputMismatchException ex){
                    System.out.println("CALIFICACION INVALIDA, INGRESAR UN NUMERO ENTERO");
                }
                if (calificacion < 1 || calificacion > 100){
                    System.out.println("CALIFICACION INVALIDA, INGRESAR UN NUMERO ENTRE 1 Y 100");
                }else {
                    break; 
                }
            }

            estudiante.setCalificacion(calificacion);
        }
        
        //Opcion para generar el archivo 
        Scanner read = new Scanner (System.in);
        String opcion; 
        System.out.println("¿Desea generar el archivo CSV de las calificaciones? Si / No");
        opcion = read.nextLine();

        if(opcion.equals("Si") || opcion.equals("si")){
            File file = new File ("Calificaciones.csv");
            file.delete();
            GenerarArchivo archivo = new GenerarArchivo();
            archivo.generarArchivo(listaEstudiantes);
        } else {
            System.out.println("Archivo no generado");
        }

        
    }

}

