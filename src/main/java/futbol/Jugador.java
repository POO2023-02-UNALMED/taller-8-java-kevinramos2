package futbol;

public class Jugador extends Futbolista{
	//atributos
	public short golesMarcados;
	public byte dorsal;
	
	//constructor
	public Jugador(String nombre, int edad, String posicion,short golesMarcados, byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	//constructor por default
	public Jugador() {
		super();
		this.dorsal = 7;
		this.golesMarcados = 289;	
	}

	
	
	//metodo de interfaz CompareTo
	public int compareTo(Object f) {
		return Math.abs(this.getEdad() - ((Futbolista)f).getEdad());
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	//toString
	@Override
	public String toString(){
	   return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}
	  
	//gets y sets
	public short getGolesMarcados() {
		return this.golesMarcados;
	}
	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	public byte getDorsal() {
		return this.dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
}
