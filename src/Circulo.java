public class Circulo {

    private static double radio;

    public Circulo(double r){
        radio = r;
    }

    public double obtenerPerimetro(double radio){
        double perimetro = Math.PI * (Math.pow(radio, 2));
        return perimetro;
    }
}
