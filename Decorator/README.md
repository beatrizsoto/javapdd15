Patron Decorator

URL del UML: http://tinyurl.com/umldecorator
URL del UML Espanol: http://tinyurl.com/UMLDecorator2

El patron proporcionan una alternativa flexible a la herencia para extender funcionalidad.

*Un decorador hereda de la misma clase que los objetos que tendrá que decorar.
*Es posible utilizar más de un decorador para encapsular un mismo objeto.
*El objeto decorador añade su propia funcionalidad, bien antes, bien después, de delegar el resto del trabajo en el   objeto que está decorando.
*Los objetos pueden decorarse en cualquier momento, por lo que es posible decorar objetos de forma dinámica en tiempo   de ejecución.

La gran ventaja es que nos permite extender objetos incluso en situaciones cuando la extensión vía herencia no es viable o no es necesaria. Adicionalmente nos ayuda a conservar el principio de Abierto/Cerrado, en donde se dicta que cada entidad debe estar abierta a extensión pero cerrada a modificación.

Otra ventaja es que las decoraciones nos evitan la labor de crear clases complejas con mucho código, que en la mayoría de los casos no será evaluado. Nosotros podemos usar distintas combinaciones (o secuencias) de decoraciones para generar distintos comportamientos o resultados.

