package clase3;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		final String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		
		String miPalabra = "hola que tal";
		
		int desplazamiento = 2;
		
		String nuevaPalabra = "";
		
		
		for (int i = 0; i < miPalabra.length(); i++) {
			
			int indexDeNuevaLetra = abecedario.indexOf(miPalabra.charAt(i));
			
			char nuevaLetra = abecedario.charAt(indexDeNuevaLetra + desplazamiento);
			
			nuevaPalabra = nuevaPalabra + nuevaLetra;
		}
		
		System.out.println(nuevaPalabra);

	}

}
