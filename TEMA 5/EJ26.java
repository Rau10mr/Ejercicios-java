

public class EJ25 {
    public static void main(String[] args) {
        
        String l;
        int pos;
        int n;
        int ni;
        int v;
        int d;
        int lon;
        
        v = 0;
        ln = 0;
        pos = 1;
        
        System.out.println("Introduzca un número: ");
        l = System.console().readLine();
        ni = Integer.parseInt(l);
        
        n = ni;
        
        System.out.println("Introduzca un dígito");
        System.out.println("el programa dirá en que posición se encuentra");
        System.out.println("dentro del número");
        l = System.console().readLine();
        d = Integer.parseInt(l);
        
        if (n == 0){
          lon = 1;
        }
        
        while (n > 0){
          
          v = (n % 10) + (v * 10);
          n = n / 10;
          lon++;
        }
        
        while (v > 0){
          if ((v % 10)== d){
            System.out.println("El dígito esta en la posición: "+pos);
          }
          v = v / 10;
          pos++;
        }
    }
  }
