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
    // Atributos
    // ISBN, Título, Autor,Número de páginas
    
    private String ISBN; //ISBN contiene guiones. Ej: 978-3-16-148410-0
    private String titulo;
    private String autor;
    private int numeroPag;

    public Libros(String ISBN, String titulo, String autor, int numeroPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    
    }
    //getters
    public Libros() {
    }

    public String getISBN() {
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
