------------------------------------------------El patrón Singleton----------------------------------------------------

DIagrama UML: https://drive.google.com/file/d/0B1UGjQsv1xltZzVjZGc0U0g0czg/view?usp=sharing


****Definicion:Permite asegurar que de una clase concreta existe una unica instacia y propociona un unico metodo que lo devuelve.
 
El patrón Singleton garantiza que una clase sólo tenga una instancia y proporciona un punto de acceso global a ésta instancia.

****Intención

Garantiza que una clase sólo tenga una instancia y proporciona un punto de acceso global a ella.

****Problema

Varios clientes distintos precisan referenciar a un mismo elemento y queremos asegurarnos de que no hay más de una instancia de ese elemento.

*****Solución

Garantizar una única instancia.


-----------------------------------------------Participantes------------------------------------------------------

    Singleton

        Define una operación Instancia que permite que los clientes accedan a su única instancia. Instancia es una operación de clase (static en C# y shared en VB .NET).

        Puede ser responsable de crear su única instancia.

Aplicabilidad

Usar cuando:

    Deba haber exactamente una instancia de una clase y ésta deba ser accesible a los clientes desde un punto de acceso conocido.

    La única instancia debería ser extensible mediante herencia y los clientes deberían ser capaces de utilizar una instancia extendida sin modificar su código.

Consecuencias

    Acceso controlado a la única instancia. Puede tener un control estricto sobre cómo y cuando acceden los clientes a la instancia.

    Espacio de nombres reducido. El patrón Singleton es una mejora sobre las variables globales.

    Permite el refinamiento de operaciones y la representación. Se puede crear una subclase de Singleton.

    Permite un número variable de instancias. El patrón hace que sea fácil cambiar de opinión y permitir más de una instancia de la clase Singleton.

  
