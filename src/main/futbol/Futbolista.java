abstract class Futbolista {
  //atributos
  private String nombre;
  private int edad;
  private final String posicion;


  //Constructor
  public Futbolista(String nombre, String posicion, int edad){
    this.nombre = nombre;
    this.edad = edad;
    this.posicion = posicion;
  }
  //Constructor por defecto
  public Futbolista(){
    this("Maradona","delantero",30);
  }

  //Gets y Sets
  public String getNombre(){
    return this.nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getPosicion(){
    return this.posicion;
  }
  public int getEdad(){
    return this.edad;
  }
  public void setEdad(int edad){
    this.edad = edad;
  }

  //toString
  @Override
  public String toString(){
    return "El futbolista "+nombre+" tiene "+edad+" y juega de "+posicion;
  }

  //metodo boolean
  //public boolean equals(Futbolista f){
   // if(f )
  //}

  //método abstracto
  public abstract boolean jugarConLasManos();
}
