package game;

public class Enemigo extends Jugador{

	private boolean derrotado;
	
	public Enemigo() {
		super();
		super.setMaxHp(10);
	}

	public boolean isDerrotado() {
		return derrotado;
	}

	public void setDerrotado(boolean derrotado) {
		if (super.getHp()<=0) {
			derrotado=true;
		}
	}

	
	
}
