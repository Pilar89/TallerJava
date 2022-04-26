package ejercicio2;


import java.util.Scanner;

public class VariableMayor {

  public void encontrarMayor(Integer variable1, Integer variable2) {

    if (variable1 == variable2) {
      System.out.println("Los dos valores son iguales");
      return;
    }
    Integer numeroMayor = Math.max(variable1, variable2);
    Integer numeroMenor = Math.min(variable1, variable2);
    System.out.println(numeroMayor + " es mayor que " + numeroMenor);


  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    VariableMayor variableMayor = new VariableMayor();

    System.out.println("Ingrese un numero: ");
    Integer variable1 = scanner.nextInt();
    System.out.println("Ingrese otro numero: ");
    Integer variable2 = scanner.nextInt();
    variableMayor.encontrarMayor(variable1, variable2);
  }


}
