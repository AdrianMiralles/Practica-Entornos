package Modelo;

public class Camion extends Vehiculos {
	private int taraMax;
	private boolean galibo;
	public int getTaraMax() {
		return taraMax;
	}
	public void setTaraMax(int taraMax) {
		this.taraMax = taraMax;
	}
	public boolean isGalibo() {
		return galibo;
	}
	public void setGalibo(boolean galibo) {
		this.galibo = galibo;
	}

	public Camion(String marca,String modelo, String color,String combustible, int cilindrada,int plazas, String catAmbiental) {
		super(marca, modelo,  color, combustible, cilindrada, plazas, catAmbiental);
		this.taraMax = 5;
		this.galibo = true;
		/*this.marca = "ODIOMAX";
		this.modelo = "JJKT1";
		this.color = "PINKY";
		this.combustible = "DIESELLY";
		this.cilindrada = 300;
		this.plazas = 4;
		this.catAmbiental = "A";*/
		
	}
	
	public Camion() {
		this.taraMax = 5;
		this.galibo = true;
	}

}
