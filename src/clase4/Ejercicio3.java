package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta1 = "/home/gian/Documents/java-bootcamp-23/src/clase4/archivoEntrada.txt";
		String ruta2 = "/home/gian/Documents/java-bootcamp-23/src/clase4/archivoSalida.txt";
		
		try {
			encoderDecoder("d", 1, ruta1, ruta2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void encoderDecoder(String operacion, int desplazamiento, String archivo1, String archivo2) throws IOException {
		Path pathA1 = Paths.get(archivo1);
		List<String> miArchivo1 = Files.readAllLines(pathA1);
		
		Path pathA2 = Paths.get(archivo2);
		List<String> miArchivo2 = Files.readAllLines(pathA2);
		
		if (operacion == "e") {
			for (String linea : miArchivo1) {	
				Files.writeString(pathA2, encoder(linea, desplazamiento));
			}
		} else if (operacion == "d") {
			for (String linea : miArchivo1) {	
				Files.writeString(pathA2, decoder(linea, desplazamiento));
			}
		} else {
			System.out.println("Operacion incorrecta");
		}
	}
	
	public static String encoder(String cadenaDeEntrada, int desplazamiento) {
		final String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String nuevaPalabra = "";
		
		for (int i = 0; i < cadenaDeEntrada.length(); i++) {
			
			int indexDeNuevaLetra = abecedario.indexOf(cadenaDeEntrada.charAt(i));
			
			char nuevaLetra = abecedario.charAt(indexDeNuevaLetra + desplazamiento);
			
			nuevaPalabra = nuevaPalabra + nuevaLetra;
		}
		
		return nuevaPalabra;
		
	}
	
	public static String decoder(String cadenaDeEntrada, int desplazamiento) {
		final String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String nuevaPalabra = "";
		char nuevaLetra;
		
		for (int i = 0; i < cadenaDeEntrada.length(); i++) {
			
			int indexDeNuevaLetra = abecedario.indexOf(cadenaDeEntrada.charAt(i));
			
			if (indexDeNuevaLetra == 0) {
				nuevaLetra = ' ';
			} else {
				nuevaLetra = abecedario.charAt(indexDeNuevaLetra - desplazamiento);
			}
			
			nuevaPalabra = nuevaPalabra + nuevaLetra;
		}
		
		return nuevaPalabra;
		
	}

}
