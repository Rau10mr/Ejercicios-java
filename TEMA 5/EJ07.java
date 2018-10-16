
public class EJ07 {
  public static void main(String[] args) {
  
    int i;
    int c;
    String l;
    
    i = 0;
    
    while (i < 4){
      
      System.out.println("Introduce la contraseña de 4 cifras");
      l = System.console().readLine();
      c = Integer.parseInt(l);
    
      if (c!=1234){
        if (c<1000){
          System.out.println("Has introducido una combinación de menos de 4 dígitos...");
          }
        
        if (c>9999){
          System.out.println("Has introducido una combinación de más de 4 dígitos...");
          }
          
          System.out.println("Lo siento, la combinación no es correcta");
      }
      else {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      }
      
      i++;
    
    }
  }
}
