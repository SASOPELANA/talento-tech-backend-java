package clase_02;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n ----- CLASE 02 ----- \n");

        System.out.println("Hola desde clase_02!!!!\n");

        // En Java las Clases siempre empiezan con mayúscula y los métodos con minúscula.

        System.out.println("Tipos de datos en Java: ");

        int num = 10; // --> Entero

        System.out.println(num);

        // num = "10"; // --> Error de compilación: incompatible types: String cannot be converted to int

        num = 20; // --> Reasignación de valor

        System.out.println(num);

        // Declaración de multiples variables del mismo tipo.
        int x = 5, y = 2, z = 3;

        System.out.println("\nx: " + x + ", y: " + y + ", z: " + z);

        // Constantes: con la palabra clave final (su valor no puede cambiar una vez asignado)

        final double PI = 3.14159;

        System.out.println("\nValor de PI: " + PI);

        // Inferencia de tipos: Java puede inferir el tipo de una variable
        // a partir del valor que se le asigna.

        var name = "Juan"; // --> lo toma como String

        System.out.println("\nNombre: " + name);

        System.out.println("\n Tipos primitivos: ");

        // Tipos primitivos: int, double, boolean, char, byte, short, long, float

        // Son ocho y almacenan el valor directamente en el stack.
        // Enteros: byte, short, int, long
        // Decimales: float, double
        // char: almacena un solo carácter
        // boolean: almacena true o false

    }

}