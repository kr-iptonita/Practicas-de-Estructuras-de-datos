
# Sistema de Figuras Geométricas

Sistema Java para calcular áreas y perímetros de figuras geométricas, implementando herencia, polimorfismo y interfaces.

## Requisitos

- **OpenJDK 21** o superior
- Sistema operativo: Windows, Linux o macOS

## Estructura del Proyecto

```
figuras-geometricas/
├── src/
│   ├── Figuras/
│   │   ├── Circulo.java
│   │   ├── Cuadrado.java
│   │   ├── Figura.java
│   │   ├── Pentagono.java
│   │   ├── PoligonoRegular.java
│   │   └── TrianguloEquilatero.java
│   └── MainFiguras.java
└── README.md
```

## Compilación y Ejecución

### Compilar todo el proyecto:
```bash
javac -d bin src/Figuras/*.java src/MainFiguras.java
```

### Ejecutar el programa:
```bash
java -cp bin MainFiguras
```

### Compilar y ejecutar en un solo paso:
```bash
javac -d bin src/Figuras/*.java src/MainFiguras.java && java -cp bin MainFiguras
```

## Salida

El programa mostrará el área y perímetro de:
- Triángulo equilátero con lado 10.0
- Cuadrado con lado 10.0
- Pentágono regular con lado 10.0
- Círculo con radio 10.0


## 🧪 Pruebas

Para verificar que todo funciona correctamente:

```bash
# Compilar
javac -d bin src/Figuras/*.java src/MainFiguras.java

# Ejecutar
java -cp bin MainFiguras

# Esperar ver output con áreas y perímetros de todas las figuras
```