/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1_brauliocalix;

/**
 *
 * @author User
 */
public class libros {

    private String titulo;
    private String descrip;
    private int punt;
    private int copias;
    private String genero;
    private int valor;
    private String edicion;
    private String autor;
    private String anio;

    public libros() {
    }

    public libros(String titulo, String descrip, int punt, int copias, String genero, int valor, String edicion, String autor, String anio) {
        this.titulo = titulo;
        this.descrip = descrip;
        this.punt = punt;
        this.copias = copias;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPunt() {
        return punt;
    }

    public void setPunt(int punt) {
        this.punt = punt;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "libros{" + "titulo=" + titulo + ", copias=" + copias + ", genero=" + genero + ", anio=" + anio + '}';
    }

}
