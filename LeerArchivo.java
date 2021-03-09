import java.io.BufferedReader;
import java.util.*;

public class LeerArchivo {
    
    public List<Estudiante> leerArchivo () {
        
        List<Estudiante> listaEstudiantes = new ArrayList<>(); 
        
        BufferedReader bufferedReader= new BufferedReader(new FileReader("lista.csv"));

        String columna; 

        while((columna = bufferedReader.readLine()) !=null){
            String[] parte = columna.split(",");
            Estudiante estudiante = new Estudiante(Integer.valueOf(parte[0]), parte[1], parte[2], parte[3]); 
            listaEstudiantes.add(estudiante); 
        }

        return listaEstudiantes; 

    }

}
