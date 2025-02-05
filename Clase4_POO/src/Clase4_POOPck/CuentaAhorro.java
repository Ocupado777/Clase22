package Clase4_POOPck;

public class CuentaAhorro {
	public String numero_cuenta;
	public String banco;
	public String beneficiario;
	public String mail;
	public String identificacion;
	private float saldo;
	private String contrasena;
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	
	public CuentaAhorro(String numero_cuenta, String banco, String beneficiario, String mail, String identificacion) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.banco = banco;
		this.beneficiario = beneficiario;
		this.mail = mail;
		this.identificacion = identificacion;
		this.saldo=0;
		this.contrasena=identificacion;
	}

	public String GetInfoCuenta() {
		String infoCuenta="";
		infoCuenta=infoCuenta +"Número Cuenta: "+ this.numero_cuenta+"\n" ;
		infoCuenta=infoCuenta +"Banco: "+ this.banco+"\n" ;
		infoCuenta=infoCuenta +"Beneficiario: "+ this.beneficiario+"\n" ;
		infoCuenta=infoCuenta +"Mail: "+ this.mail+"\n" ;
		infoCuenta=infoCuenta +"Identificación: "+ this.identificacion+"\n" ;	
		return infoCuenta;
	}
	
	
	
	
}
