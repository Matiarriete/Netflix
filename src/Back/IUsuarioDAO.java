/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

/**
 *
 * @author matia
 */
public interface IUsuarioDAO {
    
    public boolean registrarUsuario(Usuario user);
    public boolean mailDisponible(String mail);
    public boolean verificarContrasena(String contrasena);
    public boolean verificarMail(String mail);
    public boolean inicioSesion(Usuario user);
    public int obtenerId(Usuario user);
}
