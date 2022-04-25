package ejercicio13;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FechaYHora {
  public void consultaFechaYHoraActual() {

    LocalDateTime fechaTiempo = LocalDateTime.now();
    System.out.println("La fecha y hora actual es: " + fechaTiempo);


  }

  public static void main(String[] args) {
    FechaYHora fechaYHora = new FechaYHora();
    fechaYHora.consultaFechaYHoraActual();
  }
}
