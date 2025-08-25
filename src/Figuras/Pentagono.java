/**
 * Clase que representa un pentágono regular, heredando de PoligonoRegular.
 * Un pentágono regular tiene 5 lados iguales y ángulos de 108°.
 * 
 * @author Autor del proyecto
 * @version 1.0
 */
public class Pentagono extends PoligonoRegular {
    /**
     * Número constante de lados de un pentágono
     */
    private static final int LADOS = 5;
    
    /**
     * Nombre constante del tipo de figura
     */
    private static final String TIPOFIGURA = "Pentagono";

    /**
     * Valor de π utilizado para cálculos trigonométricos
     */
    public double PI = 3.1416;

    /**
     * Constructor para crear un pentágono regular.
     * 
     * @param longitudLado Longitud del lado del pentágono
     */
    public Pentagono(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * Calcula el área del pentágono regular usando la fórmula: (perímetro × apotema) / 2
     * 
     * @return double que representa el área del pentágono
     */
    @Override
    public double calcularArea() {
        return (calcularPerimetro() * calcularApotema()) / 2;
    }

    /**
     * Calcula la apotema del pentágono regular.
     * La apotema es la distancia desde el centro al punto medio de un lado.
     * 
     * @return double que representa la apotema del pentágono
     */
    public double calcularApotema(){
        return longitudLado / (2 * Math.tan(Math.toRadians(180.0 / LADOS)));
    }
}