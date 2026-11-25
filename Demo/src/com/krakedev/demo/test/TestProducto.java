package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto p1 = new Producto(106, "Teclado Gamer");
		
		p1.setDescripcion("Teclado Gamer con colores");
		p1.setPeso(0.88);
		
		System.out.println("---------Detalle Del Producto----------");
		System.out.println("Codigo: " + p1.getCodigo());
		System.out.println("Nombre: " + p1.getNombre());
		System.out.println("Descripcion: " + p1.getDescripcion());
		System.out.println("Peso: " + p1.getPeso());
		
		
	}

}
