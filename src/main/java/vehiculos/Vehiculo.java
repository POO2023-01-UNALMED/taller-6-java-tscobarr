package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private Pais pais;
	private static int CantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, 
			int peso, String traccion, Fabricante fabricante) {
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos++;
		
		if(Fabricante.ventasPorFabricante.containsKey(fabricante)) {
			Fabricante.ventasPorFabricante.put(fabricante, Fabricante.ventasPorFabricante.get(fabricante)+1);
		}
		else {
			Fabricante.ventasPorFabricante.put(fabricante, 1);
		}
		
		if(Pais.ventasPorPais.containsKey(pais)) {
			Pais.ventasPorPais.put(pais, Pais.ventasPorPais.get(pais) + 1);
		}
	}
		
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.cantidadAutomoviles + "\nCamionetas: " + 
				Camioneta.cantidadCamionetas + "\nCamiones: " + Camion.cantidadCamiones;
	}

	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.CantidadVehiculos = cantidadVehiculos;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
