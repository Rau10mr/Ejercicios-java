
public class EJ21 {
  public static void main(String[] args) {
  
    double n;
    
    double npm;
    
    double sni;
    int cni;
    double mni;
    
    double i;
    String l;
    
    System.out.println("HOla, introduzca un numero:");
    l = System.console().readLine();
    n = Double.parseDouble(l);
    System.out.println(" ");

    i = 0;
    
    while (n>0){
      System.out.println("Introduzca otro numero");
      l = System.console().readLine();
      n = Double.parseDouble(l);
      System.out.println(" ");
      i++;
      
      if (n % 2 = 0){
        if (n > npm){
          npm = n;
        }
      }
      else {
        sni = sni + n;
        cni++;
    }
    
    mni = sni / cni;
    
    System.out.println("Cantidad de números introducidos: "+i);
    System.out.println("Media números impares: "+mni);
    System.out.println("Número par mayor: "+npm);

    }
  }
}
