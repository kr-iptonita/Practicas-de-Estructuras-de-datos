/**
 * Interfaz que define el contrato para todas las figuras geométricas.
 * Todas las figuras deben implementar métodos para calcular área y perímetro.
 * 
 * @author Autor del proyecto
 * @version 1.0
 */
public interface Figura {
    /**
     * Calcula el área de la figura geométrica.
     * 
     * @return double que representa el área de la figura
     */
    double calcularArea();
    
    /**
     * Calcula el perímetro de la figura geométrica.
     * 
     * @return double que representa el perímetro de la figura
     */
    double calcularPerimetro();
}