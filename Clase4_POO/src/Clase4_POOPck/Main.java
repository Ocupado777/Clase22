package Clase4_POOPck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("Ejemplo Clase Cuenta Ahorro");
		CuentaAhorro objCuenta1 = new CuentaAhorro("123456","Guayaquil","Eduardo Manosalvas","emanosalvas@gmail.com","0926826504");
		CuentaAhorro objCuenta2 = new CuentaAhorro("789011","Pichinca","Jhon Gonzalez","jgonzalez@gmail.com","0910566405");
		
			
		System.out.println(objCuenta1.GetInfoCuenta());

		CambiarContrasena(objCuenta1);
		
		
		
		
		
	}
	
	
	public static void CambiarContrasena(CuentaAhorro obj) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese su contraseña actual: ");
		String contrasena_actual=br.readLine();
		if(obj.getContrasena().trim() == contrasena_actual.trim()) 
		{
			System.out.println("Ingrese su nueva contraseña: ");
			String contrasena_nueva=br.readLine();
			obj.setContrasena(contrasena_nueva);

			System.out.println("Contraseña cambiada con éxito ");
		}
		else 
		{
			System.out.println("Contraseña no coincide");	
		}
	}
	
	
}

















