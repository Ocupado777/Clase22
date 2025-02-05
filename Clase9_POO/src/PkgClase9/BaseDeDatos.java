package PkgClase9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public  class BaseDeDatos {
	public static List<Producto> ListaProductos;
	
	
	public static void guardarListaProducto() {
		String  nombreArchivo="D:\\BaseDatosISTLC\\ArchProductos";
		try(ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream(nombreArchivo))){
		salida.writeObject(BaseDeDatos.ListaProductos);
		System.out.println("Producto Grabado con Éxito!");
			
		} catch (IOException e) {
			System.out.println("Ocurrió un error al grabar el producto! ... Comuníquese con TI.");
		}
	
	}
	
	public static void leerListaProducto() {
		String  nombreArchivo="D:\\BaseDatosISTLC\\ArchProductos";
		try  (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
			BaseDeDatos.ListaProductos= (ArrayList<Producto>) entrada.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Ocurrió un error al leer el producto! ... Comuníquese con TI.");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
