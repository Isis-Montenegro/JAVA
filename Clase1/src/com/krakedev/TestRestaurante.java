package com.krakedev;

public class TestRestaurante {
	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		Restaurante rest2 = new Restaurante();
		
		rest1.nombre = "Parrillada";
		rest1.direccion = "Av. Unicornio";
		rest1.calificacion = 4.8;
		
		rest2.nombre = "Sushi";
		rest2.direccion = "Av. Dragon";
		rest2.calificacion = 4.3;
		
		System.out.println("-----VALORES MODIFICADOS-----");
		System.out.println("Restaurante 1:" + rest1.nombre + "|" + rest1.direccion + "|" + rest1.calificacion);
		System.out.println("Restaurante 2:" + rest2.nombre + "|" + rest2.direccion + "|" + rest2.calificacion);
		
		
	}

}
   