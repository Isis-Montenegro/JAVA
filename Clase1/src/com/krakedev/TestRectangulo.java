package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		//Rectangulo 1

		Rectangulo r1 = new Rectangulo();
		
		System.out.println("--- Rectangulo 1 (Valores por defecto) ---");
		System.out.println("Base: " + r1.getBase() + " | Altura: " + r1.getAltura());

		r1.setAltura(5);
		r1.setBase(4);

		int resultadoArea = r1.calcularArea();
		double resultadoPerimetro1 = r1.calcularPerimetro();

		System.out.println("--- Rectangulo 1 (Valores modificados) ---");
		System.out.println("Base: " + r1.getBase() + " | Altura: " + r1.getAltura());
		System.out.println("Resultado Perimetro 1: " + resultadoPerimetro1);
		System.out.println("Resultado Area 1: " + resultadoArea);

		// Rectangulo 2
		Rectangulo r2 = new Rectangulo();

		System.out.println("--- Rectangulo 2 (Valores por defecto) ---");
		System.out.println("Base: " + r2.getBase() + " | Altura: " + r2.getAltura());

		r2.setAltura(8);
		r2.setBase(10);

		int resultadoArea2 = r2.calcularArea();
		double resultadoPerimetro2 = r2.calcularPerimetro();

		System.out.println("--- Rectangulo 2 (Valores modificados) ---");
		System.out.println("Base: " + r2.getBase() + " | Altura: " + r2.getAltura());
		System.out.println("Resultado Perimetro 2: " + resultadoPerimetro2);
		System.out.println("Resultado Area 2: " + resultadoArea2);
		
		
		
		
	
	}

	
}
