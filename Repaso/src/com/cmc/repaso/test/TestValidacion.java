package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion = new Validacion();

		System.out.println("Monto 80: " + validacion.validarMonto(80));
		System.out.println("Monto 0: " + validacion.validarMonto(0));
		System.out.println("Monto -10: " + validacion.validarMonto(-10));
	}

}

