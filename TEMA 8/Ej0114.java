
package tema8;

/**
 *
 * @author rau10
 */
public class Ej0114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
    }
    ////////////////////////////////////////////////////////////////////////////
    
    //Saber si un numero es capicúo
    public static boolean esCapicua(int x){
      //comparamos el numero inverso con el original
      if (voltea(x) == x){
        return true;
      }
      else {
        return false;
      }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Saber si un numero es primo
    public static boolean esPrimo(int x){
      int i;
      int cont;
      
      cont = 0;
      
      //bucle que divide el numero entre todos los numeros desde 0 hasta si mismo y cuenta los qeu al dividir dan resto 0.  
      for (i = 0; i <= x; i++){
        if (x % i == 0){
          cont++;
        }
      }
      //Vemos cuantos numeros dan resto 0 al dividir. Si hay solo 2, el numero es primo.
      if (cont == 2){
        return true;
      }
      else {
        return false;
      }
    }
    
   /////////////////////////////////////////////////////////////////////////////
    
    //Saber el siguiente numero primo desde uno introducido por teclado
    public static int siguientePrimo(int x){
      int num;
      
      num = x + 1;
      //Averiguamos si es primo, si no, el numero aumenta hasta que demos con el siguiente primo
      while (esPrimo(num)== false){
        num++;
      }
      return num;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Saber el resultado de una potencia
    public static int potencia(int x, int e){
      int i;
      int pot;
      
      pot = x;
      
      for (i = 0; i < e; i++){
        pot = pot * x;
      }
      return pot;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Saber cuantos dígitos tiene un número entero
    public static int digitos(int x){
      int dig;
      
      dig = 0;
      
      while (x > 0){
        x = x / 10;
        dig++;
      }
      return dig;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Le da la vuelta a un numero
    public static int voltea(int x){
      int copiax;
      int inverso;
      
      inverso = 0;
      copiax = x;
      
      //Invertimos el numero
      while (copiax > 0){
        inverso = (inverso * 10) + (x % 10);
        x = x / 10;
      }
      return inverso;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Devuelve el digito en la posición n de un numero
    public static int digitoN(int x, int n){
      int dig;
      int i;
      
      x = voltea(x);
      
      for (i = 0; i < n; i++){
         x = x / 10;
      }
      return x % 10;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Devuelve la posición de un dígito en un número
    public static int posicionDeDigito(int x, int n){
      int cont;
      int rest;
      
      cont = 0;
      x = voltea(x);
      
      rest = x % 10;
      
      while (n != rest && x != 0){
        rest = x % 10;
        cont++;
        x = x / 10;
      }
      if (x == 0){
        return -1;
      }
      return cont;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Quita una cantidad n de digitos por detras
    public static int quitaPorDetras(int x, int n){
      int i;
      
      for (i = 0; i < n; i++){
        x = x / 10;
      }
      return x;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Quita una cantidad n de digitos por delante
    public static int quitaPorDelante(int x, int n){
      x = voltea(x);
      return voltea(quitaPorDetras(x, n));
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Añade un numero por detras
    public static int pegaPorDetras(int x, int n){
      return ((x * 10)+ n);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Añade un numero por delante
    public static int pegaPorDelante(int x, int n){
      x = voltea(x);
      x = x + n;
      x = voltea(x);
      return x;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Coge un trozo de numero establecido por n y m posiciones
    public static int trozoDeNumero(int x, int n, int m){
      int i;
      m = digitos(x) - m;
      n = digitos(x) - n;
      
      for (i = 0; i < m; i++){
        x = x / 10;
      }
      
      x = voltea(x);
      
      for (i = 0; i < n; i++){
        x = x / 10;
      }
      
      x = voltea(x);
      return x;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Junta dos numeros
    public static int juntaNumeros(int x, int y){
      int cont;
      
      cont = digitos(y);
      
      x = x * potencia(10, cont);
      
      return x + y;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
}