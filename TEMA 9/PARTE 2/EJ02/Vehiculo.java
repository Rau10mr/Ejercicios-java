package TEMA9PARTE2.EJ02;
/**
 * @author rau10
 */
public abstract class Vehiculo {
  
  //Atributos
    //Clase
  private static int kmtot = 0;
  private static int vehcre = 0;
  
    //Instancia
  private int kmrec;

  public Vehiculo() {
    this.kmrec = 0;
  }
  
  //Métodos
  
    //GET
  public int getKmRec(){
    return this.kmrec;
  }
  
  public static int getKmTot(){
    return Vehiculo.kmtot;
  }
  
    //
  
  public void anda(int km){
    this.kmrec = this.kmrec + km;
    Vehiculo.kmtot = Vehiculo.kmtot + km;
  }

}
