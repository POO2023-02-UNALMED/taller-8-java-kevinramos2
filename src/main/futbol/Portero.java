public class Portero extends Futbolista {
  //atributos
  public short golesRecibidos;
  public byte dorsal;

  //metodo abstracto
  @Override
  public boolean jugarConLasManos() {
   return true;
  }

  //constructor
  public Portero(String nombre, String posicion, int edad, short golesRecibidos, byte dorsal){
    super(nombre,"Portero",edad);
    this.golesRecibidos = golesRecibidos;
    this.dorsal = dorsal;
  }

  //toString
  @Override 
  public String toString(){
    return super.toString()+". Le han marcado "+golesRecibidos;
  }

  //metodo interfaz comparable
  
  
}
