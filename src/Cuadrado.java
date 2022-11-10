public class Cuadrado{

  private static double lado;
   
  public Cuadrado(double l){
    lado = l;
  }
  
  public double area(double lado){
      double area = lado * lado;
      return area;
  }
  
}
