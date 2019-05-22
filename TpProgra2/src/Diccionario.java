

import java.util.ArrayList;

public class Diccionario<T1,T2> {
	private ArrayList<Tupla<T1,T2>> datos;
	
	Diccionario() {
		datos = new ArrayList<Tupla<T1,T2>>();
	}
	
	public int getSize() {
		return datos.size();
	}
	
	public boolean pertenece(T1 clave) {
		boolean bandera=false;
		for (int i = 0 ; i<datos.size() ; i++) {
			if(datos.get(i).v1.equals(clave)) {
				bandera=true;
			}
		}
		return bandera;
	}
	
	public void agregar(T1 clave, T2 significado) {
		Tupla<T1,T2> aux= new Tupla<T1,T2>(clave,significado);

		for (int i = 0 ; i<datos.size() ; i++) {
			if(datos.get(i).v1.equals(clave)) {
				datos.get(i).v2=significado;
				//datos.get(i)= aux;
				//datos.set(i,aux);
			}
			else {
				datos.add(aux);
			}
		}	
	}
	
	public T2 obtener(T1 clave) {
		T2 aux=null;
		
		for (int i = 0 ; i<datos.size() ; i++) {
			if(datos.get(i).v1.equals(clave)) {
				aux=datos.get(i).v2;
			}
			
		}
		
		if (!pertenece(clave)) {
			throw new RuntimeException ("la clave debe existir en el diccionario");
		}
		
		
		return aux;
	}
	
	
	public String toString() {
		String aux="";
		for (int i = 0 ; i<datos.size() ; i++) {
			aux=aux + datos.get(i).v1.toString() + datos.get(i).v2.toString();
		}
		return aux;
	}
	
	public void getDefs() {
		for (Tupla<T1, T2> t: datos) {
			System.out.println(t.getT1());
			System.out.println(t.getT2());
		}
	}

	public void addDef(T1 nom, T2 def) {
		datos.add(new Tupla<T1, T2>(nom, def));
	}
}	
