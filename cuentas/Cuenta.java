package cuentas;

public class Cuenta {

	// yousef
	private String nombre;
	private String cuenta;
	private double saldo;

	public Cuenta() {

	}

	
	/** 
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	
	/** 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/** 
	 * @return String
	 */
	public String getCuenta() {
		return cuenta;
	}

	
	/** 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	
	/** 
	 * @return double
	 */
	public double getSaldo() {
		return saldo;
	}

	
	/** 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @param nombre
	 * @param cuenta
	 * @param saldo
	 */
	public Cuenta(String nombre, String cuenta, double saldo) {
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.saldo = saldo;
	}

	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Titular: " + nombre + "\nCuenta: " + cuenta;
	}

	
	/** 
	 * @param cantidad
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	
	/** 
	 * @param cantidad
	 * @throws Exception
	 */
	public void retirar(double cantidad) throws Exception {

		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");

		if (saldo < cantidad)
			throw new Exception("No se hay suficiente saldo");

		saldo = saldo - cantidad;
	}
}
