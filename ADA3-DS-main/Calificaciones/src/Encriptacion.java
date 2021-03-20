public class Encriptacion {
    private String contrasena; 
    private char array[];  

    public Encriptacion(String contrasena, char array []) {
        this.contrasena=contrasena;
        this.array = array; 
    }

    public char[] getArray() {
        return array;
    }

    public void setArray(char[] array) {
        this.array = array;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String encriptar(String contrasena, char array[]){
        String encriptado; 
        array = contrasena.toCharArray();
        for(int i = 0; i< array.length;i++){

            array[i] = (char) (array [i] + (char) 5);  

        }

        encriptado = String.valueOf(array);

        return encriptado; 
    }   
}
