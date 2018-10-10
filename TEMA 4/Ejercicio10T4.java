

public class EJ10 {
  public static void main(String[] args) {
  
  int DIA;
  int MES;
  String L;
  
  System.out.println("HOla introduce el numero del dia en que naciste: ");
  L=System.console().readLine();
  DIA=Integer.parseInt(L);
  
  System.out.println(" ");
  
  System.out.println("El numero de mes en que naciste: ");
  L=System.console().readLine();
  MES=Integer.parseInt(L);
  
  System.out.println(" ");
  
  if ((DIA<=31)&&(DIA>0))
  {
    if ((MES<=12)&&(MES>0))
    {
      
      switch (MES)
      {
        case 1:
          if (DIA<=19)
          {
            System.out.println("CAPRICORNIO");
          }
          else
          {
            System.out.println("ACUARIO");
          }
          break;
          
        case 2:
          if (DIA<=18)
          {
            System.out.println("ACUARIO");
          }
          else
          {
            System.out.println("PISCIS");
          }
          break;
          
        case 3:
          if (DIA<=20)
          {
            System.out.println("PISCIS");
          }
          else
          {
            System.out.println("ARIES");
          }
          break;
          
        case 4:
          if (DIA<=19)
          {
            System.out.println("ARIES");
          }
          else
          {
            System.out.println("TAURO");
          }
          break;
          
        case 5:
          if (DIA<=20)
          {
            System.out.println("TAURO");
          }
          else
          {
            System.out.println("GEMINIS");
          }
          break;
          
        case 6:
          if (DIA<=20)
          {
            System.out.println("GEMINIS");
          }
          else
          {
            System.out.println("CANCER");
          }
          break;
          
        case 7:
          if (DIA<=22)
          {
            System.out.println("CANCER");
          }
          else
          {
            System.out.println("LEO");
          }
          break;
          
        case 8:
          if (DIA<=22)
          {
            System.out.println("LEO");
          }
          else
          {
            System.out.println("VIRGO");
          }
          break;
          
        case 9:
          if (DIA<=22)
          {
            System.out.println("VIRGO");
          }
          else
          {
            System.out.println("LIBRA");
          }
          break;
          
        case 10:
          if (DIA<=22)
          {
            System.out.println("LIBRA");
          }
          else
          {
            System.out.println("ESCORPIO");
          }
          break;
          
        case 11:
          if (DIA<=21)
          {
            System.out.println("ESCORPIO");
          }
          else
          {
            System.out.println("SAGITARIO");
          }
          break;
          
        case 12:
          if (DIA<=22)
          {
            System.out.println("SAGITARIO");
          }
          else
          {
            System.out.println("CAPRICORNIO");
          }
          break;
      }
    }
    else
    {
      System.out.println("No has introducido un mes válido");
    }
  }
  else
  {
    System.out.println("No has introducido un dia válido");
  }
  }
}
