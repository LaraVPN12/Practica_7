
package Ejercicio1;

public class FiguraGeometrica implements Area,Perimetro {

    @Override
    public void CalculoArea(double base, double altura) {
        double Area = base*altura;
        System.out.println("El Área del Rectángulo es: "+Area);
    }

    @Override
    public void CalculoPerimetro(double base, double altura) {
        double Perimetro = (base*2)+(altura*2);
        System.out.println("El Perímetro del Rectángulo es: "+Perimetro);
    }
    
}


