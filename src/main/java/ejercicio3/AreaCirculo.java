package ejercicio3;

import java.util.Scanner;

public class AreaCirculo {
  public void calcularAreaCirculo(double radio) {
    double area = Math.PI * radio * radio;
    System.out.println("Area circulo: " + area);
  }

  public static void main(String[] args) {

    AreaCirculo area = new AreaCirculo();
    Scanner sc = new Scanner(System.in);
    System.out.println("Radio del circulo: ");
    String valorEntrada = sc.next();

    try {
      double radio = Double.parseDouble(valorEntrada);
      area.calcularAreaCirculo(radio);
    } catch (Exception e) {
      System.out.println("El valor ingresado no es valido");
    }

    /*nota: En el enunciado del ejercicio piden pasar de String a double con Double.parseDouble
    por lo tanto se recibe como parametro un String*/

  }
}

