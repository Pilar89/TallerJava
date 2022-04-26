package ejercicio4;

import java.util.Scanner;

public class CalculadoraIVA {
  public void calcularIVA(Double precioProducto) {
    Double IVA = 0.21 * precioProducto;
    Double precioFinal = precioProducto + IVA;
    System.out.println("El precio final del producto mas IVA es: $" + precioFinal);
  }


  public static void main(String[] args) {
    CalculadoraIVA calculadoraIVA = new CalculadoraIVA();

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el precio del producto: ");
    Double precioProducto = sc.nextDouble();
    calculadoraIVA.calcularIVA(precioProducto);
  }
}
