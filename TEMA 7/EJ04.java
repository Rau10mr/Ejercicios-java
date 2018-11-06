//Ejercicio 4
//Define tres arrays de 20 números enteros cada una, con nombres numero,
//cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
//array cuadrado se deben almacenar los cuadrados de los valores que hay en el
//array numero. En el array cubo se deben almacenar los cubos de los valores que
//hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
//en tres columnas

public class EJ04 {
	public static void main(String[] args) {

		int[] numero;
		numero = new int[19];
		int[] cuadrado;
		cuadrado = new int[19]; 
		int[] cubo;
		cubo = new int[19];
		int i;
		
		for (i = 0; i<20; i++){
		numero[i] = (int)Math.random()*101;
		cuadrad0[i] = numero[i]*numero[i];
		cubo[i] = numero[i]*numero[i]*numero[i];
		}

		for (i = 20; i>0; i--){
		System.out.println(numero[i]+"  "+cuadrado[i]+"  "+cubo[i]);
		}
	}
}
