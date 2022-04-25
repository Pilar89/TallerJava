package ejercicio16;

public class Persona {

  final char SEXO_HOMBRE = 'H';


  private String nombre;
  private int edad;
  private String DNI;
  private char sexo;
  private double peso;
  private double altura;




  public Persona() {
    this.nombre = "";
    this.edad = 0;
    this.sexo = SEXO_HOMBRE;
    this.peso = 0;
    this.altura = 0;
    generarDNI();

  }

  public Persona(String nombre, int edad, char sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = 0;
    this.altura = 0;
    comprobarSexo(this.sexo);
    generarDNI();
  }

  public Persona(String nombre, int edad, char sexo, double peso, double altura) {

    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
    comprobarSexo(this.sexo);
    generarDNI();
  }

  public String calcularIMC() {
    double IMC = this.peso / (this.altura * this.altura);
    if (this.altura == 0 || this.peso == 0)
      return "No se puede calcular el IMC, peso y/o altura deben ser diferentes de cero.";
    if (IMC < 20) return "Esta por debajo de su peso ideal.";
    if (IMC > 25) return "Tiene sobrepeso.";
    return "Esta en su peso ideal.";
  }


  public boolean esMayorDeEdad() {
    if (this.edad >= 18) {
      return true;
    }
    return false;
  }

  private void comprobarSexo(char sexo) {
    if (sexo != 'M' || sexo != 'F') {
      this.sexo = SEXO_HOMBRE;
    }

  }


  @Override
  public String toString() {
    return "Persona{" +
      "nombre='" + nombre + '\'' +
      ", edad=" + edad +
      ", DNI='" + DNI + '\'' +
      ", sexo=" + sexo +
      ", peso=" + peso +
      ", altura=" + altura +
      '}';
  }

  //generaDNI(): Se busca formula en internet para el claculo de DNI.


  private void generarDNI(){
    final int divisor = 23;

    //Se genera numero aleatorio de 8 cifras.

    int numeroAleatorio = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));

    int res = numeroAleatorio - (numeroAleatorio / divisor * divisor);

    //Se calcula la letra del DNI

    char letraDNI = generaLetraDNI(res);

    this.DNI = Integer.toString(numeroAleatorio) + letraDNI;

  }

  private char generaLetraDNI(int numero) {

    char arrayLetras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',

      'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',

      'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


    return arrayLetras[numero];

  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;

  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
    comprobarSexo(this.sexo);
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
}



