Strategy

El patrón estrategia permite mantener un conjunto de algoritmos de entre los cuales el objeto cliente puede elegir aquel que le conviene e intercambiarlo dinámicamente según sus necesidades.

--- Propósito.

*Define una familia de algoritmos, encapsula cada uno de ellos y los hace intercambiables. Permite que un algoritmo varié independientemente de los clientes que lo usan. 

*Encapsula algoritmos en clases, permitiendo que éstos sean re-utilizados e intercambiables. En base a un parámetro, que puede ser cualquier objeto, permite a una aplicación decidir en tiempo de ejecución el algoritmo que debe ejecutar.


La esencia de este patrón es encapsular algoritmos relacionados que son subclases de una superclase común, lo que permite la selección de un algoritmo que varia según el objeto y también le permite la variación en el tiempo. Esto se define en tiempo de ejecución.

---Aplicabilidad.

Este patrón debe utilizarse cuando:

***Un programa tiene que proporcionar múltiples variantes de un algoritmo o comportamiento.
    
***Es posible encapsular las variantes de comportamiento en clases separadas que proporcionan un modo consistente de        acceder a los comportamientos.
    
***Permite cambiar o agregar algoritmos, independientemente de la clase que lo utiliza.

 Participantes

    Estrategia (Componedor)
        Declara la interfaz común a todos los algoritmos permitidos.
        El *contexto* usa esa interfaz para llamar al algoritmo definido por una estrategia
    Estrategia Concreta
        Implementa el algoritmo concreto
    Contexto
        Instancia un objeto Estrategia Concreta
        Mantiene una referencia la un objeto estrategia (concreta)
        Puede definir una interfaz que permita a la Estrategia (concreta) acceder a sus datos.
