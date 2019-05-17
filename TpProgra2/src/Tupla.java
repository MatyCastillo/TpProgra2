

public class Tupla<T1,T2> {
	T1 v1;
	T2 v2;
	
	public Tupla(T1 t1, T2 t2) {
		v1=t1;
		v2=t2;
		
	}

	public T1 getT1() {
		return v1;
	}

	public T2 getT2() {
		return v2;
	}
	public String imprimir() {
		return ("la tupla es: "+v1.toString()+v2.toString());	
	}
}
