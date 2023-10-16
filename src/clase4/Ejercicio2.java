package clase4;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		String rutaDelArchivo = "/home/gian/Documents/java-bootcamp-23/src/clase4/miArchivo.txt";
		String operacion = "+";
		
		operarNumerosArchivo(rutaDelArchivo, operacion);
	}
	
	public static void operarNumerosArchivo(String ruta, String operacion) throws IOException {
		double suma = 0;
		double producto = 1;
		Path path = Paths.get(ruta);
		List<String> miArchivo = Files.readAllLines(path);
		
		if (operacion == "+") {
			for (String linea : miArchivo) {
				suma = suma + Double.parseDouble(linea);
			}
			System.out.println(suma);
		} else if (operacion == "*") {
			for (String linea : miArchivo) {
				producto = producto * Double.parseDouble(linea);
			}
			System.out.println(producto);
		} else {
			System.out.println("Operacion incorrecta");
		}
		
	}

}
