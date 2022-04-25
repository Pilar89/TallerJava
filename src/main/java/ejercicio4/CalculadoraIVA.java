package ejercicio4;

import java.util.Scanner;

public class CalculadoraIVA {
  public void calcularIVA(double precioProducto) {
    double IVA = 0.21 * precioProducto;
    double precioFinal = precioProducto + IVA;
    System.out.println("El precio final del producto mas IVA es: $" + precioFinal);
  }


  public static void main(String[] args) {
    CalculadoraIVA calculadoraIVA = new CalculadoraIVA();

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el precio del producto: ");
    double precioProducto = sc.nextDouble();
    calculadoraIVA.calcularIVA(precioProducto);
  }
}
