package Modelo;

public class Coche extends Vehiculos{
	private int numPuertas;
	private boolean descapotable;
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public boolean isDescapotable() {
		return descapotable;
	}
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	public Coche(String marca,String modelo, String color,String combustible, int cilindrada,int plazas, String catAmbiental) {
		super(marca, modelo,  color, combustible, cilindrada, plazas, catAmbiental);
		this.numPuertas = 4;
		this.descapotable = true;
		
	}
	public Coche() {
		// TODO Auto-generated constructor stub
	}
	

	




}
