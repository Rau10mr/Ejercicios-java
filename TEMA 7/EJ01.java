
Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?

public class EJ01 {
	public static void main(String[] args) {

		int[] num;
		n = new int[11];
		
		n[0] = 39;
		n[1] = -2;
		n[4] = 0;
		n[6] = 14;
		n[8] = 5;
		n[9] = 120;
		
		System.out.print("Los valores del array n son los siguientes: ");
		System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3] + ", " + n[4] + ", " + n[5]);
		System.out.print(n[6] + ", " + n[7] + ", " + n[8] + ", " + n[9] + ", " + n[10]);
		System.out.print(n[11] + ", " + n[12]);
	}
}
