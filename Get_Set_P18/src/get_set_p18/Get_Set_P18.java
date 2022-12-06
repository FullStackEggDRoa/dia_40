/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package get_set_p18;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Get_Set_P18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Scanner leer = new Scanner(System.in);
        Date nacimiento = new Date(91,4,22,15,20,00); // Nacimiento de Carlos Duarte;
        Date nacimiento2 = new Date(75,10,2,11,20,00); // Nacimiento de Mónica Medina;
        
        Persona p1 = new Persona();
        Persona p2 = new Persona("Duarte");
        Persona p3 = new Persona(nacimiento2);
        
        
        // Persona 1
        System.out.println("Ingrese el Nombre de la Persona 1:");
        p1.setNombre(leer.nextLine());  // Equivalente a p1.Nombre = leer.nextLine();
        System.out.println("Ingrese el Apellido: ");
        p1.setApellido(leer.nextLine()); // Equivalente a p1.Apellido = leer.nextLine();
        System.out.println("Ingrese la Nacionalidad: ");
        p1.setNacionalidad(leer.nextLine()); // Equivalente a p1.Nacionalidad = leer.nextLine();
        
        // Persona 2
        System.out.println("Ingrese el Nombre de la Persona 2:");
        p2.setNombre(leer.nextLine());
        System.out.println("Ingrese la Nacionalidad: ");
        p2.setNacionalidad(leer.nextLine());
        p2.setFechaNacimiento(nacimiento); 

        // Persona 3
        System.out.println("Ingrese el Nombre de la Persona 3:");
        p3.setNombre(leer.nextLine());  // Equivalente a p3.Nombre = leer.nextLine();
        System.out.println("Ingrese el Apellido: ");
        p3.setApellido(leer.nextLine()); // Equivalente a p3.Apellido = leer.nextLine();
        System.out.println("Ingrese la Nacionalidad: ");
        p3.setNacionalidad(leer.nextLine()); // Equivalente a p3.Nacionalidad = leer.nextLine();
        
        /*
        System.out.println("Persona1:");
        System.out.println("Nombre: " + p1.Nombre);
        System.out.println("Apellido: " + p1.Apellido);

        System.out.println("Persona2:");
        System.out.println("Nombre: " + p2.Nombre);
        System.out.println("Apellido: " + p2.Apellido);
        System.out.println("");*/
        
        
        System.out.println("Datos mediante Metodo to String");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        System.out.println("Ejemplo Getter");
        
        System.out.println("La edad de Mónica Medina es:"+p3.getEdad());

    }

}
