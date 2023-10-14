public class Jugador extends Futbolista{
  //atributos
  public short golesMarcados;
  public byte dorsal;

  //constructor
  public Jugador(String nombre, String posicion, int edad, short golesMarcados, byte dorsal ){
    super(nombre,posicion,edad);
    this.golesMarcados = golesMarcados;
    this.dorsal = dorsal;
  }
  //constructor por defecto
  public Jugador(){
    super();
    this.golesMarcados = 289;
    this.dorsal = 7;
  }
  

  //metodo de la interfaz


  //toString

  @Override
  public String toString(){
    return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
  }
}
