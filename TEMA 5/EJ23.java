
public class EJ23 {
    public static void main(String[] args) {
        
        String l;
        int i;
        int n;
        int s;
        int med;
        
        s = 0;
        
        System.out.println("Introduzca números. Cuando la suma de estos");
        System.out.println("alcance o supere 10000, el programa terminará");
        l = System.console().readLine();
        n = Integer.parseInt(l);
        System.out.println(" ");
        
        s = s + n;
        i = 1;
        
        while (s<10000){
            System.out.println("Introduzca otro numero: ");
            l = System.console().readLine();
            n = Integer.parseInt(l);
            System.out.println(" ");
            i++;
            s = s + n;
        }
        
        med = s / i;
        System.out.println("Suma total: "+s);
        System.out.println("Numeros introducidos: "+i);
        System.out.println("Media de los numeros: "+med);
    }
    
}
