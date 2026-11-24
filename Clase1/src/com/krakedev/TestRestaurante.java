package com.krakedev;

public class TestRestaurante {
	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		Restaurante rest2 = new Restaurante();
		
		System.out.println("-----VALORES POR DEFECTO-----");
		System.out.println("Restaurante 1: " + rest1.getNombre() + " | " + rest1.getDireccion() + " | " + rest1.getCalificacion());
		System.out.println("Restaurante 2: " + rest2.getNombre() + " | " + rest2.getDireccion() + " | " + rest2.getCalificacion());

		rest1.setNombre("Parrillada");
		rest1.setDireccion("Av. Unicornio");
		rest1.setCalificacion(4.8);

		rest2.setNombre("Sushi");
		rest2.setDireccion("Av. Dragon");
		rest2.setCalificacion(4.3);

		System.out.println("-----VALORES MODIFICADOS-----");
		System.out.println("Restaurante 1: " + rest1.getNombre() + " | " + rest1.getDireccion() + " | " + rest1.getCalificacion());
		System.out.println("Restaurante 2: " + rest2.getNombre() + " | " + rest2.getDireccion() + " | " + rest2.getCalificacion());
		
		
	}

}
   