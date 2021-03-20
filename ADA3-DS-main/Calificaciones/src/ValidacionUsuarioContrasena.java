/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivanj
 */
public class ValidacionUsuarioContrasena {

    private String usuario; 
    private String contrasena; 
    private String usuarioValido; 
    private String contrasenaValida; 

    public ValidacionUsuarioContrasena (String usuario, String contrasena, String usuarioValido, String contrasenaValida){
        this.usuario = usuario; 
        this.contrasena = contrasena; 
        this.usuarioValido = usuarioValido; 
        this.contrasenaValida = contrasenaValida; 
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuarioValido() {
        return usuarioValido;
    }

    public void setUsuarioValido(String usuarioValido) {
        this.usuarioValido = usuarioValido;
    }

    public String getContrasenaValida() {
        return contrasenaValida;
    }

    public void setContrasenaValida(String contrasenaValida) {
        this.contrasenaValida = contrasenaValida;
    }

    public int validacion (String usuario, String contrasena, String usuarioValido, String contrasenaValida){

        int mensaje;
        
        if(usuario.equals(usuarioValido)){
            
            if(contrasena.equals(contrasenaValida)){
                System.out.print("Acceso Permitido\n");
                mensaje=1;
            }else{
                System.out.print("Contraseña Incorrecta \n Acceso Denegado\n");
                mensaje=0;
            }
        }else {
            System.out.print("Usuario Incorrecto \n Acceso Denegado\n");
            mensaje=0;
        }
        
        return mensaje; 
    }
    
    
}
