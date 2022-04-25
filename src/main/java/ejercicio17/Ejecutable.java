package ejercicio17;

public class Ejecutable {

  public void cacularPrecioElectrodomesticos(Electrodomestico[] electrodomesticosArray) {
    double precioTotalTV = 0;
    double precioTotalLavadoras = 0;
    double precioAcumulado = 0;

    for (int i = 0; i < electrodomesticosArray.length; i++) {

      System.out.println("Precio fina electrodomestico " + (i + 1) + ": €" + electrodomesticosArray[i].precioFinal());

      precioAcumulado += electrodomesticosArray[i].precioFinal();
      if (electrodomesticosArray[i] instanceof Television) {
        precioTotalTV += electrodomesticosArray[i].precioFinal();
      } else {
        precioTotalLavadoras += electrodomesticosArray[i].precioFinal();
      }

    }
    System.out.println("El precio total final de todos los tv es: €" + precioTotalTV);
    System.out.println("El precio total final de todas las lavadoras es: €" + precioTotalLavadoras);
    System.out.println("El precio total final de todos los electrodomosticos es: €" + precioAcumulado);


  }

  public static void main(String[] args) {
    Electrodomestico[] electrodomesticosArray = new Electrodomestico[10];

    electrodomesticosArray[0] = new Television(1500, 10);
    electrodomesticosArray[1] = new Television(1300, "negro", 'C', 9, 22, true);
    electrodomesticosArray[2] = new Lavadora(1600, "gris", 'C', 15, 6);
    electrodomesticosArray[3] = new Lavadora(1600, 17);
    electrodomesticosArray[4] = new Television();
    electrodomesticosArray[5] = new Television(900, "negro", 'A', 13, 19, false);
    electrodomesticosArray[6] = new Lavadora(1700, "blanco", 'D', 15, 7);
    electrodomesticosArray[7] = new Lavadora();
    electrodomesticosArray[8] = new Television(1200, "gris", 'D', 11, 20, true);
    electrodomesticosArray[9] = new Lavadora(1600, 17);

    Ejecutable ejecutable = new Ejecutable();
    ejecutable.cacularPrecioElectrodomesticos(electrodomesticosArray);


  }


}
