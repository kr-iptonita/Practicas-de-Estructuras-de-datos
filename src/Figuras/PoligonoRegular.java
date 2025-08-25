/**
 * Clase abstracta que representa un polígono regular y implementa la interfaz Figura.
 * Proporciona implementación base para polígonos regulares.
 * 
 * @author Autor del proyecto
 * @version 1.0
 */
public abstract class PoligonoRegular implements Figura {
    /**
     * Número de lados del polígono regular
     */
    protected int numeroLados;
    
    /**
     * Longitud de cada lado del polígono
     */
    protected double longitudLado;
    
    /**
     * Tipo o nombre de la figura geométrica
     */
    protected String tipoFigura;

    /**
     * Constructor para crear un polígono regular.
     * 
     * @param numeroLados Número de lados del polígono
     * @param longitudLado Longitud de cada lado
     * @param tipoFigura Nombre del tipo de polígono
     */
    public PoligonoRegular(int numeroLados, double longitudLado, String tipoFigura) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
        this.tipoFigura = tipoFigura;
    }

    /**
     * Calcula el perímetro del polígono regular.
     * 
     * @return double que representa el perímetro (número de lados × longitud del lado)
     */
    public double calcularPerimetro() {
        return numeroLados * longitudLado;
    }

    /**
     * Método abstracto para calcular el área del polígono.
     * Debe ser implementado por las subclases concretas.
     * 
     * @return double que representa el área del polígono
     */
    public abstract double calcularArea();

    /**
     * Representación en String del polígono regular.
     * 
     * @return String con información del tipo de figura, área y perímetro
     */
    public String toString(){
        return "El tipo de figura es: " + this.tipoFigura + 
        "\n Su área es: " + this.calcularArea() + 
        "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}