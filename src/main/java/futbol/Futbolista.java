package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	//atributos
	private String nombre;
	private int edad;
	private final String posicion;
	
	//constructor
	public Futbolista(String nombre, String posicion, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	//constructor default
	public Futbolista() {
		this("Maradona","delantero",30);
	}
	
	//toString
	public String toString() {
		return "El futbolista " +nombre+ " tiene "+edad+",y juega de "+posicion;
	}
	
	//metodo boolean
	public boolean equals(Futbolista f) {
		return this == f;
	}
	
	//metodo abstracto
	public abstract boolean jugarConLasManos();
	
	//gets y sets
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return this.posicion;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
