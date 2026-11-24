package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v = new Vehiculo("Jeep", "Rubicon", "2010", "Rojo");
		
		System.out.println("Vehiculo 1 : =====================Creado========================");
		System.out.println("Año:" + v.getAño());
		System.out.println("Marca:" + v.getMarca());
		System.out.println("Color:" + v.getColor());
		System.out.println("Modelo:" + v.getModelo());
		 
		
		
		
		System.out.println("Vehiculo 2 : =====================Creado========================");
		
		Vehiculo v2 = new Vehiculo("BMW", "911", "2023", "Blanco");
		
		System.out.println("Año:" + v2.getAño());
		System.out.println("Marca:" + v2.getMarca());
		System.out.println("Color:" + v2.getColor());
		System.out.println("Modelo:" + v2.getModelo());
		
		

		

	}

}
