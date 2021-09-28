/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import conexion.IConexion;

/**
 *
 * @author px100
 */
public class java {
    public static void main(String[] args) {
		Conexion fabrica = new Conexion();

		IConexion con1 = fabrica.getConexion("1");
		con1.conectar();
		con1.desconectar();

		IConexion con2 = fabrica.getConexion("2");
		con2.conectar();
		con2.desconectar();

		IConexion con3 = fabrica.getConexion("3");
		con3.conectar();
		con3.desconectar();
                
                IConexion con4 = fabrica.getConexion(" ");
		con4.conectar();
		con4.desconectar();
	}
}
