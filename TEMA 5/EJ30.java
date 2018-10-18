
public class EJ30 {
    public static void main(String[] args) {
        
        String l;
        int h1;
        int d1;
        int h2;
        int d2;
        int ht;
        
        System.out.println("Introduce el nº de día de la semana");
        l = System.console().readLine();
        d1 = Integer.parseInt(l);
        System.out.println(" ");
        
        while (d1>7 || d1<1){
          
          System.out.println("Introduzca un día válido");
          l = System.console().readLine();
          d1 = Integer.parseInt(l);
          System.out.println(" ");
        }
        
        System.out.println("Introduce la hora en formato de 24h (sin minutos)");
        l = System.console().readLine();
        h1 = Integer.parseInt(l);
        System.out.println(" ");
        
        while (h1>23 || h1<0){
         
          System.out.println("Introduce una hora válida");
          l = System.console().readLine();
          h1 = Integer.parseInt(l);
          System.out.println(" ");
        }
        
        System.out.println("Introduce el segundo día, mayor al anterior");
        l = System.console().readLine();
        d2 = Integer.parseInt(l);
        System.out.println(" ");
        
        while (d2>7 || d2<1 || d2<d1){
          
          System.out.println("Introduzca un día válido");
          l = System.console().readLine();
          d2 = Integer.parseInt(l);
          System.out.println(" ");
          
          if (d2<d1){
            System.out.println("El segundo dia debe ser posterior al primero");
          }
        }
        
        System.out.println("Introduce la hora del segundo dia");
        l = System.console().readLine();
        h2 = Integer.parseInt(l);
        System.out.println(" ");
        
        while (h2>23 || h2<0){
         
          System.out.println("Introduce una hora válida");
          l = System.console().readLine();
          h2 = Integer.parseInt(l);
          System.out.println(" ");
        }
        
        ht = ((d2-d1)*24)+(h2-h1);
        
        System.out.println("Entre las "+h1+" del dia nº "+d1);
        System.out.println("hasta las "+h2+" del dia nº "+d2);
        System.out.println("hay: "+ht+" horas");
  }
}
