/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.command.app.app;
import commandClases.Cobrar;
import commandClases.Estado;
import commandClases.Invoker;
import commandClases.Pagar;

/**
 *
 * @author px100
 */
public class main {
    public static void main(String[] args) {
		Estado estado = new Estado(1, 200);

		Cobrar cobro = new Cobrar(estado, 100);
		Pagar pago = new Pagar(estado, 50);

		Invoker ivk = new Invoker();
		ivk.recibirOperacion(cobro);
		ivk.recibirOperacion(pago);
		
		ivk.realizarOperaciones();
	}
}
