package ejercicio17;

public class Lavadora extends Electrodomestico {

  final int CARGA_POR_DEFECTO = 5;

  private int carga;


  public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
    super(precioBase, color, consumoEnergetico, peso);
    this.carga = carga;
    validadorParametros(this.color, this.consumoEnergetico);
  }


  public Lavadora() {
    super();
    this.carga = CARGA_POR_DEFECTO;
  }

  public Lavadora(double precioBase, int peso) {
    super(precioBase, peso);
    this.color = COLOR_BLANCO;
    this.consumoEnergetico = CONSUMO_ENERGETICO_F;
    this.carga = CARGA_POR_DEFECTO;
  }

  public int getCarga() {
    return carga;
  }


  public double precioFinal() {
    double calculoPrecioFinal = super.precioFinal();
    if (this.carga > 30) {
      calculoPrecioFinal = calculoPrecioFinal + 50;
    }
    return calculoPrecioFinal;
  }
}
