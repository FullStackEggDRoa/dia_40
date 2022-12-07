/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.Entidades;

/**
 *
 * @author Dai
 */
public class Libros {
    //ISBN, Título, Autor,Número de páginas
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPag;

    public Libros(int ISBN, String titulo, String autor, int numeroPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    
    }

    public Libros() {
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }
    
    
    
           
}
