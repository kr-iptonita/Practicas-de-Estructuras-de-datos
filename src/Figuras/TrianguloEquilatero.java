/**
 * Clase que representa un triángulo equilátero, heredando de PoligonoRegular.
 * Un triángulo equilátero tiene 3 lados iguales y ángulos de 60°.
 * 
 * @author Autor del proyecto
 * @version 1.0
 */
public class TrianguloEquilatero extends PoligonoRegular {
    /**
     * Número constante de lados de un triángulo equilátero
     */
    private static final int LADOS = 3;
    
    /**
     * Nombre constante del tipo de figura
     */
    private static final String TIPOFIGURA = "Triángulo equilátero";

    /**
     * Constructor para crear un triángulo equilátero.
     * 
     * @param longitudLado Longitud del lado del triángulo
     */
    public TrianguloEquilatero (double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * Calcula el área del triángulo equilátero usando la fórmula: (√3/4) × lado²
     * 
     * @return double que representa el área del triángulo
     */
    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * longitudLado * longitudLado;
    }
}