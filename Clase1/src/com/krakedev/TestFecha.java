package com.krakedev;

public class TestFecha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Fecha f1 = new Fecha();
		
		f1.setAño(2026);
		f1.setDia(11);
		f1.setMes(8);
		
		System.out.println("Año: " + f1.getAño());
		System.out.println("Mes: " + f1.getMes());
		System.out.println("Dia: " + f1.getDia());

		
	}

}
