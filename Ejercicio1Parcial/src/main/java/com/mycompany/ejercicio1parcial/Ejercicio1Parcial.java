
package com.mycompany.ejercicio1parcial;

public class Ejercicio1Parcial {

    public static void main(String[] args) {
        
          //Creamos los dos Objetos_Persona
        Persona p1 = new Persona("Daniel", "Medina", 1061706353, 2006);
        Persona p2 = new Persona("Anyi", "Beltran", 1059236529, 2000);
        
        //Imprimir Datos
        System.out.println("Datos de la Persona #1:");
        p1.ImprimirDatos();
        
        System.out.println("Datos de la Persona #2:");
        p2.ImprimirDatos();
    }
}
