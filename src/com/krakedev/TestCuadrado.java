package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado();
		Cuadrado cuadrado2 = new Cuadrado();
		Cuadrado cuadrado3 = new Cuadrado();

		cuadrado1.lado = 4;
		cuadrado2.lado = 3;
		cuadrado3.lado = 8;

		System.out.println("El Area del cuadrado 1:" + cuadrado1.areaCuadrado());
		System.out.println("El perimetro del cuadrado 1:" + cuadrado1.calcularPerimetro());

		System.out.println("El Area del cuadrado 2:" + cuadrado2.areaCuadrado());
		System.out.println("El perimetro del cuadrado 2:" + cuadrado2.calcularPerimetro());

		System.out.println("El Area del cuadrado 3:" + cuadrado3.areaCuadrado());
		System.out.println("El perimetro del cuadrado 3:" + cuadrado3.calcularPerimetro());
	}

}
