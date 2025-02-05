package PkgClase9;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		InicializarBaseDeDatos();
		MenuPrincipal();
	}
	
	public static void InicializarBaseDeDatos() {
		BaseDeDatos.ListaProductos = new ArrayList<Producto>();
		BaseDeDatos.leerListaProducto();
	}
	
	public static void MenuPrincipal() {
		Scanner sc = new Scanner(System.in);
		int opcion=0;	
		do {
			System.out.println("************************************************************************");
			System.out.println("******************************TIENDA ISTLC******************************");
			System.out.println("************************************************************************");
			System.out.println();
			System.out.println("************************************************************************");
			System.out.println("MENÚ DE OPCIONES");
			System.out.println("1.- Crear Productos");
			System.out.println("2.- Consultar Productos");
			System.out.println("3.- Crear Clientes");
			System.out.println("4.- Consultar Clientes");
			System.out.println("5.- Salir");
			System.out.println();
			System.out.print("Seleccione una opción:");
			opcion=sc.nextInt();
			
			switch(opcion)
			{
			case 1:
				CrearProducto();
				break;
			case 2:
				ConsultarProductos();
				break;
			case 3:
				crearCliente();
				break;
			case 5:
				System.out.println("Gracias por visitarnos, adios!");
				break;
			
			}
			
			System.out.println("************************************************************************");
			
		}while(opcion!=5);
	}
	
	public static void ConsultarProductos() {
	
		for (Producto elemento : BaseDeDatos.ListaProductos) {
			elemento.Imprimir();
		}
		
		
	}
	public static void crearCliente() {
	
	}
	
	public static void CrearProducto() {
		Scanner sc = new Scanner(System.in);
		int codigo=0;
		String descripcion="";
		double precio=(double) 0;
		
		System.out.println("**************************CREACIÓN DE PRODUCTOS*************************");
		System.out.print("Ingrese el Código: ");
		codigo=sc.nextInt();
		System.out.println();
		
		System.out.print("Ingrese la Descripción: ");
		descripcion=sc.next();
		System.out.println();
		
		System.out.print("Ingrese el Precio: ");
		precio=sc.nextDouble();
		System.out.println();
		
		Producto objProducto= new Producto(codigo,descripcion,precio);
		BaseDeDatos.ListaProductos.add(objProducto);
		System.out.println("Producto Ingresado con Éxito!");
		BaseDeDatos.guardarListaProducto();
		objProducto.Imprimir();
		
	}
	
	

}
