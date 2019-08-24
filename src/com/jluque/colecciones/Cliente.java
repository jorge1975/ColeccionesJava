package com.jluque.colecciones;

public class Cliente {
	private String nombre;
	private String c_cuenta;
	private float saldo;
	/**
	 * @param nombre
	 * @param c_cuenta
	 * @param saldo
	 */
	public Cliente(String nombre, String c_cuenta, float saldo) {
		super();
		this.nombre = nombre;
		this.c_cuenta = c_cuenta;
		this.saldo = saldo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the c_cuenta
	 */
	public String getC_cuenta() {
		return c_cuenta;
	}
	/**
	 * @param c_cuenta the c_cuenta to set
	 */
	public void setC_cuenta(String c_cuenta) {
		this.c_cuenta = c_cuenta;
	}
	/**
	 * @return the saldo
	 */
	public float getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c_cuenta == null) ? 0 : c_cuenta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (c_cuenta == null) {
			if (other.c_cuenta != null)
				return false;
		} else if (!c_cuenta.equals(other.c_cuenta))
			return false;
		return true;
	}
	
	
}
