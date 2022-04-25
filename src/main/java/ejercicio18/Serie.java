package ejercicio18;

public class Serie implements Entregable {

  final int NUMERO_TEMPORADAS = 3;
  final boolean ENTREGADO = false;

  private String titulo;
  private int numeroDeTemporadas;
  private boolean entregado;
  private String genero;
  private String creador;


  public Serie() {
    this.titulo = "";
    this.numeroDeTemporadas = NUMERO_TEMPORADAS;
    this.entregado = ENTREGADO;
    this.genero = "";
    this.creador = "";
  }

  public Serie(String titulo, String creador) {
    this.titulo = titulo;
    this.creador = creador;
    this.numeroDeTemporadas = NUMERO_TEMPORADAS;
    this.entregado = ENTREGADO;
    this.genero = "";


  }

  public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
    this.titulo = titulo;
    this.numeroDeTemporadas = numeroDeTemporadas;
    this.genero = genero;
    this.creador = creador;
    this.entregado = ENTREGADO;

  }


  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setNumeroDeTemporadas(int numeroDeTemporadas) {
    this.numeroDeTemporadas = numeroDeTemporadas;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void setCreador(String creador) {
    this.creador = creador;
  }



  public String getTitulo() {
    return titulo;
  }

  public int getNumeroDeTemporadas() {
    return numeroDeTemporadas;
  }

  public String getGenero() {
    return genero;
  }

  public String getCreador() {
    return creador;
  }


//que es Sobrescribe los métodos toString.

  @Override
  public String toString() {
    return "Serie{" +
      "titulo='" + titulo + '\'' +
      ", numeroDeTemporada=" + numeroDeTemporadas +
      ", entregado=" + entregado +
      ", genero='" + genero + '\'' +
      ", creador='" + creador + '\'' +
      ", NUMERO_TEMPORADAS=" + NUMERO_TEMPORADAS +
      ", ENTREGADO=" + ENTREGADO +
      '}';
  }

  @Override
  public void entregar() {
    if (!this.entregado) this.entregado = true;
  }

  @Override
  public void devolver() {
    if (this.entregado) this.entregado = false;

  }

  @Override
  public boolean isEntregado() {
    return this.entregado;

  }

  @Override
  public boolean compareTo(Object a) {
    if ((Serie)a == null) return false;
    if (this.numeroDeTemporadas == ((Serie) a).numeroDeTemporadas) return true;
    return false;
  }
}
