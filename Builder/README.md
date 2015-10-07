# PATRON BUILDER 

El patron builder es usado para permitir la creación de una variedad de objetos complejos desde un objeto fuente (Producto), el objeto fuente se compone de una variedad de partes que contribuyen individualmente a la creación de cada objeto complejo a través de un conjunto de llamadas a interfaces comunes de la clase Abstract Builder.

UML de builder: 
![uml](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Builder_UML_class_diagram.svg/1400px-Builder_UML_class_diagram.svg.png "Logo Title Text 1")

#### Ventajas:
+ Reduce el acoplamiento.
+ Permite variar la representación interna de estructuras compleja, respetando la interfaz común de la clase Builder.
+ Se independiza el código de construcción de la representación. Las clases concretas que tratan las representaciones internas no forman parte de la interfaz del Builder.
+ Cada ConcreteBuilder tiene el código específico para crear y modificar una estructura interna concreta.
+ Distintos Director con distintas utilidades (visores, parsers, etc) pueden utilizar el mismo ConcreteBuilder.
+ Permite un mayor control en el proceso de creación del objeto. El Director controla la creación paso a paso, solo cuando el Builder ha terminado de construir el objeto lo recupera el Director.


###Video:
[![Bridge Design Pattern](http://img.youtube.com/vi/pHr01mluNVU/0.jpg)](https://www.youtube.com/watch?v=pHr01mluNVU)
##atte: fr3edy
