package com.krakedev;

public class TestPlato {
	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		Plato platoB = new Plato();
		Plato platoC = new Plato();
		
		platoA.nombre = "Ceviche de Camarón";
        platoA.tipo = "Entrada";
        platoA.precio = 7.50;
        platoA.disponible = true;

        platoB.nombre = "Lomo Saltado";
        platoB.tipo = "Plato fuerte";
        platoB.precio = 12.00;
        platoB.disponible = true;

        platoC.nombre = "Tiramisú";
        platoC.tipo = "Postre";
        platoC.precio = 5.25;
        platoC.disponible = false;

        System.out.println("--- VALORES MODIFICADOS ---");
        System.out.println("Plato A: " + platoA.nombre + " | " + platoA.tipo + " | $" + platoA.precio + " | Disponible: " + platoA.disponible);
        System.out.println("Plato B: " + platoB.nombre + " | " + platoB.tipo + " | $" + platoB.precio + " | Disponible: " + platoB.disponible);
        System.out.println("Plato C: " + platoC.nombre + " | " + platoC.tipo + " | $" + platoC.precio + " | Disponible: " + platoC.disponible);
		
	}

}
