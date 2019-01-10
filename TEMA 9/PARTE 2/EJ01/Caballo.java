package TEMA9PARTE2.EJ01;
/**
 * @author Rau10
 */
public class Caballo {
  
//Atributos
 private String color;
 private String sexo;
 private String raza;
 private int edad;

//Metodos
 //Constructor
 public Caballo (String c, String s, String r, int e){
   this.color = c;
   this.sexo = s;
   this.raza = r;
   this.edad = e;
 }
 //
 public String getColor(){
   return this.color;
 }
 
 public String getRaza(){
   return this.raza;
 }
 
 public void cabalga(){
   System.out.println("tacatá tacatá tacatá tacatá tacatá tacatá tacatá tacatá");
 }
 
 public void relincha(){
   System.out.println("Jiiiiiihhhh... brr...");
 }
 
 public void salta(){
   System.out.println("*Hop* *hop*");
 }

}
















