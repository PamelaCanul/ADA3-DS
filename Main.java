import java.io.File;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        

        LeerArchivo leerArchivo = new LeerArchivo();
        List<Estudiante> listaEstudiantes = leerArchivo.leerArchivo(); 

        //Ingresar calificaciones
        Scanner scanner = new Scanner (System.in);
        int calificacion; 

        for(Estudiante estudiante : listaEstudiantes){
            while(true){
        
                System.out.println("Ingrese la calificacion de " + estudiante.getPrimerApellido() + " " + estudiante.getSegundoApellido() + " " + estudiante.getNombres() + ": ");
                try{
                    calificacion = scanner.nextLine();
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
        } else {
            System.out.println("Archivo no generado");
        }
    }

}
