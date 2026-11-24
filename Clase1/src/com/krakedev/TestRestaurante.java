package com.krakedev;

public class TestRestaurante {
	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante("Parrillada", "Av. Unicornio", 4.8);
		Restaurante rest2 = new Restaurante("Sushi", "Av. Dragon", 4.3);

		System.out.println("-----RESTAURANTES CREADOS-----");
		System.out.println("Restaurante 1: " + rest1.getNombre() + " | " + rest1.getDireccion() + " | " + rest1.getCalificacion());
		System.out.println("Restaurante 2: " + rest2.getNombre() + " | " + rest2.getDireccion() + " | " + rest2.getCalificacion());
		
	}

}
   