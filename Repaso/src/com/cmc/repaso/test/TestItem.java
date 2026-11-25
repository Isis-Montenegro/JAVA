package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// Producto 1
		Item item1 = new Item();
		item1.setNombre("Mouse");
		item1.setProductosActuales(20);

		System.out.println("=== VALORES INICIALES ===");
		item1.imprimir();

		item1.vender(5);
		item1.devolver(2);

		System.out.println("=== DESPUÉS DE VENDER Y DEVOLVER ===");
		item1.imprimir();

		// Producto 2
		Item item2 = new Item();
		item2.setNombre("Teclado");
		item2.setProductosActuales(20);

		System.out.println("\n=== VALORES INICIALES ===");
		item2.imprimir();

		item2.vender(10);
		item2.devolver(3);

		System.out.println("=== DESPUÉS DE VENDER Y DEVOLVER ===");
		item2.imprimir();
	}

}