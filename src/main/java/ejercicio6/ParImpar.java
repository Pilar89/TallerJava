package ejercicio6;

public class ParImpar {

  public void mostrarParImpar() {
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) System.out.println("Par: " + i);
      else System.out.println("Impar: " + i);

    }
  }

  public static void main(String[] args) {
    ParImpar parImpar = new ParImpar();
    parImpar.mostrarParImpar();
  }
}
