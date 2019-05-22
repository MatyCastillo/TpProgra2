import java.util.ArrayList;


public class Tablero {
	private Integer[][] tablero;
	
	Tablero(int y, int x) {
		tablero = new Integer[y][x];
		
		for (int i = 0; i<y; i++) {
			for (int j = 0; j<x; j++) {
				tablero[i][j] = 0;
			}
		}
		
	}
	public int areaOcupada(){
		int areaDesocupada = 0;
		
		for (int i = 0; i<tablero.length; i++) {
			for (int j = 0; j<tablero[0].length; j++) {
				if(tablero[i][j]==0){
					areaDesocupada++;
				}
			}
		}
		return (getAlto()*getAncho())-areaDesocupada;
	}
	
	//toString con StringBuilder
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder("");
		
		for (int i = 0; i<tablero.length; i++) {
			for (int j = 0; j<tablero[0].length; j++) {
				sb.append(Integer.toString(tablero[i][j]));
			}
			sb.append("\n");
		}
		return sb.toString();
	}
		
	public int getAlto() {
		return tablero.length;
	}
	
	public int getAncho() {
		return tablero[0].length;
	}
	
	
	public boolean haySuperposicion(ArrayList<Rectangulo> rectangulos) {
		boolean seSuperponen = false;
		
		int areaTotalRectangulos = 0;
		
		for (Rectangulo r: rectangulos) {
			areaTotalRectangulos += r.getArea();
		}
		if (areaOcupada()<areaTotalRectangulos) {
			seSuperponen = true;
		}
		
		return seSuperponen;
	}
	
	public void  ubicarRectangulo(Rectangulo r, Coordenada c) {
		System.out.println(c);
		System.out.println(tablero.length);
		for (int i = c.getY(); i<c.getY()+r.getAltura(); i++) {
			for (int j = c.getX(); j<c.getX()+r.getBase(); j++) {
				tablero[i][j]  = r.getId();
			}
		}
		
	
	}
}
