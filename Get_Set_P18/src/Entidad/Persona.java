/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author droa
 */
public class Persona {
    // Atributos
    private String Nombre;
    private String Apellido;
    private String Nacionalidad;
    private Date fechaNacimiento;
    private int Edad;
    
    // Contructor
    
    public Persona() {
    }

    public Persona(String Apellido) {
        this.Apellido = Apellido;
    }     
    
    public Persona(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        Date fechaActual=new Date(122,11,6,18,10,00);
        Edad=fechaActual.getYear()-fechaNacimiento.getYear();
    }

    public Persona(String Nombre, String Apellido, String Nacionalidad, Date fechaNacimiento, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacionalidad = Nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.Edad = Edad;
    }
       
    // Métodos Propios

    //Getters
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return Edad;
    }
    
    //Setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
    // to String
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Nacionalidad=" + Nacionalidad + ", fechaNacimiento=" + fechaNacimiento + ", Edad=" + Edad + '}';
    }
    
            
}
