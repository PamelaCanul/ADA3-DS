import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class GenerarArchivo {
    
    public void generarArchivo (List<Estudiante> listaEstudiante) throws FileNotFoundException, UnsupportedEncodingException{

       
        try {
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Calificaciones.csv", true), "utf-8"));
            for(int i = 0; i<listaEstudiante.size(); i++){
                bufferedWriter.write(listaEstudiante.get(i).getMatricula()+ "," + listaEstudiante.get(i).getAsignatura() + "," + listaEstudiante.get(i).getCalificacion()+"\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }

    }

}
