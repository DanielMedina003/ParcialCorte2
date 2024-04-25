
package com.mycompany.ejercicio1parcial;

public class Persona {
    
     
    //Atributos
    private String Nombre, Apellido;
    private int ID, AñoNacimiento;
    
    //Contructor
    public Persona( String Nombre, String Apellido, int ID, int AñoNacimiento ){
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
        this.AñoNacimiento = AñoNacimiento;
    }
    
    //Metodo para ImprimirDatos
    public void ImprimirDatos(){
        
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("ID: " + ID);
        System.out.println("Año de Nacimiento: " + AñoNacimiento + "\n");   
  }
}