/**
 * Clase que representa un cuadrado, heredando de PoligonoRegular.
 * Un cuadrado es un polígono regular con 4 lados iguales.
 * 
 * @author Autor del proyecto
 * @version 1.0
 */
public class Cuadrado extends PoligonoRegular {
    /**
     * Número constante de lados de un cuadrado
     */
    private static final int LADOS = 4;
    
    /**
     * Nombre constante del tipo de figura
     */
    private static final String TIPOFIGURA = "Cuadrado";

    /**
     * Constructor para crear un cuadrado.
     * 
     * @param longitudLado Longitud del lado del cuadrado
     */
    public Cuadrado(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * Calcula el área del cuadrado.
     * 
     * @return double que representa el área (lado × lado)
     */
    @Override
    public double calcularArea() {
        return longitudLado * longitudLado;
    }
}