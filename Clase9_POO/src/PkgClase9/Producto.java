package PkgClase9;

import java.io.Serializable;

public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	public int codigo;
	public String nombre;
	public double precio;
	public Producto(int codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	public Producto() {
		super();
	}
	
	public void Imprimir() {
		System.out.println("Código: "+ this.codigo);
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Precio: "+ this.precio);	
	}
	
	
}
