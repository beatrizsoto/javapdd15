
Patrón Prototype.

El patrón prototype tiene un objetivo muy sencillo: crear a partir de un modelo. Permite crear
objetos prediseñados si conocer detalles de cómo crearlos. Esto lo logra especificando los
prototipos de objetos a crear. Los nuevos objetos que se crearán de los prototipos, en
realidad, son clonados. Es decir, tiene como finalidad crear nuevos objetos duplicándolos,
clonando una instancia creada previamente.

Este patrón puede ser aplicado en un escenario donde sea necesaria la creación de objetos
parametrizados como "recién salidos de fábrica" ya listos para utilizarse, con la gran ventaja
de la mejora de la perfomance: clonar objetos es mas rápido que crearlos y luego setear cada
valor en particular. Este patrón debe ser utilizando cuando un sistema posee objetos con datos
repetitivos, en cuanto a sus atributos: por ejemplo, si una biblioteca posee una gran cantidad
de libros de una misma editorial, mismo idioma, etc. Hay que pensar que en este patrón como si
fuese una fábrica que tiene ciertas plantillas de ejemplos de sus productos y, a partir de
estos prottipos, puedecrear una gran cantidad de productos con esas características.

Una de los puntos del patron es que un programa puede dinámicamente añadir y borrar objetos
prototipo en timepo de ejecución. Esta es una ventaja que no ofrece ninguno de los otros
patrones de creación, esto mismo esconde los nombres de los productos específicos al cliente.
En el patrón se pueden especificar nuevos objetos prototipo variando los existentes y el hecho
de que clonar un objeto es más rapido que crearlo.


