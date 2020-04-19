
package Ejercicio2;

public class Producto implements Impuesto,Caducidad{

    @Override
    public String MensajeImpuesto() {
        return "El impuesto agregado es del 13% extra al precio de su producto";
    }

    @Override
    public String AlertaCaducidad() {
        return "Consumir antes de: 13/04/2020";
    }
    
}
