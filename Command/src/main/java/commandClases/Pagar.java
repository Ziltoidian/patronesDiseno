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
public class Pagar implements IOperacion{
    private Estado estado;
	private double monto;

	public Pagar(Estado estado, double monto) {
		this.estado = estado;
		this.monto = monto;
	}

	@Override
	public void execute() {
		this.estado.pagar(this.monto);
	}
}
