package ejercicio18;

public class Videojuego implements Entregable {

  final int HORAS_POR_DEFECTO = 10;
  final boolean ENTREGADO = false;

  private String titulo;
  private int horasEstimadas;
  private boolean entregado;
  private  String genero;
  private String compania;

  public Videojuego() {
    this.titulo = "";
    this.horasEstimadas = HORAS_POR_DEFECTO;
    this.entregado = ENTREGADO;
    this.genero = "";
    this.compania = "";
  }

  public Videojuego(String titulo, int horasEstimadas) {
    this.titulo = titulo;
    this.horasEstimadas = horasEstimadas;
    this.entregado = ENTREGADO;
    this.genero = "";
    this.compania = "";
  }

  public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
    this.titulo = titulo;
    this.horasEstimadas = horasEstimadas;
    this.genero = genero;
    this.compania = compania;
    this.entregado = ENTREGADO;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getHorasEstimadas() {
    return horasEstimadas;
  }

  public String getGenero() {
    return genero;
  }

  public String getCompania() {
    return compania;
  }




  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setHorasEstimadas(int horasEstimadas) {
    this.horasEstimadas = horasEstimadas;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void setCompania(String compania) {
    this.compania = compania;
  }


  @Override
  public String toString() {
    return "Videojuego{" +
      "titulo='" + titulo + '\'' +
      ", horasEstimadas=" + horasEstimadas +
      ", entregado=" + entregado +
      ", genero='" + genero + '\'' +
      ", compania='" + compania + '\'' +
      '}';
  }

  @Override
  public void entregar() {
    this.entregado = true;

  }

  @Override
  public void devolver() {
    this.entregado = false;

  }

  @Override
  public boolean isEntregado() {
    return this.entregado;

  }

  @Override
  public boolean compareTo(Object a) {
    if ((Videojuego) a == null) return false;
    if (this.horasEstimadas == ((Videojuego) a).horasEstimadas) return true;
    return false;

  }



}
