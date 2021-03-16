import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LeerArchivo {
    
    public List<Estudiante> leerArchivo () throws FileNotFoundException, IOException {
        
        List<Estudiante> listaEstudiantes = new ArrayList<>(); 
        try{
        BufferedReader bufferedReader= new BufferedReader(new FileReader("lista.csv"));

        String columna; 

        while((columna = bufferedReader.readLine()) !=null){
            String[] parte = columna.split(",");
            Estudiante estudiante = new Estudiante(Integer.valueOf(parte[0]), parte[1], parte[2], parte[3]); 
            listaEstudiantes.add(estudiante); 
        }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return listaEstudiantes; 

    }

}

