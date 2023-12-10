package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();

		rec1.base = 4;
		rec1.altura = 2;

		rec2.base = 6;
		rec2.altura = 5;

		System.out.println("El perimetro del rectangulo 1 es:" + rec1.calcularPerimetro());
		System.out.println("El perimetro del rectangulo 2 es:" + rec2.calcularPerimetro());
	}

}
