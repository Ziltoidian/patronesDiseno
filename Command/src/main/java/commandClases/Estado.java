/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandClases;

/**
 *
 * @author px100
 */
public class Estado {
    private int id;
	private double saldo;

	public Estado(int id, double saldo) {	
		this.id = id;
		this.saldo = saldo;
	}

	public void pagar(double monto) {
		this.saldo = this.saldo - monto;
		System.out.println("Método Pago, Cuenta: " + id + " Saldo: " + this.saldo);
	}

	public void cobrar(double monto) {
		this.saldo = this.saldo + monto;
		System.out.println("Método Cobro, Cuenta: " + id + " Saldo: " + this.saldo);
	}
}
