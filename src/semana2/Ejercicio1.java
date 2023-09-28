package semana2;

import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// (a)
		
//		String miPalabra = "Palabrita";
//		char miLetra = 'a';
//		int ocurrencias = 0;
//		
//		for (int i = 0; i < miPalabra.length(); i++) {
//			
//			char letraActual = miPalabra.charAt(i);
//			
//			if (letraActual == miLetra) {
//				ocurrencias++;
//			}
//		}
//		
//		System.out.println("La cantidad de apariciones de "+ miLetra + " es " + ocurrencias);
		
		// (b)

//		int n1 = 5;
//		int n2 = 7;
//		int n3 = 6;	
//		
//		boolean descendente = true;
//		
//		int[] listaNros = {n1,n2,n3};
//		
//		if (descendente) {
//			for (int i = 0; i < listaNros.length - 1; i++) {
//				for (int j = i + 1; j < listaNros.length; j++) {
//					if (listaNros[i] < listaNros[j]) {
//						int t = listaNros[i];
//						listaNros[i] = listaNros[j];
//						listaNros[j] = t;
//					}
//				}
//			}
//		} else {
//			for (int i = 0; i < listaNros.length - 1; i++) {
//				for (int j = i + 1; j < listaNros.length; j++) {
//					if (listaNros[i] > listaNros[j]) {
//						int t = listaNros[i];
//						listaNros[i] = listaNros[j];
//						listaNros[j] = t;
//					}
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(listaNros));
		
//		(c)
		
		int[] nros = {3, 4, 5, 6, 7, 8};
		
		int nroX = 5;
		
		int suma = 0;
		
		for (int i = 0; i < nros.length; i++) {
			if (nros[i] > nroX) {
				suma = suma + nros[i];
			}
		}
		
		System.out.println(suma);
		
 	}
}
