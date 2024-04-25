
package com.mycompany.ejercicio3parcial;


public class Electrodomestico {

	private double precio;
	private String color;
	private char consumo;
	private double peso;	
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public char getConsumo() {
		return this.consumo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	private double calcularPrecio() {
		double pesoPorPrecio = 0;
	
		this.comprobarConsumoEnergetico(this.consumo);
			
		if(this.peso >= 0 && this.peso <= 19) {
			pesoPorPrecio = 19;
		} else if(this.peso >= 20 && this.peso <= 49) {
			pesoPorPrecio = 50;
		} else if(this.peso >= 50 && this.peso <= 79) {
			pesoPorPrecio = 80;
		}	else {
			pesoPorPrecio = 100;
		}
		
		this.precio += pesoPorPrecio;
		return this.precio;
	}	
	
	Electrodomestico(int par, int par1, String blanco, int par2) {
		this.color = "Blanco";
		this.consumo = 'F';
		this.peso = 5;
		this.precio = 100.00;
	}
	
	Electrodomestico(double precio, double peso) {
		this.color = "Blanco";
		this.consumo = 'F';
		this.peso = peso;
		this.precio = precio;	
	}
	
	Electrodomestico(double precio, double peso, String color, char consumo) {
		this.precio = precio;
		this.peso = peso;
		
		this.comprobarColor(this.color);
		
		this.consumo = consumo;
	}
	
	public void comprobarConsumoEnergetico(char letra) {
		boolean exist = false;
		
		switch(letra) {
			case 'A':
				exist = true;
				this.precio = 100;
			break;
			case 'B':
				exist = true;
				this.precio = 80;
			break;
			case 'C':
				exist = true;
				this.precio = 60;
			break;
			case 'D':
				exist= true;
				this.precio = 50;
			break;
			case 'E':
				exist = true;
				this.precio = 30;
			break;
			case 'F':
				exist = true;
				this.precio = 10;
			break;
		}
		
		if(exist) {
		this.consumo = letra;
		}
	}
	
	public void comprobarColor(String color) {
		if(color == "Negro" || color == "Azul"
			|| color == "Gris" || color == "Rojo") {
			this.color = color;
		} else {
			this.color = "Blanco";
		}		
	}
	
	public double precioFinal() {
		return calcularPrecio();
	}
	
}

