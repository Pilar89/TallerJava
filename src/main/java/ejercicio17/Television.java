package ejercicio17;

public class Television extends Electrodomestico {

  final int RESOLUCION_POR_DEFECTO = 20;
  final boolean TDT_POR_DEFECTO = false;

  private int resolucion;
  private boolean sintonizadorTDT;


  public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
    super(precioBase, color, consumoEnergetico, peso);
    this.resolucion = resolucion;
    this.sintonizadorTDT = sintonizadorTDT;
    validadorParametros(this.color, this.consumoEnergetico);
  }

  public Television() {
    super();
    sintonizadorTDT = TDT_POR_DEFECTO;
    resolucion = RESOLUCION_POR_DEFECTO;

  }

  public Television(double precioBase, int peso) {
    super(precioBase, peso);
    this.color = COLOR_BLANCO;
    this.consumoEnergetico = CONSUMO_ENERGETICO_F;
    sintonizadorTDT = TDT_POR_DEFECTO;
    resolucion = RESOLUCION_POR_DEFECTO;

  }

  public int getResolucion() {
    return resolucion;
  }

  public boolean isSintonizadorTDT() {
    return sintonizadorTDT;
  }


  public double precioFinal() {
    double calculoPrecioFinal = super.precioFinal();
    if (this.resolucion > 40) {
      calculoPrecioFinal = (calculoPrecioFinal * 0.3) + calculoPrecioFinal;
    }
    if (sintonizadorTDT == true) {
      calculoPrecioFinal = calculoPrecioFinal + 50;
    }
    return calculoPrecioFinal;

  }


}

