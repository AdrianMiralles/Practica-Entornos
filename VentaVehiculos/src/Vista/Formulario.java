package Vista;

import java.util.Scanner;

import Modelo.Autobus;
import Modelo.Camion;
import Modelo.Coche;
import Modelo.Moto;
import Modelo.Vehiculos;



public class Formulario {
		
		Coche c = new Coche();
		Camion ca = new Camion();
		Autobus a = new Autobus();
		Moto m = new Moto();
		// TODO Auto-generated constructor stub
		public void menu(){
			Scanner opcion = new Scanner(System.in);
			int opcionDos;
			
			do {
				System.out.println("1. Coche");
				System.out.println("2. Autobus");
				System.out.println("3. Camion");
				System.out.println("4. Moto");
				System.out.println("5. Salir:");
				System.out.print("Elige una opción: ");
				
				opcionDos=opcion.nextInt();
				switch(opcionDos) {
					case 1:
						System.out.println("Coche: ");
						muestraDatosCo(c);
						
						break;
					case 2:
						System.out.println("Autobus: ");
						muestraDatosA(a);
						break;
					case 3: 
						System.out.println("Camion: ");
						muestraDatosCa(ca);
						break;
						
					case 4:
						System.out.println("Moto: ");
						muestraDatosM(m);
						break;
					case 5 :
						System.out.println("Saliendo...");
						break;
				}
			}while(opcionDos!=5);	
		}
	
	public void muestraDatosV(Vehiculos v){
		
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modelo: "+v.getModelo());
		System.out.println("Color: "+v.getColor());
		System.out.println("Combustible: "+v.getCombustible());
		System.out.println("Cilindrada de cada cilindro: "+v.getCilindrada()/4);
		System.out.println("Plazas: "+v.getPlazas());
		System.out.println("Categoria Ambiental: "+v.getCatAmbiental());

	}
	
	public void muestraDatosCo(Coche c){
		
		System.out.println("Marca: "+c.getMarca());
		System.out.println("Modelo: "+c.getModelo());
		System.out.println("Color: "+c.getColor());
		System.out.println("Combustible: "+c.getCombustible());
		System.out.println("Cilindrada de cada cilindro: "+c.getCilindrada()/4);
		System.out.println("Plazas: "+c.getPlazas());
		System.out.println("Categoria Ambiental: "+c.getCatAmbiental());
		System.out.println("Número de puertas: "+c.getNumPuertas());
		System.out.println("Descapotable: "+c.isDescapotable());
	}
	
	public void muestraDatosCa(Camion ca){
		
		System.out.println("Marca: "+ca.getMarca());
		System.out.println("Modelo: "+ca.getModelo());
		System.out.println("Color: "+ca.getColor());
		System.out.println("Combustible: "+ca.getCombustible());
		System.out.println("Cilindrada de cada cilindro: "+ca.getCilindrada()/4);
		System.out.println("Plazas: "+ca.getPlazas());
		System.out.println("Categoria Ambiental: "+ca.getCatAmbiental());
		System.out.println("Tara máxima: "+ca.getTaraMax());
		System.out.println("Luces de galibo: "+ca.isGalibo());
	}
	
	public void muestraDatosA(Autobus a){
			
			System.out.println("Marca: "+a.getMarca());
			System.out.println("Modelo: "+a.getModelo());
			System.out.println("Color: "+a.getColor());
			System.out.println("Combustible: "+a.getCombustible());
			System.out.println("Cilindrada de cada cilindro: "+a.getCilindrada()/6);
			System.out.println("Plazas: "+a.getPlazas());
			System.out.println("Categoria Ambiental: "+a.getCatAmbiental());
			System.out.println("Uso público: "+a.isUso());
			System.out.println("Urbano: "+a.isUrbano());
			System.out.println("Articulado: "+a.isArticulado());
		}
	
	public void muestraDatosM(Moto m){
		
		System.out.println("Marca: "+m.getMarca());
		System.out.println("Modelo: "+m.getModelo());
		System.out.println("Color: "+m.getColor());
		System.out.println("Combustible: "+m.getCombustible());
		System.out.println("Cilindrada de cada cilindro: "+m.getCilindrada()/2);
		System.out.println("Plazas: "+m.getPlazas());
		System.out.println("Categoria Ambiental: "+m.getCatAmbiental());
		System.out.println("Uso público: "+m.getTipoMoto());
		System.out.println("Urbano: "+m.getNumRuedas());
		
	}

	
/**/
}
