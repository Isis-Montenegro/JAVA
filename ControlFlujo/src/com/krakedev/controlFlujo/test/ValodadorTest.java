package com.krakedev.controlFlujo.test;

import com.krakedev.controlFlujo.Validador;

public class ValodadorTest {

	public static void main(String[] args) {

		Validador v1 = new Validador();
		
		v1.validarEdad(5);
		v1.validarEdad(15);
		v1.validarEdad(18);
		v1.validarEdad(2);
		v1.validarEdad(20);
		v1.validarEdad(80);
		v1.validarEdad(32);
		v1.validarEdad(16);
		v1.validarEdad(8);
		
	}

}
