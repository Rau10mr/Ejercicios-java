//EJERCICIO 2
//Define un array de 10 caracteres con nombre simbolo y asigna valores a los
//elementos según la tabla que se muestra a continuación. Muestra el contenido
//de todos los elementos del array. ¿Qué sucede con los valores de los elementos
//que no han sido inicializados?

public class EJ02 {
	public static void main(String[] args) {

		char[] simbolo;
		simbolo = new char[9];
		
		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';
		
		System.out.print("Los valores del array simbolo son los siguientes: ");
		System.out.print(simbolo[0] + ", " + simbolo[1] + ", " + simbolo[2] + ", " + simbolo[3] + ", " + simbolo[4] + ", " + simbolo[5] + ", " + simbolo[6] + ", " + simbolo[7] + ", " + simbolo[8] + ", " + simbolo[9]);
	}
}
