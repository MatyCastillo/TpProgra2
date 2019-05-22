
public class Coordenada {
	private int x;
	private int y;
	
	Coordenada() {
		x = 0;
		y = 0;
	}
	
	Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "X: "+Integer.toString(x)+"  Y: "+Integer.toString(y);
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
