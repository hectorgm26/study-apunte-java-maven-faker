# Generador de Datos Aleatorios con Java Faker

Este repositorio es un apunte personal sobre el uso de la librería `Java Faker` para generar datos aleatorios en Java. Aquí se encuentra una implementación simple que crea instancias de `Persona` con datos aleatorios como nombre, apellido, edad, peso, género, y email, lo cual puede ser útil para pruebas y simulaciones.

### Contenido

- **Clase `Persona`**: Crea objetos `Persona` con datos aleatorios generados por `Java Faker`.
- **Clase `Main`**: Ejecuta un ejemplo en el que se crea e imprime una `Persona` aleatoria.

### Ejemplo de Ejecución

En `Main.java`, el programa crea una instancia de `Persona` y muestra sus datos en consola:

```java
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.printf("La persona aleatoria es %s%n", persona);
    }
}
Ejemplo de salida:

yaml
Copiar código
La persona aleatoria es {
    nombre: John,
    apellido: Doe,
    edad: 24,
    peso: 72.50,
    hombre: true,
    email: john.doe@example.com
}
```

## Dependencia
Este proyecto utiliza la dependencia Java Faker, que puedes agregar al archivo pom.xml de Maven para habilitar la generación de datos aleatorios.

```xml
<!-- Dependencia para la generación de datos aleatorios con Java Faker -->
<dependency>
    <groupId>com.github.javafaker</groupId>
    <artifactId>javafaker</artifactId>
    <version>1.0.2</version>
</dependency>
```

### Uso de la Librería Java Faker
La librería Java Faker permite crear una variedad de datos ficticios para pruebas de desarrollo. Algunas de las opciones disponibles son:

- Nombre y Apellido:
faker.name().firstName() - Genera un nombre aleatorio.
faker.name().lastName() - Genera un apellido aleatorio.

- Dirección:
faker.address().fullAddress() - Genera una dirección completa.
faker.address().city() - Genera una ciudad aleatoria.
faker.address().state() - Genera un estado aleatorio.

- Información de Contacto:
faker.internet().emailAddress() - Genera un email.
faker.phoneNumber().phoneNumber() - Genera un número de teléfono.

-Datos Numéricos:
faker.number().numberBetween(min, max) - Genera un número entero en el rango especificado.
faker.number().randomDouble(decimales, min, max) - Genera un número decimal.
faker.bool().bool() - Genera un valor booleano.

### Notas
Este repositorio es una referencia para el uso de Java Faker en proyectos de Java. Se proporciona como una guía rápida para generar datos de prueba y practicar el uso de esta librería. Si te resulta útil, siéntete libre de explorarlo y utilizarlo.
---
¡Espero que te sea de ayuda!
