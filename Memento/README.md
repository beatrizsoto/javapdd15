Memento - Patron de comportamiento

# Memento

Frecuentemente los desarrolladores necesitan guardar el estado de un objeto para recuperarlo más tarde. Esto claro, sin perder el encapsulamiento del objeto. 
Una de las maneras de hacerlo, es utilizando el patrón de diseño Memento. 

## Propósito

-El objetivo principal de Memento es guardar el estado de un objeto sin romper el encapsulamiento del mismo. 

## Donde usar:

-Se usa este patron cuando se quiere poder restaurar el sistema desde estados pasados.
-Es usado cuando se desea facilitar el hacer y deshacer de determinadas operaciones.

## Clases:

-Originator (ConstraintSolver)
Crea el Memento y lo utilza para recuperar su estado
Esta es la clase del objeto en cuestion, es decir, del objeto a guardar/restaurar.
Tiene dos metodos (uno para crear un objeto Memento a partir de su estado actual y otro para restablecer su estado actual a partir de un objeto Memento.

## -Memento (SolverState)

Clase interna estatica de Originator que contiene su estado. El Originator determina que datos almacenar en el Memento y solo el Originator debe ser capaz de leer el Memento.

## -Caretaker (Undo mechanism)

Es la clase que maneja los Mementos
Nunca necesita saber que hay en Memento, solo necesita saber que el objeto que recibe permite restaurar el estado del Originator.

![Patron de diseño Memento](https://drive.google.com/file/d/0B83_9SGe2_UJcGlidjdnZ1loTlk/view "UML Memento" )

[![Patron de diseño Memento](http://img.youtube.com/vi/YeisVHBt7l0/0.jpg)](http://www.youtube.com/watch?v=YeisVHBt7l0)


