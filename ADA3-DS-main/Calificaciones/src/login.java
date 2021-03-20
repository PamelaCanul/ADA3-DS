
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class login {
    
     public List<Usuarios> leerArchivo () throws FileNotFoundException, IOException {
        
        List<Usuarios> listaUsuarios = new ArrayList<>(); 
        try{
        BufferedReader bufferedReader= new BufferedReader(new FileReader("usuarios.csv"));

        String columna; 

        while((columna = bufferedReader.readLine()) !=null){
            String[] parte = columna.split(",");
            Usuarios usuarios = new Usuarios(String.valueOf(parte[0]), String.valueOf(parte[1])); 
            listaUsuarios.add(usuarios); 
        }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return listaUsuarios; 

    }

}
