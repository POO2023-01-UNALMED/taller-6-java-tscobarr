package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
	private String nombre;
	private Pais pais;
	static Map<Fabricante, Integer> ventas = new HashMap<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int max = -1;
		Fabricante fabricanteMayorVentas = null;
		
		for(Map.Entry<Fabricante, Integer> entry: ventas.entrySet()) {
			if (entry.getValue() >  max) {
				max = entry.getValue();
				fabricanteMayorVentas = entry.getKey();
			}
		}
		
		return fabricanteMayorVentas;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}