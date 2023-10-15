package futbol;

public class Portero extends Futbolista {
	//atributos
	public short golesRecibidos;
	public byte dorsal;
	
	//constructor
	public Portero(String nombre,int edad,String posicion,  short golesRecibidos, byte dorsal) {
		super(nombre,edad,"portero");
		this.dorsal = dorsal;
		this.golesRecibidos = golesRecibidos;
	}
	
	//toString
	@Override
	public String toString(){
	   return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	
	//metodo interfaz
	public int compareTo(Object f) {
	    return Math.abs(this.golesRecibidos - ((Portero)f).golesRecibidos);
	}

	//metodo heredado
	@Override
	public boolean jugarConLasManos() {
		return true;
	}

}
