package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {

		// 1. Creación de instancias con diferentes constructores
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);

		Cuenta cuenta2 = new Cuenta("03476", "C", 98);

		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");

		// 2. Visualización inicial
		System.out.println("-------- Valores Iniciales --------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		// 3. Modificación de valores (Reto Adicional)
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");

		System.out.println("-------- Valores Modificados --------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		// 4. Creación de 3 cuentas adicionales usando constructores sobrecargados
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setSaldo(10);

		Cuenta cuenta5 = new Cuenta("0557", "C", 10);

		Cuenta cuenta6 = new Cuenta("0666");

		System.out.println("-------- Cuentas Adicionales Con (Mi Estilo) --------");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();

	}

}
