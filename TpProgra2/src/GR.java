import java.awt.Point;
import java.util.ArrayList;

public class GR {

	private Tablero tablero;
	private Diccionario<Coordenada, Rectangulo> dicRectangulos;	
	private int turno;
	private int idUltRectangulo;
	
	
	GR (int ancho, int alto) {
		this.tablero = new Tablero(alto, ancho);
		this.turno = 1;
		this.idUltRectangulo = 1;
		this.dicRectangulos = new Diccionario<>();
	}
	
	public static int getDado() {
		return (int) Math.floor(Math.random()*6+1);
	}
	
	public void jugar() {
		Rectangulo r = generaRectanguloConTirada(getDado(), getDado());
		
		if (turno == 1) {
			jugadaP1();
		} else {
 			jugadaP2();
		}
		
		System.out.println("TURNO: " + turno);
		//CAMBIA TURNO
		cambiaTurno();
		
	}
	
	public void jugar(int dado1, int dado2) {
		Rectangulo r = generaRectanguloConTirada(dado1, dado2);
		
		if (turno == 1) {
			jugadaP1();
		} else {
 			jugadaP2();
		}
		
		System.out.println("TURNO: " + turno);
		//CAMBIA TURNO
		cambiaTurno();
		
	}
	
	public Tablero getTablero() {
		return tablero;
	}
	
	public Rectangulo generaRectanguloConTirada(int d1, int d2) {
		Rectangulo r = new Rectangulo(idUltRectangulo, turno, d1, d2);
		return r;
	}
	
	public int getCantRectangulos() {
		return dicRectangulos.getSize();
	}
	
	//DEVUELVE RECTANGULOS DEL JUGADOR QUE LE TOCA JUGAR
	public ArrayList<Rectangulo> getRectangulosPorJugadorEnTurno() {
		ArrayList<Rectangulo> rectsAux = new ArrayList<>();
		
		return rectsAux;
	}
	
	//DEVUELVE RECTANGULO AL AZAR DEL JUGADOR AL QUE LE TOCA JUGAR
	public Rectangulo getRectanguloRandomJugadorEnTurno() {
			int rectAzar = (int )(Math. random() * getRectangulosPorJugadorEnTurno().size());
			return getRectangulosPorJugadorEnTurno().get(rectAzar);
		}
	
	public void cambiaTurno() {
		//CAMBIA TURNO
		if (turno==1) {
			turno = 2;
		} else {
			turno = 1;
		}
		
	}
	
	public Boolean jugadaP1() {
		boolean seJugo = true;
		Rectangulo rP1 = generaRectanguloConTirada(getDado(), getDado());

		//PRIMERA JUGADA
		if (dicRectangulos.getSize() == 0) {
			tablero.ubicarRectangulo(rP1, new Coordenada(0,0));
			dicRectangulos.addDef(new Coordenada(0,0), rP1);
			idUltRectangulo++;
		} else {
		//SI PASARON LAS PRIMERAS JUGADAS
			
		}
		
		
		return seJugo;
	}
	


	public Boolean jugadaP2() {
		boolean seJugo = true;
		Rectangulo rP2 = generaRectanguloConTirada(getDado(), getDado());
		System.out.println(dicRectangulos.getSize());
		//PRIMERA JUGADA
		if (dicRectangulos.getSize() == 1) {
			System.out.println("ASD");
			tablero.ubicarRectangulo(rP2, new Coordenada(tablero.getAncho()-rP2.getBase(),tablero.getAlto()-rP2.getAltura()));
			idUltRectangulo++;
		
		} else {
		//SI PASARON LAS PRIMERAS JUGADAS
			
		}
		
		
		return seJugo;
	}
	
	public Coordenada devuelveCoordAColocar(Rectangulo r,Rectangulo rNuevo, Tablero t ){
		Coordenada c = new Coordenada();
		ArrayList<String> lados = new ArrayList<>();
		lados.add("arriba");
		lados.add("derecha");
		lados.add("abajo");
		lados.add("izquierda");
	
		for(String lado: lados) {
			switch(lado) {
			case "arriba":
				break;
				
			}
		}
		
		return null;
	}
	
	public void mostrarTablero() {
		System.out.println(tablero);
	}
	
	
	
	
}
