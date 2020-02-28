package Modelo;

public class Moto extends Vehiculos  {

	private String tipoMoto;
	private int numRuedas;
	public String getTipoMoto() {
		return tipoMoto;
	}
	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public Moto() {
		super();
		this.tipoMoto= "";
		this.numRuedas= 2;
	}
	public Moto(String marca,String modelo, String color,String combustible, int cilindrada,int plazas, String catAmbiental) {
		super(marca, modelo,  color, combustible, cilindrada, plazas, catAmbiental);
		this.tipoMoto= "";
		this.numRuedas= 2;	
		
		
	}
}
