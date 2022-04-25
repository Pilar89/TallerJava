package ejercicio16;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Edad: ");
    int edad = scanner.nextInt();
    System.out.println("Sexo (M/F): ");
    char sexo = scanner.next().charAt(0);
    System.out.println("Peso(Kg): ");
    double peso = scanner.nextDouble();
    System.out.println("Estatura(m): ");
    double altura = scanner.nextDouble();

    Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

    Persona persona2 = new Persona(nombre, edad, sexo);

    Persona persona3 = new Persona();
    persona3.setNombre("Maria");
    persona3.setEdad(20);
    persona3.setSexo('F');
    persona3.setPeso(55);
    persona3.setAltura(1.65);

    //Según el enunciado del ejercicio el peso y estatura por defecto son cero,
    // no se puede calcular IMC para la persona  2

    System.out.println("IMC persona 1: " + persona1.calcularIMC());
    System.out.println("IMC persona 2: " + persona2.calcularIMC());
    System.out.println("IMC persona 3: " + persona3.calcularIMC());

    System.out.println("Es mayor de edad persona1: " + persona1.esMayorDeEdad());
    System.out.println("Es mayor de edad persona2: " + persona2.esMayorDeEdad());
    System.out.println("Es mayor de edad persona3: " + persona3.esMayorDeEdad());

    System.out.println("Persona 1");
    System.out.println(persona1.toString());
    System.out.println("Persona 2");
    System.out.println(persona2.toString());
    System.out.println("Persona 3");
    System.out.println(persona3.toString());


  }
}
