package com.cmc.repaso.entidades;

public class Item {

	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public void imprimir() {
		System.out.println("----- " + nombre + " -----");
		System.out.println("Productos Actuales: " + productosActuales);
		System.out.println("Productos Vendidos: " + productosVendidos);
		System.out.println("Productos Devueltos: " + productosDevueltos);
	}

	public void vender(int cantidad) {
		this.productosActuales -= cantidad;
		this.productosVendidos += cantidad;
	}

	public void devolver(int cantidad) {
		this.productosActuales += cantidad;
		this.productosVendidos -= cantidad;
		this.productosDevueltos += cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

}