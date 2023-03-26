package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pais {
	private String nombre;
	private static Map<Pais, Integer> paises = new HashMap<>();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
