import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.*;

public class GenerarArchivo {
    
    public void generarArchivo (List<Estudiante> listaEstudiante){

        BufferedWriter bufferedWriter = new BufferedWriter();
        try {
            for(int i = 0; i<listaEstudiante.size(); i++){
                bufferedWriter.write(listaEstudiante.get(i).getMatricula()+ "," + listaEstudiante.get(i).getAsignatura() + "," + listaEstudiante.get(i).getCalificacion()+"\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }

    }

}
