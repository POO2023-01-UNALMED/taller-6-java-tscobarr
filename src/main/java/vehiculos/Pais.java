package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
	private String nombre;
	static Map<Pais, Integer> ventasPorPais = new HashMap <>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		int max = -1;
		Pais paisMasVendedor = null;
		
		for(Map.Entry<Pais, Integer> entry: ventasPorPais.entrySet()) {
			if (entry.getValue() >  max) {
				max = entry.getValue();
				paisMasVendedor = entry.getKey();
			}
		}
		
		return paisMasVendedor;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
