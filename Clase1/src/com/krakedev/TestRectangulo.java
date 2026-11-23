package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		//Rectangulo 1

		Rectangulo r1 = new Rectangulo();
		
		r1.altura = 5;
		r1.base = 4;
		
		
		int resultadoArea = r1.calcularArea();
		double resultadoPerimetro1 = r1.calcularPerimetro();
		
		System.out.println("Resultado Perimetro 1: " + resultadoPerimetro1);		
		System.out.println("Resultado Area 1:  " + resultadoArea);
		
		//Rectangulo 2
		
		Rectangulo r2 = new Rectangulo();
		
		r2.altura = 8;
		r2.base = 10;
		
		
		int resultadoArea2 = r2.calcularArea();
		double resultadoPerimetro2 = r2.calcularPerimetro();
		
		System.out.println("Resultado Perimetro 2: " + resultadoPerimetro2);
		System.out.println("Resultado Area 2: " + resultadoArea2);
		
		
	
	}

	
}
