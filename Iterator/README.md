Favor de explicar el Patron de este directorio a nuestros visitantes.

    Dentro de los patrones de comportamiento tenemos el patrón iterador ( Patrón ITERATOR ).

El patron iterator proporciona un acceso secuencial a una coleccion de objetos a los clientes sin que éstos tengan que preocuparse de la implementación de esta colección.

    Se tiene como objetivo:
“Proporcionar una forma de acceder a los elementos de un objeto agregado de forma secuencial sin exponer sus detalles”.

Casi todas las estructuras de datos que representan colecciones utilizan de algún modo este patrón para proporcionar acceso secuencial a los elementos que las conforman, y tanto Java como .NET ofrecen interfaces que nos invitan a implementar este patrón codificando su comportamiento.

    Forma de comportamiento del patón:

Recorre secuencialmente, esto es, hace uso de un proceso que sea capáz de situarse en el primer elemento de una colección y obtener la información de ese contenido. Tras esto, se trata de una operación secuencial, deberemos ser capaces de pasar del elemento actual al elemento al siguiente, obteniendo también su contenido. Por último, será necesario implementar algún mecanismo que nos informe si hemos alcanzado el final de la colección para detener el proceso de iteración.

El patrón Iterator debe proporcionar la siguiente funcionalidad:

  Obtener una referencia al elemento actual de la colección.
  Obtener una referencia al siguiente elemento de la colección (el situado a continuación del elemento actual).
  Obtener información sobre si existen más elementos después del actual.
  Reiniciar la colección para que el iterador apunte nuevamente al primer elemento de la colección.
