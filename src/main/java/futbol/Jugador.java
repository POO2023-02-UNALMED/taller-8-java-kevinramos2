package futbol;
public class Jugador extends Futbolista{
  //atributos
  public short golesMarcados;
  public byte dorsal;

  //metodo heredado
  @Override
  public boolean jugarConLasManos(){
    return false;
  }

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

  @Override
  public int compareTo(object o){
    var otroJugador = (jugador) o;
    return super.getEdad();
  }

  //toString

  @Override
  public String toString(){
    return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
  }
}
