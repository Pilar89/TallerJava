package ejercicio2;


import java.util.Scanner;

public class VariableMayor {

  public void encontrarMayor(int var1, int var2) {

    if (var1 == var2) {
      System.out.println("Los dos valores son iguales");
      return;
    }
    int numeroMayor = Math.max(var1, var2);
    int numeroMenor = Math.min(var1, var2);
    System.out.println(numeroMayor + " es mayor que " + numeroMenor);


  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    VariableMayor variableMayor = new VariableMayor();

    System.out.println("Ingrese un numero: ");
    int var1 = scanner.nextInt();
    System.out.println("Ingrese otro numero: ");
    int var2 = scanner.nextInt();
    variableMayor.encontrarMayor(var1, var2);
  }


}
