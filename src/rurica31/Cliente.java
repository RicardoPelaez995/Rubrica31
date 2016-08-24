/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rurica31;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String correo;
    private String identificacion;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String telefono, String direccion, String correo, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.identificacion = identificacion;
    }
    
    
}
