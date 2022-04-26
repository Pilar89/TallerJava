package ejercicio5;

public class ParImpar {

  public void mostrarParImpar() {

    Integer contador = 1;
    while (contador <= 100) {
      if (contador % 2 == 0) System.out.println("Par: " + contador);
      else {
        System.out.println("Impar: " + contador);
      }
      contador++;
    }
  }

  public static void main(String[] args) {
    ParImpar parImpar = new ParImpar();
    parImpar.mostrarParImpar();
  }
}

