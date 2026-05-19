# CRUD con Herencia, ArrayList y Validaciones en Java
## Descripción del proyecto
Este proyecto consiste en una aplicación de consola desarrollada en Java utilizando Programación Orientada a Objetos (POO). El sistema permite registrar, visualizar, actualizar y eliminar estudiantes y docentes mediante operaciones CRUD usando `ArrayList`.

El objetivo principal es aplicar conceptos fundamentales como:

- Herencia
- Encapsulamiento
- Sobrescritura de métodos
- CRUD
- Manejo de excepciones con `try-catch`
- Uso de `ArrayList`
---

# Tecnologías utilizadas
- Java
- NetBeans / IntelliJ / Eclipse
- Programación Orientada a Objetos (POO)

---

# Estructura del proyecto

```text
src/
│
├── Persona.java
├── Estudiante.java
├── Docente.java
└── Main.java
```

---

# Explicación de conceptos aplicados

## Herencia

La herencia permite reutilizar atributos y métodos de una clase padre en otras clases hijas.

En este proyecto:

- `Persona` es la clase padre.
- `Estudiante` y `Docente` son clases hijas.

La clase `Persona` contiene atributos comunes:

- cedula
- nombre
- edad

Las subclases agregan atributos específicos:

### Estudiante
- carrera

### Docente
- asignatura

Gracias a la herencia se evita repetir código y se mejora la organización del sistema.

Ejemplo:

```java
public class Estudiante extends Persona
```

---

# Encapsulamiento

Se utilizaron atributos `private` y `protected` para proteger la información de las clases y controlar el acceso a los datos mediante métodos.

Ejemplo:

```java
protected String cedula;
private String carrera;
```

---

# ArrayList

Se utilizó `ArrayList` para almacenar dinámicamente los registros del sistema.

```java
ArrayList<Persona> personas = new ArrayList<>();
```

El `ArrayList` permite:

- agregar registros
- recorrer registros
- actualizar registros
- eliminar registros

A diferencia de los arreglos tradicionales, el tamaño del `ArrayList` puede cambiar dinámicamente durante la ejecución del programa.

---

# CRUD

El sistema implementa las cuatro operaciones básicas CRUD:

| Operación | Función |
|---|---|
| CREATE | Registrar estudiantes y docentes |
| READ | Mostrar registros almacenados |
| UPDATE | Actualizar información existente |
| DELETE | Eliminar registros |

---

## CREATE

Permite registrar nuevos estudiantes o docentes.

Método utilizado:

```java
add()
```

---

## READ

Permite visualizar todos los registros almacenados.

Métodos utilizados:

```java
get()
for
```

---

## UPDATE

Permite modificar información de un registro existente.

Método utilizado:

```java
set()
```

---

## DELETE

Permite eliminar registros del sistema.

Método utilizado:

```java
remove()
```

---

# Sobrescritura de métodos (@Override)

Las clases hijas sobrescriben el método `mostrarDatos()` heredado de `Persona`.

Esto permite mostrar información específica dependiendo del tipo de objeto.

Ejemplo:

```java
@Override
public String mostrarDatos()
```

---

# Try-Catch y validaciones

Se utilizó `try-catch` para controlar errores producidos por entradas incorrectas del usuario.

Ejemplo:

```java
try {
    opcion = sc.nextInt();
} catch (Exception e) {
    System.out.println("Error: debe ingresar solo numeros.");
}
```

Esto evita que el programa se cierre abruptamente cuando el usuario ingresa letras o valores inválidos.

También se implementaron validaciones para:

- campos vacíos
- posiciones inexistentes
- opciones inválidas
- cédulas repetidas

---

# Funcionalidades del sistema

El sistema permite:

- Registrar estudiantes
- Registrar docentes
- Mostrar registros
- Actualizar información
- Eliminar registros
- Validar entradas incorrectas
- Evitar cédulas duplicadas

---

# UML del sistema

<img width="481" height="384" alt="Diagrama sin título drawio (1)" src="https://github.com/user-attachments/assets/2cc2e8a4-16ba-4c81-af6c-4cd66a171d71" />


---

# Buenas prácticas aplicadas

- Uso de Programación Orientada a Objetos
- Separación de clases
- Uso de métodos independientes
- Validaciones de datos
- Manejo de excepciones
- Código modular y legible
- Uso de comentarios en secciones importantes

---

# Conclusión
Este proyecto permitió aplicar conceptos fundamentales de Programación Orientada a Objetos en Java mediante un sistema CRUD funcional utilizando herencia, ArrayList y manejo de excepciones. Además, se fortaleció el uso de menús interactivos, validaciones y buenas prácticas de programación.
