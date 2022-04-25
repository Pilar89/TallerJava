package ejercicio15;

import java.util.Scanner;

public class Menu {

  public void imprimirMenu() {
    Scanner scanner = new Scanner(System.in);
    int opcion = 0;


    while (opcion != 8) {
      System.out.println("****** GESTION CINEMATOGRÁFICA ********\n1-NUEVO ACTOR\n2-BUSCAR ACTOR" +
        "\n3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n6- VER PELICULAS DE LOS ACTORES" +
        "\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR");
      opcion = scanner.nextInt();
      if (opcion > 8) System.out.println(" OPCION INCORRECTO");

    }

  }

  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.imprimirMenu();
  }
}
