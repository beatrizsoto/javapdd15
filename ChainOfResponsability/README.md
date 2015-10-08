Integrada por Leslie Cazarez ,Esteban Angeles

** Chain Of Responsability **

Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

Frequency of use: Medium low

![UML](http://www.dofactory.com/images/diagrams/net/chain.gif)


Chain of Responsibility
Permite establecer una cadena de objetos receptores a través de los cuales se pasa una petición formulada por un objeto emisor. La idea es que cualquiera de los receptores pueden responder a la petición en función de un criterio establecido. Encadena los objetos receptores y pasa la petición a través de la cadena hasta que es procesada por algún objeto. 
Busca evitar un montón de if – else largos y complejos en nuestro código, pero sobre todas las cosas busca evitar que el cliente necesite conocer toda nuestra estructura jeráquica y que rol cumple cada integrante de nuestra estructura.
En múltiples ocasiones, un cliente necesita que se realice una función, pero o no conoce al servidor concreto de esa función o es conveniente que no lo conozca para evitar un gran acoplamiento entre ambos.

Se utiliza cuando:
Las peticiones emitidas por un objeto deben ser atendidas por distintos objetos receptores.
No se sabe a priori cual es el objeto que me puede resolver el problema.
Cuando un pedido debe ser manejado por varios objetos.
El conjunto de objetos que pueden tratar una petición debería ser especificado dinámicamente.
La motivación detrás de este patrón es crear un sistema que pueda servir a diversas solicitudes de manera jerárquica. En otras palabras, si un objeto que es parte de un sistema no sabe cómo responder a una solicitud, la pasa a lo largo del árbol de objetos. Como el nombre lo implica, cada objeto de dicho árbol puede tomar la responsabilidad y atender la solicitud.
Un ejemplo típico podría ser el lanzar un trabajo de impresión. El cliente no sabe siquiera qué impresoras están instaladas en el sistema, símplemente lanza el trabajo a la cadena de objetos que representan a las impresoras. Cada uno de ellos lo deja pasar, hasta que alguno, finalmente lo ejecuta.
Hay un desacoplamiento evidente entre el objeto que lanza el trabajo (el cliente) y el que lo realiza (impresora). 

Diagrama UML

![UML](https://lh6.googleusercontent.com/-3NnctckTzla7TA0IA8Be-AbBu0GJLNWMAyNV8DTowXkvpIxOtGh7vp2DXuYvgzVY0Xg1HE_e-R23dmur2jU0OADeQGrc48oI4xHxlCuJlFrfxvll1M)


Handler: define una interfaz para tratar las peticiones. Implementa el enlace al sucesor.
HandlerConcreto: trata las peticiones de las que es responsable. Si puede manejar la petición, lo hace, en caso contrario la reenvía a su sucesor.
Cliente: inicializa la petición. Conoce a un gestor que es el que lanza la petición a la cadena hasta que
alguien la recoge.

Video Ejemplo: 

[![Chain Of Responsibility](http://img.youtube.com/vi/B34hSdo1fPc/0.jpg)](http://www.youtube.com/watch?v=B34hSdo1fPc "Chain")

