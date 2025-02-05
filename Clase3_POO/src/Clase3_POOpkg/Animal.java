package Clase3_POOpkg;

import java.time.LocalDateTime;

public class Animal {
	public int id;
	public String nombre;
	public String tipo;
	public int anio_nacimiento;
	private int edad;
	
	public Animal(int id, String nombre,String tipo, int anio_nacimiento) {
		this.id=id;
		this.nombre=nombre;
		this.tipo=tipo;
		this.anio_nacimiento=anio_nacimiento;
		this.edad=CalcularEdad();
	}
	
	public void ImprimirDatos() {
		System.out.println("Hola soy el Animal #: "+ this.id);
		System.out.println("Mi nombre es: "+ this.nombre);
		System.out.println("Soy un : "+ this.tipo);
		Hablar();
		System.out.println("Nací en el: "+ this.anio_nacimiento);
		System.out.println("Mi edad es: "+ this.edad +" años");	
		System.out.println("");

	}
	
	public int CalcularEdad() {

		//LocalDateTime hoy= LocalDateTime.now();
		return 2024-this.anio_nacimiento;
	}
	
	public void Hablar() {
		if (this.tipo=="Perro") {
			System.out.println("GUAU GUAU");
		}
		if (this.tipo=="Gato") {
			System.out.println("Miaaaauuuuuuuuu");
		}
	}

}
