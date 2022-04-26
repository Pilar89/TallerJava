package ejercicio1;

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
    ejercicio2.VariableMayor variableMayor = new ejercicio2.VariableMayor();
    variableMayor.encontrarMayor(6, 3);
  }

}
