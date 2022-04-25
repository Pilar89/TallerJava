package ejercicio14;

import java.util.Scanner;

public class Numeros {

  public void imprimirNumeros(int numero) {

    if (numero > 1000) {
      System.out.println("Debes ingresar un numero menor o igual a 1000");
      return;
    }
    for (int i = numero; i <= 1000; i += 2) {
      System.out.println(i);

    }
  }

  public static void main(String[] args) {
    Numeros numeros = new Numeros();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero menor o igual a 1000: ");
    int numero = scanner.nextInt();

    numeros.imprimirNumeros(numero);
  }

}
