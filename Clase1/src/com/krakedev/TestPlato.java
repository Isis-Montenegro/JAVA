package com.krakedev;

public class TestPlato {
	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		Plato platoB = new Plato();
		Plato platoC = new Plato();
		
	
		platoA.setNombre("Ceviche de Camarón");
		platoA.setTipo("Entrada");
		platoA.setPrecio(7.50);
		platoA.setDisponible(true);

		platoB.setNombre("Lomo Saltado");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(12.00);
		platoB.setDisponible(true);

		platoC.setNombre("Tiramisú");
		platoC.setTipo("Postre");
		platoC.setPrecio(5.25);
		platoC.setDisponible(false);

		System.out.println("-------- PLATOS --------");
		System.out.println("Plato A: " + platoA.getNombre() + " | " + platoA.getTipo() + " | $" + platoA.getPrecio() + " | Disponible: " + platoA.isDisponible());
		System.out.println("Plato B: " + platoB.getNombre() + " | " + platoB.getTipo() + " | $" + platoB.getPrecio() + " | Disponible: " + platoB.isDisponible());
		System.out.println("Plato C: " + platoC.getNombre() + " | " + platoC.getTipo() + " | $" + platoC.getPrecio() + " | Disponible: " + platoC.isDisponible());
		
	}

}
