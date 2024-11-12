package principal.modelos;

import com.github.javafaker.Faker;

public class Persona {

    private final String nombre;
    private final String apellido;
    private final int edad;
    private final double peso;
    private final boolean hombre;
    private final String email;

    public Persona() {
        final Faker faker = new Faker();

        this.nombre = faker.name().firstName();
        this.apellido = faker.name().lastName();
        this.edad = faker.number().numberBetween(18, 27);
        this.peso = faker.number().randomDouble(2, 50, 100);
        this.hombre = faker.bool().bool();
        this.email = faker.internet().emailAddress();

    }

    @Override
    public String toString() {
        final String multilinea = """
                                
                {
                nombre:  %s,
                apellido:  %s,
                edad:  %d,
                peso:  %.2f,
                hombre:  %b,
                email:  %s 
                } 
                """;
        return String.format(multilinea, nombre, apellido, edad, peso, hombre, email);
    }
}




/*
LA LIBRERIA FAKER PERMITE CREAR DATA ALEATORIA DE INT, DOUBLE, STRING DE DIFERENTES TIPOS

METODOS DE LA CLASE FAKER

1 NOMRRE Y APELLIDO = faker.name().fullName();
2 NOMBRE = faker.name().firstName();
3 APELLIDO = faker.name().lastName();
4 DIRECCION = faker.address().fullAddress();
5 CIUDAD = faker.address().city();
6 ESTADO = faker.address().state();
7 CODIGO POSTAL = faker.address().zipCode();
8 TELEFONO = faker.phoneNumber().phoneNumber();
9 EMAIL = faker.internet().emailAddress();
10 CONTRASEÑA = faker.internet().password();
11 COLOR = faker.color().name();
12 NOMBRE DE EMPRESA = faker.company().name();
13 CARGO = faker.company().profession();
14 TITULO = faker.book().title();
15 AUTOR = faker.book().author();
16 GENERO = faker.book().genre();
17 ISBN = faker.book().isbn10();
18 USUARIO = faker.internet().userName();

STRING = faker.backToTheFuture().quote(); // Devuelve una cita de la pelicula Volver al Futuro
STRING = faker.chuckNorris().fact(); // Devuelve un hecho de Chuck Norris
STRING = faker.harryPotter().quote(); // Devuelve una cita de Harry Potter
STRING = faker.superhero().name(); // Devuelve el nombre de un superheroe
INT = faker.number().numberBetween(min, max);
DOUBLE = faker.number().randomDouble(numDecimales, min, max);
BOOLEAN = faker.bool().bool();



 */
