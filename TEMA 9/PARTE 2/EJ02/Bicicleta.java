package TEMA9PARTE2.EJ02;
/**
 * @author Rau10
 */
public class Bicicleta extends Vehiculo {
  
  private int serialBicicleta;

  public Bicicleta(int sB) {
    super();
    this.serialBicicleta = sB;
  }
  
  public void sonarTimbre() {
    System.out.println("*Timbre de bicicleta*");
  }
  
}
