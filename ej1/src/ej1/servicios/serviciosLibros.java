/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.servicios;

import ej1.Entidades.Libros;
import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class serviciosLibros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libros crearLibro() {
        System.out.print("Ingrese el ISBN: ");
        String ISBN = leer.next();
        System.out.print("Ingrese el titulo: ");
        String titulo = leer.next();
        System.out.print("Ingrese el autor: ");
        String autor = leer.next();
        System.out.print("Ingrese el Número de paginas: ");
        int pag = leer.nextInt();

        return new Libros(ISBN, titulo, autor, pag);

    }

    public void mostrarDatos(Libros libro) {
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getISBN());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("No. de Páginas: " + libro.getNumeroPag());

    }

}
