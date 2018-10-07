

public class EJ9 {
  public static void main(String[] args) {
  
  double x1;
  double x2;
  double a;
  double b;
  double c;
  double RAIZ;
  String L;
  
  System.out.println("Vamos a resolver una ecuación del tipo: ");
  System.out.println("ax^2+bx+c=0");
  System.out.println("Para ello, tendras que introducir... ");
  System.out.println(" ");
  
  System.out.println("El valor de 'a'");
  L=System.console().readLine();
  a=Double.parseDouble(L);
  System.out.println(" ");
  
  System.out.println("El valor de 'b'");
  L=System.console().readLine();
  b=Double.parseDouble(L);
  System.out.println(" ");
  
  System.out.println("El valor de 'c'");
  L=System.console().readLine();
  c=Double.parseDouble(L);
  System.out.println(" ");
  
  RAIZ=(b*b)-(4*a*c);
  
  if ((c==0)&&(a!=0)&&(b!=0))
  {
    x1=0;
    x2=(-b)/a;
    System.out.println("x="+x1);
    System.out.println("x2="+x2);
  }
  
  if ((b==0)&&(a!=0))
  {
    
    if (c<0)
    {
      
      x1= Math.sqrt(a/(-c));
      x2=(-x1);
      System.out.println("x="+x1);
      System.out.println("x2="+x2);
    }
    
    if (c==0)
    {
      
      x1=0;
      x2=0;
      System.out.println("x="+x1);
      System.out.println("x2="+x2);
    }
  }
  
  if (a==0)
  {
    
    if (b==0)
    {
      
      System.out.println("No es una ecuación");
    }
    
    if (c==0)
    {
      
      x1=0;
      System.out.println("x="+x1);
      System.out.println("x2 no existe");
    }
    
    if ((b!=0)&&(c!=0))
    {
      
      x1=(-c)/b;
      System.out.println("x="+x1);
      System.out.println("x2 no existe");
    }
  }
  
  if (b!=0)
  {
    if (RAIZ>0)
    {
    
      x1=((-b)+Math.sqrt(RAIZ))/(2*a);
      x2=((-b)-Math.sqrt(RAIZ))/(2*a);
      System.out.println("x="+x1);
      System.out.println("x2="+x2);
    }
  
    if (RAIZ<0)
    {
      System.out.println("Sin solucion");
    }
    
  }
  
  
  }
}
