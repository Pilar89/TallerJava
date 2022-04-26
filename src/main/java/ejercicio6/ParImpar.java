package ejercicio6;

public class ParImpar {

  public void mostrarParImpar() {
    for (int index = 0; index <= 100; index++) {
      if (index % 2 == 0) System.out.println("Par: " + index);
      else System.out.println("Impar: " + index);

    }
  }

  public static void main(String[] args) {
    ParImpar parImpar = new ParImpar();
    parImpar.mostrarParImpar();
  }
}
