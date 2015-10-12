#ABSTRACT

*Un patrón abstracto es una forma o modelo o simulación o paradigma (o, en general, un conjunto de reglas) que pueden ser usadas para crear o generar entidades o partes de una entidad, especialmente si las entidades generadas tienen lo suficiente en común como para que sea posible inferir o discernir el patrón, en cuyo caso se dice que exhiben el patrón. La detección de los patrones subyacentes se denomina reconocimiento de patrones.*

Nos encontramos frente a un problema en el que debemos crear diferentes objetos, todos pertenecientes a la misma familia, como puede ser el sistema de librerías necesarias para crear interfaces gráficas. Visto esto podríamos decir que lo que intenta solucionar el patrón de diseño software de creación Abstract Factory es crear diferentes familias de objetos.	El patrón Abstract Factory, por tanto, se recomienda cuando se atisba la inclusión de nuevas familias de productos en un futuro, pero resultaría contraproducente si que necesita añadir nuevos productos o modificar los existentes, ya que tendría repercusión en todas las familias creadas.

Según esto, podemos decir que los componentes típicos del patrón Abstract Factory es la siguiente:

-Cliente: Entidad que llamará a la fábrica adecuada que necesite para crear uno de los objetos que provee dicha factoría, es decir, intentará obtener una instancia de alguno de los productos que entren en juego (ProductoA, ProductoB).

-AbstractFactory: Definición de la interfaz que usarán las diferentes factorías. Como mínimo, debe ofrecer un método para la obtención de cada objeto que se pueda crear. ("crearProductoA()" y "crearProductoB()")

-Concrete Factories: Aquí se representarán las diferentes familias de productos. Provee la instancia concreta del objeto que se encarga de crear.

-Abstract Product: Definirá las interfaces para la familia de productos genéricos. En el diagrama son "ProductoA" y "ProductoB". El cliente trabajará directamente sobre esta interfaz, que será implementada por los diferentes productos concretos.

-Concrete Product: Se encargará de la implementación específica de los diferentes productos.

Este sería el diagrama de clases general del patrón de creación Abstract Factory:

![](https://drive.google.com/file/d/0B_C94Hl6_nLQVlNsMjB4czFoMlU/view?usp=sharing)


