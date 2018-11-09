/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1_brauliocalix;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class usuarios {

    private String user;
    private String contra;
    private String fecha;
    private String numero;
    private String correo;
    private String nombre;
    private String genero;
    private ArrayList<usuarios> amigos;
    private ArrayList<libros> libros;

    public usuarios() {
    }

    public usuarios(String user, String contra) {
        this.user = user;
        this.contra = contra;
    }

    public usuarios(String user, String contra, String fecha, String numero, String correo, String nombre, String genero, ArrayList<usuarios> amigos, ArrayList<libros> libros) {
        this.user = user;
        this.contra = contra;
        this.fecha = fecha;
        this.numero = numero;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
        this.amigos = amigos;
        this.libros = libros;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<usuarios> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<usuarios> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<libros> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "usuarios{" + "user=" + user + ", genero=" + genero + ", amigos=" + amigos + ", libros=" + libros + '}';
    }

}
