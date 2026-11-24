package com.krakedev;

public class TestCuadrado {

    public static void main(String[] args) {

        // Cuadrado 1
        Cuadrado c1 = new Cuadrado();
        c1.lado = 4;

        double area1 = c1.calcularArea();
        double perimetro1 = c1.calcularPerimetro();

        System.out.println("Area cuadrado 1: " + area1);
        System.out.println("Perimetro cuadrado 1: " + perimetro1);

        // Cuadrado 2
        Cuadrado c2 = new Cuadrado();
        c2.lado = 3;

        double area2 = c2.calcularArea();
        double perimetro2 = c2.calcularPerimetro();

        System.out.println("Area cuadrado 2: " + area2);
        System.out.println("Perimetro cuadrado 2: " + perimetro2);

        // Cuadrado 3
        Cuadrado c3 = new Cuadrado();
        c3.lado = 7;

        double area3 = c3.calcularArea();
        double perimetro3 = c3.calcularPerimetro();

        System.out.println("Area cuadrado 3: " + area3);
        System.out.println("Perimetro cuadrado 3: " + perimetro3);
    }

}
