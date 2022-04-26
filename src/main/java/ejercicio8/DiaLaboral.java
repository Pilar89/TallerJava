package ejercicio8;

import java.util.Scanner;

public class DiaLaboral {

  public void esDiaLaboral(String dia) {
    switch (dia.toLowerCase()) {
      case "lunes":
      case "martes":
      case "miercoles":
      case "jueves":
      case "viernes":

        System.out.println("Es dia laboral.");
        break;

      case "sabado":
      case "domingo":

        System.out.println("No es día laboral.");
        break;

      default:
        System.out.println("El valor ingresado no es valido");
    }
  }

  public static void main(String[] args) {
    DiaLaboral diaLaboral = new DiaLaboral();

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un día de la semana: ");
    String dia = sc.next();
    diaLaboral.esDiaLaboral(dia.toLowerCase());
  }
}
