package ejercicio10;

import java.util.Scanner;

public class Frase {

  public void eliminarEspacios(String fraseIngresada) {
    String nuevaFrase = fraseIngresada.replaceAll(" ", "");
    System.out.println(nuevaFrase);

  }

  public static void main(String[] args) {
    Frase frase = new Frase();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un frase: ");
    String fraseIngresada = scanner.nextLine();
    frase.eliminarEspacios(fraseIngresada);
  }

}

