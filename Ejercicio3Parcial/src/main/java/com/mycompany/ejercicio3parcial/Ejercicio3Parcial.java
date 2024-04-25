
package com.mycompany.ejercicio3parcial;


public class Ejercicio3Parcial {

    public static void main(String[] args) {
        
        Electrodomestico electrodomestico1 = new Electrodomestico(1200000, 40, "Blanco", 60);
        
        electrodomestico1.comprobarColor("Blanco");
        electrodomestico1.comprobarConsumoEnergetico('C');
        
        System.out.println("El costo de la lavadora es: " );
        
    }
}
