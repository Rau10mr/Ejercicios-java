//Ejercicio 5
//Define tres arrays de 20 números enteros cada una, con nombres numero,
//cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
//array cuadrado se deben almacenar los cuadrados de los valores que hay en el
//array numero. En el array cubo se deben almacenar los cubos de los valores que
//hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
//en tres columnas

public class EJ05 {
	public static void main(String[] args) {

		int[] num;
		num = new int[19];
		int nmax;
		int nmin;
		
		for (i = 0; i < 10; i++){
			l = System.console.readLine();
			num[i] = Integer.parseInt(l);
		
			if (num[i]>nmax){
				nmax = num[i];
			}
			if (num[i]<nmin){
				nmin = num[i];
			}
		
		}
	}
}
