import java.awt.Point;
import java.util.ArrayList;


public class Rectangulo {
	
	private int id;
	private int jugador;
	private int altura;
	private int base;
	private Coordenada coord;
	
	
		
	Rectangulo(int id, int jugador, int base, int altura) {
		this.id = id;
		this.jugador = jugador;
		this.base = base;
		this.altura = altura;
		this.coord = new Coordenada();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJugador() {
		return jugador;
	}

	public void setJugador(int jugador) {
		this.jugador = jugador;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public Coordenada getCoord() {
		return coord;
	}
	
	public void setCoord(Coordenada c) {
		coord = c;
	}
	
	public int getArea() {
		return base * altura;
	}
	
	}
