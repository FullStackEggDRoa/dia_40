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
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
   
   public Libros crearLibro () {
       System.out.println("ingrese el ISBN");
       int ISBN = leer.nextInt();
       System.out.println("ingrese el titulo del libro");
       String titulo = leer.next();
       System.out.println("ingrese el autor");
       String autor = leer.next();
       System.out.println("ingrese el numero de paginas");
       int pag = leer.nextInt();
       
       return new Libros(ISBN, titulo, autor, pag);
           
      
    
}    
    
   public void mostrarDatos (Libros lib) {
       System.out.println("titulo: " +lib.getTitulo());
       System.out.println("ISBN: " +lib.getISBN());
       System.out.println("autor: " +lib.getAutor());
       System.out.println("paginas: " +lib.getNumeroPag());
       
   }
   
}
