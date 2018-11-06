//EJERCICIO 3
//Escribe un programa que lea 10 números por teclado y que luego los muestre
//en orden inverso, es decir, el primero que se introduce es el último en
//mostrarse y viceversa.

public class EJ03 {
	public static void main(String[] args) {

		int[] num;
		num = new int[9];
		String l;
		int i;
		
		for (i = 0; i<10; i++){
		l = System.console.readLine();
		num[i] = Integer.parseInt(l);
		}
		
		System.out.println(" ");
		System.out.println("*A continuación el orden inverso*");
		System.out.println(" ");
		
		for (i = 10; i>0; i--){
		System.out.println(num[i]);
		}
	}
}
