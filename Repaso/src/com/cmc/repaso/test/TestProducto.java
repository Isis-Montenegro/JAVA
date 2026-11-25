package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Audífonos", 50.0);

		p1.setPrecio(-80.0);
		System.out.println("Producto: " + p1.getNombre());
		System.out.println("Precio: $" + p1.getPrecio());

		double precioPromo = p1.calcularPrecioPromo(20);
		System.out.println("Precio con 20% de descuento: $" + precioPromo);
	}

}