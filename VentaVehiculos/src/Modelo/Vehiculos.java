package Modelo;

public class Vehiculos {

	protected String marca;
	protected String modelo;
	protected String color;
	protected String combustible;
	protected int cilindrada;
	protected int plazas;
	protected String catAmbiental;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public String getCatAmbiental() {
		return catAmbiental;
	}
	public void setCatAmbiental(String catAmbiental) {
		this.catAmbiental = catAmbiental;
	}
	public Vehiculos() {
		super();
		this.marca = "Marca por defecto";
		this.modelo = "AAAAA";
		this.color = "Blanco";
		this.combustible = "Combustible";
		this.cilindrada = 7825;
		this.plazas = 0;
		this.catAmbiental = "A";
	}
	public Vehiculos(String marca, String modelo, String color, String combustible, int cilindrada, int plazas,
			String catAmbiental) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
		this.plazas = plazas;
		this.catAmbiental = catAmbiental;
	}
	
	
	
	


}
