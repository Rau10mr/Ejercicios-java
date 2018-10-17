

public class EJ27 {
    public static void main(String[] args) {
        
        String l;
        int ni;
        int i;
        int cont;
        int s;
        int res;
        
        i = 1;
        s = 0;
        cont = 0;
        
        System.out.println("Introduce un número.");
        System.out.println("Se contarán, mostrarán y sumarán los multiplos de 3");
        l = System.console().readLine();
        ni = Integer.parseInt(l);
        
        while (i <= ni){
          
          res = i % 3;
          
          if (res == 0){
            System.out.println(i);
            s = s + i;
            cont++;
          }
          
          i++;
        }
        
        
        System.out.println("Multiplos de 3 hasta "+ni+": "+cont);
        System.out.println("Suma de los multiplos de 3 encontrados: "+s);
    }
  }
