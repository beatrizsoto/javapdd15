# Patron de Comportamiento: Strategy

El patrón estrategia permite mantener un conjunto de algoritmos de entre los cuales el objeto cliente puede elegir aquel que le conviene e intercambiarlo dinámicamente según sus necesidades.

El patrón  **Strategy**  tiene como objetivo adaptar el comportamiento y los algoritmos de un objeto en función de una necesidad sin cambiar las interacciones de este objeto con los clientes. 

Esta necesidad puede ponerse de relieve en base a aspectos tales como la presentación, la eficacia en tiempo de ejecución o  en  memoria,  la  elección  de  algoritmos,  la  representación  interna,  etc.  Aunque  evidentemente  no se trata de una  necesidad  funcional  de  cara  a  los  clientes  del  objeto  pues  las  interacciones  entre  el  objeto  y  sus clientes deben permanecer inmutables.


## Aplicabilidad
Usar este patrón cuando:

    ⋅⋅*Muchas clases relacionadas difieren sólo en su comportamiento.

    ⋅⋅*Se necesitan distintas variantes del mismo algoritmo.

    ⋅⋅*Una clase define muchos comportamientos.


![](https://raw.githubusercontent.com/tectijuana/javapdd/master/Strategy/Strategy-UML.png?raw=true "Strategy UML")

## Participantes en el diagrama UML.

	..*DibujaUnVehículoPorLínea y DibujaTresVehículosPorLínea que implementan
	la interfaz DibujaCatálogo. La nota que detalla el método dibuja de la clase
	VistaCatálogo muestra cómo se utilizan ambos métodos.

    	..*Estrategia (DibujaCatálogo) es la interfaz común a todos los algoritmos.
	Esta interfaz se utiliza en Entidad para invocar al algoritmo.

   	 ..*EstrategiaConcretaA y EstrategiaConcretaB (DibujaUnVehículoPorLínea y
	DibujaTresVehículosPorLínea) son las subclases concretas que implementan
	los distintos algoritmos.

   	 ..*Entidad (VistaCatalogo) es la clase que utiliza uno de los algoritmos de las clases que
	implementan la Estrategia. Por consiguiente, posee una referencia hacia
	una de estas clases. Por último, si fuera necesario, puede exponer sus
	datos internos a las clases de implementación.
