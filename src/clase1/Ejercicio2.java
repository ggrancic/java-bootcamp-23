package clase1;

public class Ejercicio2 {

	public static void main(String[] args) {
		double ingresosMensuales = 200000.000;
		int cantidadVehiculos = 2;
		int cantidadDeInmuebles = 1;
		boolean poseeLujo = true;
		
		if (ingresosMensuales >= 489000.083 || cantidadVehiculos >= 3 || cantidadDeInmuebles >= 3 || poseeLujo) {
			System.out.println("Pertenece al segmento de ingresos altos");
		} else {
			System.out.println("No pertenece al segmento de ingresos altos");
		}
	}

}
