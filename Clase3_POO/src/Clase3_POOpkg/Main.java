package Clase3_POOpkg;

import java.time.LocalDateTime;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		Animal objetoNuevo1= new Animal(1, "Lía","Gato", 2020);
		Animal objetoNuevo2= new Animal(2, "Nena","Perro", 2024);

		objetoNuevo1.ImprimirDatos();
		objetoNuevo2.ImprimirDatos();
	}

}
