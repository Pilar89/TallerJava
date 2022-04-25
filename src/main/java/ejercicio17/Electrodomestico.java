package ejercicio17;
//como ejecutar verficar colo y consumos energetico si son clases privadas
//cambiar this

import java.util.Arrays;

public class Electrodomestico {


  final String COLOR_BLANCO = "blanco";
  final char CONSUMO_ENERGETICO_F = 'F';
  final double PRECIO_BASE_MIL = 100;
  final int PESO_POR_DEFECTO = 5;

  protected double precioBase;
  protected String color;
  protected char consumoEnergetico;
  protected int peso;


  public Electrodomestico() {
    precioBase = PRECIO_BASE_MIL;
    color = COLOR_BLANCO;
    consumoEnergetico = CONSUMO_ENERGETICO_F;
    peso = PESO_POR_DEFECTO;

  }

  public Electrodomestico(double precioBase, int peso) {
    this.precioBase = precioBase;
    this.peso = peso;
    color = COLOR_BLANCO;
    consumoEnergetico = CONSUMO_ENERGETICO_F;
  }

  public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
    this.precioBase = precioBase;
    this.color = color;
    this.consumoEnergetico = consumoEnergetico;
    this.peso = peso;
    validadorParametros(this.color, this.consumoEnergetico);

  }

  private void comprobarConsumoEnergetico(char consumoEnergetico) {
    Character[] consumos = {'A', 'B', 'C', 'D', 'E', 'F'};

    if (!Arrays.asList(consumos).contains(consumoEnergetico)) {
      this.consumoEnergetico = CONSUMO_ENERGETICO_F;
    }
  }

  private void comprobarColor(String color) {
    String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
    if (!Arrays.asList(colores).contains(color.toLowerCase())) {
      this.color = COLOR_BLANCO;
    }

  }

  public double precioFinal() {
    double calculoPrecioFinal = this.precioBase;

    switch (this.consumoEnergetico) {
      case 'A':
        calculoPrecioFinal = calculoPrecioFinal + 100;
        break;
      case 'B':
        calculoPrecioFinal = calculoPrecioFinal + 80;
        break;
      case 'C':
        calculoPrecioFinal = calculoPrecioFinal + 60;
        break;
      case 'D':
        calculoPrecioFinal = calculoPrecioFinal + 50;
        break;
      case 'E':
        calculoPrecioFinal = calculoPrecioFinal + 30;
        break;
      case 'F':
        calculoPrecioFinal = calculoPrecioFinal + 10;
        break;
    }
    if (this.peso <= 19) return (calculoPrecioFinal + 10);
    if (this.peso >= 20 && this.peso <= 49) return (calculoPrecioFinal + 50);
    if (this.peso >= 50 && this.peso <= 79) return (calculoPrecioFinal + 80);
    return (calculoPrecioFinal + 100);

  }

  public void validadorParametros(String color, char consumoEnergetico) {
    comprobarColor(color);
    comprobarConsumoEnergetico(consumoEnergetico);

  }

  public double getPrecioBase() {
    return precioBase;
  }

  public String getColor() {
    return color;
  }

  public char getConsumoEnergetico() {
    return consumoEnergetico;
  }

  public int getPeso() {
    return peso;
  }
}
