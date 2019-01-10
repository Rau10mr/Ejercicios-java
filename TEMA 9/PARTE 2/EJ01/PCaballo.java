package TEMA9PARTE2.EJ01;
/**
 * @author Rau10
 */
public class PCaballo {

  public static void main(String[] args) {
    
    Caballo caballo1 = new Caballo("Negro", "Macho", "Andaluz", 10);
    Caballo caballo2 = new Caballo("Marron", "Macho", "Árabe", 15);
    
    //Acciones caballo1
    System.out.println("El caballo1 es de color: "+caballo1.getColor());
    caballo1.cabalga();
    
    System.out.println(" ");
    
    //Acciones caballo2
    System.out.println("EL caballo2 es de raza: "+caballo2.getRaza());
    caballo2.relincha();
    caballo2.salta();
  }
  
}
