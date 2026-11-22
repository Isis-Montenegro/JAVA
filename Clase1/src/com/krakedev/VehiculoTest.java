package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {

		Vehiculo v;
		
		v = new Vehiculo();
		
		System.out.println("Vehiculo 1 : =====================Creado========================");
		
		System.out.println("Año:" + v.año);
		System.out.println("Marca:" + v.marca);
		System.out.println("Color:" + v.color);
		System.out.println("Modelo:" + v.modelo);
		 

		v.año = "2010";
		v.color = "Rojo";
		v.marca = "Jeep";
		v.modelo = "Rubicon";
		
		System.out.println("Vehiculo 1 : =========================Valores agregados==================");
		
		System.out.println("Año:" + v.año);
		System.out.println("Marca:" + v.marca);
		System.out.println("Color:" + v.color);
		System.out.println("Modelo:" + v.modelo);
		
		
		
		System.out.println("Vehiculo 2 : =====================Creado========================");
		
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("Año:" + v.año);
		System.out.println("Marca:" + v.marca);
		System.out.println("Color:" + v.color);
		System.out.println("Modelo:" + v.modelo);
		
		System.out.println("Vehiculo 2 : =========================Valores agregados==================");
		
		v.año = "2023";
		v.color = "Blanco";
		v.marca = "BMW";
		v.modelo = "911";
		
		System.out.println("Año:" + v2.año);
		System.out.println("Marca:" + v2.marca);
		System.out.println("Color:" + v2.color);
		System.out.println("Modelo:" + v2.modelo);
		
		

		

	}

}
