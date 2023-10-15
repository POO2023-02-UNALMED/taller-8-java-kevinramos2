package futbol;

public class Portero extends Futbolista {
	//atributos
	public short golesRecibidos;
	public byte dorsal;
	
	//constructor
	public Portero(String nombre,int edad, short golesRecibidos, byte dorsal) {
		super(nombre,edad,"portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	//toString
	@Override
	public String toString(){
	   return super.toString() + " con el dorsal " + this.dorsal + ".Le han marcado " + this.golesRecibidos;
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
