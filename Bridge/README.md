## El patrón *Bridge*

![alt text](https://danielggarcia.files.wordpress.com/2014/03/031614_2328_patronesest1.png?w=620 "Logo Title Text 1")
**Objetivo:**

* “Desacoplar una abstracción de su implementación de modo que los dos puedan ser modificados de forma independiente.”

El patrón **Bridge** o **Puente** es normalmente uno de los patrones que más cuesta entender, especialmente si nos ceñimos únicamente a su descripción. La idea tras este patrón, sin embargo, es sencilla: dado que cualquier cambio que se realice sobre una abstracción afectará a todas las clases que la implementan, Bridge propone añadir un nuevo nivel de abstracción entre ambos elementos que permitan que puedan desarrollarse cada uno por su lado.

Si le echamos un ojo al diagrama, es posible que de base no nos aclare demasiado. Nos centraremos en el elemento central: una clase abstracta *Abstracción* que contiene una referencia a una interfaz *Implementor* y un método *operacion()* que no hace más que invocar el método *operacionOriginal()* de dicha interfaz. Lo que hace esta clase *Abstracción* es, por tanto, encapsular a la interfaz *Implementor* exponiendo sus métodos.

[Visit GitHub!](https://www.github.com).
