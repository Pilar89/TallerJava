package ejercicio12;

import org.apache.commons.lang3.StringUtils;

public class Palabras {

  public void validarPabrasIguales(String palabra1, String palabra2) {
    if (!palabra1.equalsIgnoreCase(palabra2)) {
      String diferencia1 = StringUtils.difference(palabra1, palabra2);
      String diferencia2 = StringUtils.difference(palabra2, palabra1);
      System.out.println("Las dos palabras son diferentes, diferencia: " + diferencia1 + diferencia2);
      return;
    }
    System.out.println("Las dos palabras son iguales");

  }


  public static void main(String[] args) {
    Palabras palabras = new Palabras();
    palabras.validarPabrasIguales("holax", "hola");

  }


}


