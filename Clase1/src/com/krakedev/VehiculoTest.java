package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {

		Vehiculo v;
		
		v = new Vehiculo();
		
		System.out.println("Vehiculo 1 : =====================Creado========================");
		
		System.out.println("Año:" + v.getAño());
		System.out.println("Marca:" + v.getMarca());
		System.out.println("Color:" + v.getColor());
		System.out.println("Modelo:" + v.getModelo());
		 

		v.setAño("2010"); 
		v.setMarca("Jeep");
		v.setColor("Rojo");
		v.setModelo("Rubicon");
		
		
		System.out.println("Vehiculo 1 : =========================Valores agregados==================");
		
		System.out.println("Año:" + v.getAño());
		System.out.println("Marca:" + v.getMarca());
		System.out.println("Color:" + v.getColor());
		System.out.println("Modelo:" + v.getModelo());
		
		
		
		System.out.println("Vehiculo 2 : =====================Creado========================");
		
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("Año:" + v.getAño());
		System.out.println("Marca:" + v.getMarca());
		System.out.println("Color:" + v.getColor());
		System.out.println("Modelo:" + v.getModelo());
		
		System.out.println("Vehiculo 2 : =========================Valores agregados==================");
		
		v.setAño("2026"); 
		v.setMarca("BYD");
		v.setColor("Celeste");
		v.setModelo("Seal");
		
		System.out.println("Año:" + v2.getAño());
		System.out.println("Marca:" + v2.getMarca());
		System.out.println("Color:" + v2.getColor());
		System.out.println("Modelo:" + v2.getModelo());
		
		

		

	}

}
