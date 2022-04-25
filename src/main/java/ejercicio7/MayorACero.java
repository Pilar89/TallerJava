package ejercicio7;

import java.util.Scanner;

public class MayorACero {
  public void EsMayorACero() {
    Scanner sc = new Scanner(System.in);
    int numero;

    do {
      System.out.println("Ingrese un numero: ");
      numero = sc.nextInt();

    } while (numero <= 0);
    System.out.println(numero);

  }

  public static void main(String[] args) {
    MayorACero mayorACero = new MayorACero();
    mayorACero.EsMayorACero();
  }
}
