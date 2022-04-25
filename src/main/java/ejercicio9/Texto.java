package ejercicio9;

import java.util.Scanner;

public class Texto {

  public void editarTexto(String nuevoTexto) {
    String texto = "\"La sonrisa sera la mejor arma contra la tristeza\". ";
    String textoEditado = texto.replace("a", "e");

    System.out.println(textoEditado + nuevoTexto);
  }

  public static void main(String[] args) {
    Texto texto = new Texto();

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese una frase: ");
    String frase = sc.nextLine();
    texto.editarTexto(frase);
  }
}
