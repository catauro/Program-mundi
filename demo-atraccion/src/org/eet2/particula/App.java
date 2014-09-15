package org.eet2.particula;

public class App {

	public static void main(String[] args) {

		System.out.println("Nos vamos a morir todos!!!!");

		Particula meteorito = new Particula();
		meteorito.setMasa(100);
		meteorito.setVelocidad(200);

		Particula mundo = new Particula();
		mundo.setMasa(300);
		mundo.setVelocidad(100);

		System.out
				.println("La fuerza de atraccion entre el mundo y el meteorito es de: "
						+ (mundo.getFuerza() - meteorito.getFuerza()));

	}
}
