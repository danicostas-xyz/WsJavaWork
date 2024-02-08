Tu código parece estar bien estructurado y realiza la tarea de convertir temperaturas entre Celsius y Fahrenheit de manera clara. Aquí tienes algunas observaciones y sugerencias:

1. **Usar constantes para opciones:**
   - Puedes considerar definir constantes para las opciones de conversión (por ejemplo, `static final int CELSIUS_A_FAHRENHEIT = 1;` y `static final int FAHRENHEIT_A_CELSIUS = 2;`). Esto hará que el código sea más legible y evitará la necesidad de recordar los valores específicos.

2. **Evitar duplicación de código:**
   - Hay secciones de código duplicadas, especialmente después de leer la temperatura y antes de mostrar el resultado. Podrías considerar mover esta lógica duplicada a un método para reducir la repetición.

3. **Manejo de la entrada del usuario:**
   - Después de leer un número, se utiliza `sc.nextLine(); sc.nextLine();` para consumir los retornos de carro pendientes. Esto se debe a un comportamiento específico de `Scanner` y la forma en que maneja los saltos de línea. Puedes evitar esto leyendo y descartando la línea de entrada después de leer un número.

   ```java
   sc.nextLine(); // Leer y descartar el retorno de carro
   ```

4. **Comentarios y documentación:**
   - Agregar comentarios a tu código puede hacerlo más comprensible. Puedes agregar comentarios para explicar el propósito de las funciones y cualquier lógica compleja.

5. **Manejo de errores:**
   - Podrías considerar agregar manejo de errores para casos en los que el usuario ingrese datos no válidos (por ejemplo, letras en lugar de números).

6. **Nombre de métodos y variables:**
   - Los nombres de los métodos y las variables son descriptivos, lo cual es bueno. Solo ten en cuenta que las convenciones de nombres de Java sugieren que los nombres de métodos deben seguir el estilo camelCase, por lo que `celsiusAFahrenheit` podría llamarse `celsiusToFahrenheit`.

Aquí hay una versión modificada que incorpora algunas de estas sugerencias:

```java
import java.util.Scanner;

public class _02_ConversorTemperatura {

    public static final int CELSIUS_A_FAHRENHEIT = 1;
    public static final int FAHRENHEIT_A_CELSIUS = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de temperatura");
        System.out.println("------------------------");

        int repetirPrograma;

        do {
            System.out.println("¿Qué tipo de conversión quieres hacer?");
            System.out.println("Pulsa " + CELSIUS_A_FAHRENHEIT + " para convertir de Celsius a Fahrenheit");
            System.out.println("Pulsa " + FAHRENHEIT_A_CELSIUS + " para convertir de Fahrenheit a Celsius");

            int seleccionUsuario = sc.nextInt();

            while (seleccionUsuario > FAHRENHEIT_A_CELSIUS || seleccionUsuario < CELSIUS_A_FAHRENHEIT) {
                System.out.println("Por favor, introduce una opción correcta");
                System.out.println("Pulsa " + CELSIUS_A_FAHRENHEIT + " para convertir de Celsius a Fahrenheit");
                System.out.println("Pulsa " + FAHRENHEIT_A_CELSIUS + " para convertir de Fahrenheit a Celsius");
                seleccionUsuario = sc.nextInt();
            }

            double temperaturaIntroducida = obtenerTemperatura(sc, seleccionUsuario);
            double temperaturaConvertida = (seleccionUsuario == CELSIUS_A_FAHRENHEIT)
                    ? celsiusToFahrenheit(temperaturaIntroducida)
                    : fahrenheitToCelsius(temperaturaIntroducida);

            mostrarResultado(seleccionUsuario, temperaturaIntroducida, temperaturaConvertida);

            System.out.println("¿Quieres hacer otro cálculo?");
            System.out.println("Pulsa 1 para hacer un nuevo cálculo o 2 para finalizar el programa");
            repetirPrograma = sc.nextInt();

            while (repetirPrograma > 2 || repetirPrograma < 1) {
                System.out.println("Por favor, introduce una opción correcta");
                System.out.println("Pulsa 1 para realizar un nuevo cálculo");
                System.out.println("Pulsa 2 para finalizar el programa");
                repetirPrograma = sc.nextInt();
            }

        } while (repetirPrograma == 1);

        System.out.println("Programa finalizado.");
    }

    public static double obtenerTemperatura(Scanner sc, int tipoConversion) {
        String unidadEntrada = (tipoConversion == CELSIUS_A_FAHRENHEIT) ? "Celsius" : "Fahrenheit";
        System.out.print("Introduce la temperatura que quieras pasar de " + unidadEntrada + ": ");
        double temperaturaIntroducida = sc.nextDouble();
        sc.nextLine(); // Leer y descartar el retorno de carro
        return temperaturaIntroducida;
    }

    public static void mostrarResultado(int tipoConversion, double temperaturaIntroducida, double temperaturaConvertida) {
        String unidadEntrada = (tipoConversion == CELSIUS_A_FAHRENHEIT) ? "Celsius" : "Fahrenheit";
        String unidadSalida = (tipoConversion == CELSIUS_A_FAHRENHEIT) ? "Fahrenheit" : "Celsius";

        System.out.println("");
        System.out.println("Pulsa enter para hacer el cálculo");
        sc.nextLine();
        sc.nextLine();

        System.out.println(temperaturaIntroducida + "º" + unidadEntrada + " = " + temperaturaConvertida + "º" + unidadSalida);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
```

Estas sugerencias no son cambios críticos, pero pueden hacer que tu código sea más legible, modular y fácil de mantener. ¡Buen trabajo!