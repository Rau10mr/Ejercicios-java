
public class EJ5 {
  public static void main(String[] args){

  String rojo = "\033[31m";
  String verde = "\033[32m";
  String naranja = "\033[33m";
  String azul = "\033[34m";
  String morado = "\033[35m";
  String blanco = "\033[37m";
  
  System.out.print("LUNES   MARTES    MIÉRCOLES   JUEVES    VIERNES\n");
  System.out.print(rojo + " EED" + verde + "     SINF" + naranja + "        PRO""        PRO" + verde + "       SINF"" \n");
  System.out.print(azul + " LM" + verde + "      SINF" + naranja + "        PRO""        PRO" + verde + "       SINF"" \n");
  System.out.print(azul + " LM" + verde + "      SINF" + naranja + "        PRO" + rojo + "        EED" + verde + "       SINF"" \n");
  System.out.print(blanco + "-----------------------------------------------\n");
  System.out.print(morado + " BBDD" + naranja + "    PRO" + morado + "        BBDD" + rojo + "        EED" + blanco + "       FOL""  \n");
  System.out.print(morado + " BBDD" + naranja + "    PRO" + morado + "        BBDD" + azul + "        LM" + blanco + "         FOL""  \n");
  System.out.print(morado + " BBDD" + naranja + "    PRO" + morado + "        BBDD" + azul + "        LM" + blanco + "         FOL""  \n");
  }
}
