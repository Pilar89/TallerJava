package ejercicio18;

public class Ejecutable {

  public void contarYDevolverVideojuegosEntregados(Videojuego[] a) {

    if ((Videojuego) a[0] == null) return;
    int contador = 0;
    for (int index = 0; index < a.length; index++) {
      if (a[index].isEntregado()) {
        contador += 1;
        a[index].devolver();
      }
    }
    System.out.println("En total hay " + contador + " videojuegos entregados");

  }

  public void contarYDevolverSeriesEntregadas(Serie[] a) {

    if ((Serie) a[0] == null) return;
    int contador = 0;
    for (int index = 0; index < a.length; index++) {
      if (a[index].isEntregado()) {
        contador += 1;
        a[index].devolver();

      }
    }
    System.out.println("En total hay " + contador + " series entregadas");
  }


  public void calcularVideojuegoMasHorasEstimasdas(Videojuego[] a) {
    if ((Videojuego) a[0] == null) return;
    int indice = 0;
    for (int index = 1; index < a.length; index++) {
      if (a[index].getHorasEstimadas() > a[indice].getHorasEstimadas()) {
        indice = index;
      }
    }
    System.out.println(a[indice].toString());

  }


  public void calcularSerioConMasTemporadas(Serie[] a) {
    if ((Serie) a[0] == null) return;
    int indice = 0;
    for (int index = 1; index < a.length; index++) {
      if (a[index].getNumeroDeTemporadas() > a[index].getNumeroDeTemporadas()) {
        indice = index;

      }

    }
    System.out.println(a[indice].toString());
  }

  public static void main(String[] args) {
    Videojuego[] videojuegos = new Videojuego[5];

    videojuegos[0] = new Videojuego("zelda", 20, "acción-aventura", "nintendo");
    videojuegos[1] = new Videojuego();
    videojuegos[2] = new Videojuego("elden ring", 50, "acción", "sony");
    videojuegos[3] = new Videojuego();
    videojuegos[4] = new Videojuego("mario bros", 15);


    Serie[] series = new Serie[5];

    series[0] = new Serie("friends", 10, "comedia", "NBC");
    series[1] = new Serie();
    series[2] = new Serie("The Office", 9, "comedia", "NBC");
    series[3] = new Serie();
    series[4] = new Serie("the gilmore girls", "NBC");


    //Entrega algunos Videojuegos y Series con el método entregar()

    videojuegos[1].entregar();
    videojuegos[4].entregar();

    series[0].entregar();
    series[1].entregar();


    //Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.


    Ejecutable ejecutable = new Ejecutable();

    ejecutable.contarYDevolverSeriesEntregadas(series);
    ejecutable.contarYDevolverVideojuegosEntregados(videojuegos);

    //indica el Videojuego tiene más horas estimadas y la serie con mas temporadas.

    ejecutable.calcularSerioConMasTemporadas(series);
    ejecutable.calcularVideojuegoMasHorasEstimasdas(videojuegos);

  }

}

//Nota: si hay dos o mas series que coincidan con el mayor numero de
// temporadas, ya que en el ejercicio no se aclara se apliaca toString
// a la primera serie encontrada lo mismo aplica para los videojuegos y horas estimadas.


