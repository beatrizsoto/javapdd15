#Abstract Factory
------------------------
Proporciona una interfaz para crear familias de objetos relacionados o que dependen entre si, sin especificar sus clases concretas.

####Tambien se le conoce como:
- Kit
------------------------
####Aplicacion:
Este patron debe aplicarse:
- Cuando un sistema debe ser independiente de como se crean, componen y representan sus productos

####Participantes:
- AbstractFactory: Interfaz para las operaciones de creacion de productos abstractos.
- ConcreteFactory: Implementa las operaciones para la creacion de objetos de productos concretos.
- AbstractProduct: Declara una interfaz para los objetos de un tipo de productos.
- Concretreproduct: Define un objeto de producto que creara la correspondiente Concrete Factory, a la vez que implementa la interfaz de AbstractProduct.
- Client: Sera el que utilice nuestras clases abstractas.

**[UML Abstract Factory][1]** :memo:
[1]:http://tinyurl.com/nw8fznz
