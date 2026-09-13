# Curso Java Backend - Talento Tech

Curso de Java Backend dictado por **Talento Tech**, Agencia de Habilidades para el Futuro.

## Objetivo

Aprender los fundamentos de programación en Java desde cero, cubriendo conceptos básicos hasta temas intermedios del lenguaje.

## Tecnologías

- Java 21
- Maven

## Contenido del curso

### Clase 01 - Introducción
- Hola Mundo en Java
- Estructura básica de un programa Java
- Método main

### Clase 02 - Convenciones de nombres
- Convenciones de nomenclatura en Java
- Naming conventions para variables, métodos y clases

## Estructura del proyecto

```
src/
├── clase_01/    # Introducción - Hola Mundo
├── clase_02/    # Convenciones de nombres en Java
├── main/
└── test/
```

## Requisitos previos

- Conocimientos básicos de programación (variables, bucles, funciones)
- Instalar Java 21 y Maven en el sistema

## Ejecución

```bash
mvn compile exec:java -Dexec.mainClass="clase_01.Main"
mvn compile exec:java -Dexec.mainClass="clase_02.Main"
```

## Gestión de memoria en Java: Stack y Heap

Java gestiona la memoria de dos formas principales:

### Stack (Pila)
- Almacena **variables primitivas** (`int`, `float`, `boolean`, etc.)
- Almacena **referencias** a objetos (no el objeto en sí)
- Es **rápido** pero tiene tamaño limitado
- Se libera automáticamente cuando sale del ámbito

```java
int numero = 10;        // Se almacena en el Stack
String nombre = "Hola"; // La referencia está en el Stack, el objeto "Hola" en el Heap
```

### Heap (Montón)
- Almacena **objetos** (instancias de clases)
- Se gestiona con el **Garbage Collector**
- Es más grande pero más lento
- Los objetos persisten hasta que no se referencian

```java
String texto = new String("Java"); // El objeto String está en el Heap
int[] arreglo = new int[5];        // El array está en el Heap
```

### Ejemplo visual

```
Stack                          Heap
┌─────────────────┐           ┌─────────────────────┐
│ numero = 10     │           │ String "Hola"       │
│ nombre ─────────┼──────────>│ String "Java"       │
│ texto ──────────┼──────────>│ int[5] = {0,0,0,0,0}│
└─────────────────┘           └─────────────────────┘
```

### Diferencias clave

| Característica       | Stack               | Heap                |
|---------------------|---------------------|---------------------|
| Velocidad           | Rápido              | Más lento           |
| Tamaño              | Limitado            | Grande              |
| Almacena            | Primitivos y refs   | Objetos             |
| Liberación          | Automática          | Garbage Collector   |

## Autor

Curso de Java Backend - Talento Tech
