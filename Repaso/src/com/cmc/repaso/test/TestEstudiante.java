package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Ana");
		e1.calificar(7.5);
		System.out.println(e1.getNombre() + " | Nota: " + e1.getNota() + " | Resultado: " + e1.getResultado());

		Estudiante e2 = new Estudiante("Luis");
		e2.calificar(9.0);
		System.out.println(e2.getNombre() + " | Nota: " + e2.getNota() + " | Resultado: " + e2.getResultado());
	}

}