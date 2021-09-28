/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factory;
import conexion.IConexion;
/**
 *
 * @author px100
 */
public class Conexion3 implements IConexion {
private String var1;

	public Conexion3() {
		this.var1 = "Conexión 3";
	}

	@Override
	public void conectar() {
		System.out.println("Se conectó a " + var1);

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de "+ var1);
	}
}
