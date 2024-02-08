El uso de la función `contadorPares` con una salida por consola y la devolución de un valor (que se utiliza en el `main` en la variable `contador`) es aceptable, pero es importante entender las implicaciones y considerar si es necesario según el contexto de tu programa.

Aquí hay algunas consideraciones:

1. **Separación de responsabilidades:**
   - La función `contadorPares` actualmente realiza dos tareas: cuenta los números pares y muestra esos números por consola. En general, es una buena práctica tener funciones que realicen una tarea específica y no más. Podrías considerar dividir estas responsabilidades en dos funciones separadas: una para contar y otra para mostrar.

2. **Reusabilidad:**
   - Si en el futuro necesitas contar los números pares pero sin imprimirlos por consola, tendrías que modificar la función `contadorPares` o crear una nueva función. Si la función se encargara únicamente de contar, sería más flexible y reutilizable.

3. **Consola vs. Interfaz de usuario:**
   - Si estás desarrollando una aplicación más compleja, podrías querer separar la lógica de negocios (contar números pares) de la interfaz de usuario (mostrar resultados por consola). Puedes tener una función dedicada para interactuar con el usuario y otra para realizar la lógica de negocio.

Aquí hay un ejemplo de cómo podrías modificar tu código para separar estas responsabilidades:

```java
public class _01_ContadorNumerosPares {

    public static void main(String[] args) {
        // ... (código anterior)

        // Contar los números pares
        int contador = contadorPares(numero1, numero2);

        // Mostrar los resultados
        mostrarResultados(numero1, numero2, contador);
    }

    public static int contadorPares(int numero1, int numero2) {
        int contador = 0;

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    public static void mostrarResultados(int numero1, int numero2, int contador) {
        System.out.println("Los números pares entre " + numero1 + " y " + numero2 + " son: ");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println("- " + i);
            }
        }

        System.out.println("\nHay " + contador + " números pares entre " + numero1 + " y " + numero2);
    }
}
```

Este enfoque hace que tu código sea más modular y permite una mayor flexibilidad en el futuro.