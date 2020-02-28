package Modelo;

public class Autobus extends Vehiculos {
	private boolean uso;
	private boolean articulado;
	private boolean urbano;
	public boolean isUso() {
		return uso;
	}
	public void setUso(boolean uso) {
		this.uso = uso;
	}
	public boolean isArticulado() {
		return articulado;
	}
	public void setArticulado(boolean articulado) {
		this.articulado = articulado;
	}
	public boolean isUrbano() {
		return urbano;
	}
	public void setUrbano(boolean urbano) {
		this.urbano = urbano;
	}
	
	public Autobus(String marca,String modelo, String color,String combustible, int cilindrada,int plazas, String catAmbiental) {
		super(marca, modelo,  color, combustible, cilindrada, plazas, catAmbiental);
		this.uso = true;
		this.articulado = true;
		this.urbano = true;		
		/*this.marca = "ODIOMAX";
		this.modelo = "JJKT1";
		this.color = "PINKY";
		this.combustible = "DIESELLY";
		this.cilindrada = 300;
		this.plazas = 4;
		this.catAmbiental = "A";*/
		
	}
	public Autobus() {
		this.uso = true;
		this.articulado = true;
		this.urbano = true;		
	}

}
