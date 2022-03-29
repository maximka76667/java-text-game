package game;

public class Jugador {
	
	private int hp=5;
	private int fuerza=3;
	private int destreza=2;
	private int velocidad=3;
	private String arma="Desarmado";
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
		return "JugadorGeneral [hp=" + hp + ", fuerza=" + fuerza + ", destreza=" + destreza + ", arma=" + arma + "]";
	}
	
	
}
