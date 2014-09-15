package org.eet2.particula;

public class Particula {
	
	private double masa;
	private double velocidad;
	
		public double getFuerza() {
		return masa * velocidad;		
		}
		public double getMasa() {
		return masa;
		
	}
		public void setMasa(double masa) {
		this.masa = masa;
		
	}
		public double getVelocidad() {
		return velocidad;
		
	}
		public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	
	
	

	
}
