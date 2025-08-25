/**
 * Clase principal que demuestra el uso del sistema de figuras geométricas.
 * Crea instancias de diferentes figuras y muestra sus áreas y perímetros.
 * 
 * @author Karla Romina Juárez Torres
 */
public class MainFiguras {
    /**
     * Método principal que ejecuta la demostración del sistema.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String args[]) {
        // Crear las Figuras con medidas de 10 unidades
        Figura triangulo = new TrianguloEquilatero(10.0);
        Figura cuadrado = new Cuadrado(10.0);
        Figura pentagono = new Pentagono(10.0);
        Figura circulo = new Circulo(10.0);

        System.out.println(triangulo);
        System.out.println("_____________________________________________________________\n");

        System.out.println(cuadrado);
        System.out.println("_____________________________________________________________\n");

        System.out.println(pentagono);
        System.out.println("_____________________________________________________________\n");

        System.out.println(circulo);
    }
}