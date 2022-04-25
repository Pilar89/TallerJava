package ejercicio11;

import java.util.Scanner;

public class Texto {
  public void contarVocales(String frase) {
    int cuentaVocales = frase.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]", "").length();
    int longitudFrase = frase.replaceAll(" ", "").length();


    System.out.println("La frase ingresada tiene un longitud de "
      + longitudFrase + " palabras y cuenta con " + cuentaVocales + " vocales.");
  }

  public static void main(String[] args) {
    Texto texto = new Texto();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese una frase: ");
    String frase = scanner.nextLine();
    texto.contarVocales(frase);
  }
}
