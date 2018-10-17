

public class EJ25 {
    public static void main(String[] args) {
        
        String l;
        int i;
        int ni;
        int n;
        int v;
        
        v = 0;
        
        System.out.println("Introduzca un número.");
        System.out.println("Se mostrará volteado");
        l = System.console().readLine();
        ni = Integer.parseInt(l);
        
        n = ni;
        
        while (n > 0){
        v = (v * 10) + (n % 10);
        n = n / 10;
        
        }
        
        System.out.println("El numero "+ni+" volteado es: "+v);
    }
  }
