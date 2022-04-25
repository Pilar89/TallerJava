package ejercicio1;

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
    ejercicio2.VariableMayor variableMayor = new ejercicio2.VariableMayor();
    variableMayor.encontrarMayor(6, 3);
  }

}
