package TEMA9PARTE2.EJ02;
/**
 * @author Rau10
 */
public class Coche extends Vehiculo {
  
  private String Matricula;

  public Coche(String Mat) {
    super();
    this.Matricula = Mat;
  }
  
  public void encenderFaros() {
    System.out.println("*Alumbra*");
  }
  
}
