
package com.mycompany.ejercicio2parcial;

public class Ejercicio2Parcial {

    public static void main(String[] args) {
        
        //Objeto Libro
        Libro L1 = new Libro(254, 238, "Teoria de la Relatividad", "Albert Einstein");
        Libro L2 = new Libro(356, 345, "Psicologia Oscura", "Nicollo Maquiavelo");
        
        System.out.println("Especificaciones del libro #1:");
        L1.MostrarInformacion();
        
        System.out.println("Especificaciones del libro #2:");
        L2.MostrarInformacion();
        
        //Mostrar cual tiene mas paginas
        if (L1.getNumeroPaginas() > L2.getNumeroPaginas()) {
            System.out.println("El libro #1 tiene mas paginas");
        
        } else {
            System.out.println("El libro #2 tiene mas paginas");
        }
    }
}
