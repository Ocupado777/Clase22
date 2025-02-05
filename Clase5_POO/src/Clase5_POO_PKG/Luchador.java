package Clase5_POO_PKG;

public class Luchador {
	public String apodo;
	int edad;
	String empresa;
	private String nombres;
	private Float sueldo;
	
	
	public Luchador() {
		super();
		this.apodo = "";
		this.edad = 0;
		this.empresa = "";
		this.nombres="";
		this.sueldo=(float) 0;
	}
	
	public Luchador(String apodo, int edad, String empresa) {
		super();
		this.apodo = apodo;
		this.edad = edad;
		this.empresa = empresa;
		this.nombres="";
		this.sueldo=(float) 0;
	}

	public Luchador(String apodo, int edad, String empresa, String nombres, Float sueldo) {
		super();
		this.apodo = apodo;
		this.edad = edad;
		this.empresa = empresa;
		this.nombres = nombres;
		this.sueldo = sueldo;
	}
	
	
	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Float getSueldo() {
		return sueldo;
	}

	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}

	
	public void mostrar() 
	{
		System.out.println("******Luchador DATOS PUBLICOS******");
		System.out.println("Apodo: "+ this.apodo);
		System.out.println("Edad: "+ this.edad);
		System.out.println("Empresa: "+ this.empresa);
	}
	
	public void mostrar(String tipoImpresion) 
	{
		if (tipoImpresion.equals("Confidencial")) 
		{
			System.out.println("******Luchador DATOS PUBLICOS Y PRIVADOS******");
			System.out.println("Apodo: "+ this.apodo);
			System.out.println("Edad: "+ this.edad);
			System.out.println("Empresa: "+ this.empresa);	
			System.out.println("Nombres: "+ this.nombres);
			System.out.println("Sueldo: "+ this.sueldo);	
		}
		else 
		{
			System.out.println("******Luchador DATOS PUBLICOS******");
			System.out.println("Apodo: "+ this.apodo);
			System.out.println("Edad: "+ this.edad);
			System.out.println("Empresa: "+ this.empresa);	
		}
	}
}
	
	
	
	
