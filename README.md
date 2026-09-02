# Laboratorio Constraint Layout

## Descripción

Laboratorio desarrollado en Android Studio utilizando Java y
ConstraintLayout.

El objetivo del laboratorio es aplicar el uso de restricciones
para la construcción de interfaces de usuario complejas.

## Tecnologías utilizadas

- Android Studio
- Java
- XML
- ConstraintLayout
- Android SDK
- Gradle

## Objetivos

- Comprender el funcionamiento de ConstraintLayout.
- Aplicar restricciones horizontales y verticales.
- Utilizar márgenes y relaciones entre componentes.
- Construir interfaces utilizando constraints.
- Implementar formularios mediante ConstraintLayout.

## Ejercicios

### Ejercicio 1

Se implementó un botón utilizando restricciones de posición,
incluyendo margen superior y margen lateral.

![Ejercicio 1](images/activity_exercise1.png)

### Ejercicio 2

Se implementaron las restricciones correspondientes al ejercicio
planteado en la presentación.

![Ejercicio 2](images/activity_exercise2.png)

### Ejercicio 3

Se implementó un botón utilizando `0dp` en ancho y alto,
permitiendo que ConstraintLayout utilice todo el espacio
disponible mediante sus restricciones.

![Ejercicio 3](images/activity_exercise3.png)

### Ejercicio 4

Se implementaron dos botones utilizando restricciones horizontales,
distribuidos en el espacio disponible de la pantalla.

![Ejercicio 4](images/activity_exercise4.png)

## Formulario de correo electrónico

Se desarrolló un formulario utilizando ConstraintLayout para
permitir el ingreso de:

- Destinatario (To)
- Asunto (Subject)
- Mensaje (Message)
- Botón Send

![Formulario de correo](images/activity_email.png)

## Entrega de actividad formativa

Se desarrolló un formulario para registrar los datos
correspondientes a la entrega de una actividad formativa,
utilizando ConstraintLayout.

![Entrega de actividad](images/activity_entrega.png)

## Estructura del proyecto

```text
app/
├── src/
│   └── main/
│       ├── java/
│       │   └── co.edu.unipiloto.laboratorioconstraintlayout/
│       │       ├── MainActivity.java
│       │       ├── Exercise1Activity.java
│       │       ├── Exercise2Activity.java
│       │       ├── Exercise3Activity.java
│       │       ├── Exercise4Activity.java
│       │       ├── EmailActivity.java
│       │       └── EntregaActivity.java
│       │
│       └── res/
│           └── layout/
│               ├── activity_main.xml
│               ├── activity_exercise1.xml
│               ├── activity_exercise2.xml
│               ├── activity_exercise3.xml
│               ├── activity_exercise4.xml
│               ├── activity_email.xml
│               └── activity_entrega.xml
│
└── README.md

## Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en Android Studio.
3. Esperar a que Gradle sincronice el proyecto.
4. Ejecutar la aplicación en un emulador o dispositivo Android.
5. Desde el menú principal se puede acceder a cada ejercicio.

## Autor

**Christian López**
Universidad Piloto de Colombia
Ingeniería de Sistemas
