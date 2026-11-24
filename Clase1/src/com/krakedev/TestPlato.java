package com.krakedev;

public class TestPlato {
	public static void main(String[] args) {
		
		Plato platoA = new Plato("Ceviche de Camarón", "Entrada", 7.50, true);
		Plato platoB = new Plato("Lomo Saltado", "Plato fuerte", 12.00, true);
		Plato platoC = new Plato("Tiramisú", "Postre", 5.25, false);

		System.out.println("--- PLATOS CREADOS ---");
		System.out.println("Plato A: " + platoA.getNombre() + " | " + platoA.getTipo() + " | $" + platoA.getPrecio() + " | Disponible: " + platoA.isDisponible());
		System.out.println("Plato B: " + platoB.getNombre() + " | " + platoB.getTipo() + " | $" + platoB.getPrecio() + " | Disponible: " + platoB.isDisponible());
		System.out.println("Plato C: " + platoC.getNombre() + " | " + platoC.getTipo() + " | $" + platoC.getPrecio() + " | Disponible: " + platoC.isDisponible());
		
	}

}
