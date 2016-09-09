/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnosticostevenortiz;

/**
 *
 * @author estudiante
 */
public class Estudiante {
    //Son datos basicos del estudiante
    private String nombre;
    private String apellidos;
    private String correo;
    private String direccion;
    private int cedula;
    private int celular;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String correo, String direccion, int cedula, int celular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.direccion = direccion;
        this.cedula = cedula;
        this.celular = celular;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public int getCelular() {
        return celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", direccion=" + direccion + ", cedula=" + cedula + ", celular=" + celular + '}';
    }
    
    
}
