package TEMA9PARTE2.EJ02;
/**
 * @author Rau10
 */
public class PVehiculo {

  public static void main(String[] args) {
  
  int resp;
  resp = 0;
  
  int km;
  
  Bicicleta bici = new Bicicleta(12345);
  Coche coche = new Coche("1234abc");
  
  while (resp != 8) {
    System.out.println("1. Anda con la bicicleta");
    System.out.println("2. Anda con el coche");
    System.out.println("3. Usa el timbre de la bici");
    System.out.println("4. Enciende los faros del coche");
    System.out.println("5. Km de la bici?");
    System.out.println("6. Km del coche?");
    System.out.println("7. Km Totales?");
    System.out.println("8. Salir");
    System.out.println("Escribe un numero para elegir una opcion");
    
    resp = Integer.parseInt(System.console().readLine());
    
    switch (resp) {
      case 1:
        System.out.print("Introduce los km a recorrer ");
        km = Integer.parseInt(System.console().readLine());
        bici.anda(km);
      break;
      
      case 2:
        System.out.print("Introduce los km a recorrer ");
        km = Integer.parseInt(System.console().readLine());
        coche.anda(km);
      break;

      case 3:
        bici.sonarTimbre();
      break;
      
      case 4:
        coche.encenderFaros();
      break;
      
      case 5:
        System.out.println("La bicicleta ha recorrido: "+bici.getKmRec());
      break;
      
      case 6:
        System.out.println("El coche ha recorrido: "+coche.getKmRec());
      break;
      
      case 7:
        System.out.println("Los vehículos han recorrido: "+Vehiculo.getKmTot());
      break;
      
      case 9:
        System.out.println("No ha elegido una opción válida.");
        System.out.println("Finalizando proceso");
      break;
      
      case 0:
        System.out.println("No ha elegido una opción válida.");
        System.out.println("Finalizando proceso");
      break;
        
      default:
      }
    }
  
  }
}
