package semana1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int inicio = 1;
		int fin = 14;
		boolean mostrar = true; // mostrar impares
		
		while ((inicio <= fin)) {
			if (inicio != fin) {
				if (mostrar) {
					if (inicio % 2 == 0) {
						System.out.print(inicio + ",");
					}
				} else {
					if (inicio % 2 != 0) {
						System.out.print(inicio + ",");
					}
				}
			} else {
				System.out.print(inicio);
			}
			inicio++;
		}
		
//		for (int i = inicio; i <= fin; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//			}
//		}
	}

}
