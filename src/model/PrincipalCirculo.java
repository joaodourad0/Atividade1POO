package model;
//Classe principal Circulo atv1

public class PrincipalCirculo {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		
		c1.setRaio(5.0);
		
		double area = c1.setArea();
		double perimetro = c1.setPerimetro();
		
		double raio = c1.getRaio();
		
		System.out.println("Área do c1: " + c1.setArea());
		
		System.out.println("Perímetro do c1: " + c1.setPerimetro());
		
	}
}
