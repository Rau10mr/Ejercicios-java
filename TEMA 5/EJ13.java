
public class EJ13 {
  public static void main(String[] args) {
  
    int n;
    int i;
    int cp;
    int cn;
    String l;
    
    cp = 0;
    
    System.out.println("HOla, introduzca 10 numero enteros:");
    
    for (i = 0; i < 10 ; i++) {
      l = System.console().readLine();
      n = Integer.parseInt(l);
      System.out.println(" ");
      
      if (n > 0){
        cp++;
      }
      
    }
    cn = 10 - cp;
    System.out.println("Has introducido "+ cp + " numeros positivos");
    System.out.println("y "+ cn +" numeros negativos.");
  }
}
