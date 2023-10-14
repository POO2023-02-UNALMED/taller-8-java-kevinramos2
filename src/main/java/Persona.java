public class Persona {
  //Atributos
  private String nombre;
  private int edad;
  private String altura;
  private String sexo;

  //constructuro inicializador
  public Persona(String nombre, int edad, String altura, String sexo){
    this.nombre = nombre;
    this.edad = edad;
    this.altura = altura;
    this.sexo = sexo;
  }
  //gets y sets
  public String getNombre(){
    return this.nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public int getEdad(){
    return this.edad;
  }
  public void setEdad(int edad){
    this.edad = edad;
  }
  public String getAltura(){
    return this.altura;
  }
  public void setAltura(String altura){
    this.altura = altura;
  }
  public String getSexo(){
    return this.sexo;
  }
  public void setSexo(String sexo){
    this.sexo = sexo;
  }

}
