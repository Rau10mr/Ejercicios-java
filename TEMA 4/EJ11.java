

public class EJ11 {
  public static void main(String[] args) {
  
  int H;
  int M;
  int HA;
  int S;
  String L;
  
  System.out.println("HOla, introduce la hora (sin minutos): ");
  L=System.console().readLine();
  H=Integer.parseInt(L);
  
  System.out.println("Introduce ahora los minutos: ");
  L=System.console().readLine();
  M=Integer.parseInt(L);
  
  if (H==0)
  {
    System.out.println("Ya es media noche.");
  }
  else
  {
    
    if (H<0 || M<0)
    {
      System.out.println("No has introducido una hora o minutos validos");
    }
    else
    {
      HA=(H*3600)+(M*60);
  
      S=(24*3600)-(HA);
  
      System.out.println("Quedan : "+S+"s hasta media noche");
    }
  }
  
  }
}
