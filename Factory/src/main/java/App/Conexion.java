/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import conexion.IConexion;
import com.mycompany.factory.Conexion1;
import com.mycompany.factory.Conexion2;
import com.mycompany.factory.Conexion3;
import com.mycompany.factory.ConexionDefault;
/**
 *
 * @author px100
 */
public class Conexion {
    public IConexion getConexion(String numConexión) {
		if (numConexión.equalsIgnoreCase("1")) {
			return new Conexion1();
		} else if (numConexión.equalsIgnoreCase("2")) {
			return new Conexion2();
		} else if (numConexión.equalsIgnoreCase("3")) {
			return new Conexion3();
		} 

		return new ConexionDefault();
	}
}
