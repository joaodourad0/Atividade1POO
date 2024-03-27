package model;
//Classe usada para atributos do Circulo atv1

public class Circulo {
	
	private double raio;
	private double perimetro;
	private double area;
		
	public Circulo() {
		raio = 0;
		perimetro = 0;
		area = 0;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		if (raio < 0) {
			this.raio = 0;
		} else {
			this.raio = raio;
		}
		
	}
	
	
	public double setPerimetro() {
		double perimetro = (Math.PI * raio );
		return perimetro;
	}
	
	
	
	public double setArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
}
