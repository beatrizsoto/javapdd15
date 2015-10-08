

El Patrón de diseño Flyweight comparte estados para soportar un gran numero de objetos pequeños aumentando la eficiencia en espacio de memoria a costo de tiempo y recursos de procesamiento.

Estructura del Patron

IFlyweight: declara una interfaz a través de la cual los flyweights pueden recibir y actuar sobre los estados no compartidos.

ConcreteFlyweight:  declara una interfaz a través de la cual los flyweights pueden recibir y actuar sobre los estados no compartidos.

UnshareConcreteFlyweight: no todas las subclases de Flyweight tienen por qué ser compartidas. La interfaz Flyweight permite que se comparta; no lo fuerza. Es común que los objetos de esta clase tengan hijos de la clase ConcreteFlyweight en algún nivel de su estructura.

FactoryFlyweight: crea y gestiona los objetos flyweight. Garantiza que los objetos flyweight se comparten de forma apropiada. Cuando un cliente solicita un flyweight, el objeto de la clase FlyweightFactory proporciona una instancia existente, o crea una.

Client: crea y gestiona los objetos flyweight. Garantiza que los objetos flyweight se comparten de forma apropiada. Cuando un cliente solicita un flyweight, el objeto de la clase FlyweightFactory proporciona una instancia existente, o crea una.



