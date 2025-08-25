/**
 * Clase que representa un círculo, implementando directamente la interfaz Figura.
 * Un círculo no es un polígono regular, por lo que no hereda de PoligonoRegular.
 * 
 * @author Autor del proyecto
 * @version 1.0
 */
public class Circulo implements Figura {
    /**
     * Radio del círculo
     */
    public double radio;
    
    /**
     * Valor de π utilizado para cálculos circulares
     */
    public double PI = 3.1416;

    /**
     * Constructor para crear un círculo.
     * 
     * @param radio Radio del círculo
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula el área del círculo usando la fórmula: π × radio²
     * 
     * @return double que representa el área del círculo
     */
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    /**
     * Calcula el perímetro (circunferencia) del círculo usando la fórmula: 2 × π × radio
     * 
     * @return double que representa el perímetro del círculo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    /**
     * Representación en String del círculo.
     * 
     * @return String con información del tipo de figura, área y perímetro
     */
    public String toString(){
        return "El tipo de figura es: Círculo" + 
        "\n Su área es: " + this.calcularArea() + 
        "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}