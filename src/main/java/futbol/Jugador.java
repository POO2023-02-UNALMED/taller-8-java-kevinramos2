package futbol;

public class Jugador extends Futbolista{
	//atributos
	public short golesMarcados;
	public byte dorsal;
	
	//constructor
	public Jugador(String nombre, String posicion, int edad, short golesMarcado, byte dorsal) {
		super(nombre,posicion,edad);
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
	@Override
	public int compareTo(Futbolista o) {
		 var otroJugador = (Jugador) o;
		    return super.getEdad();
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

}
