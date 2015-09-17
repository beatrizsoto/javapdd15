
##Patrón Observer 
------------------------

Define una dependencia entre objetos de uno a muchos de modo que cuando un **objeto cambia** su estado todos sus **dependientes son notificados** y actualizados automáticamente.

Debe ser utilizado cuando:
- Un objeto necesita notificar a otros objetos cuando cambia su estado. La idea es *encapsular* estos aspectos en objetos diferentes permite variarlos y reutilizarlos independientemente.
- Cuando existe una relación de dependencia de uno a muchos que puede requerir que un objeto *notifique a múltiples objetos* que dependen de él cuando cambia su estado.

####**Participantes en el patron** 

Tendremos sujetos concretos cuyos cambios pueden resultar interesantes a otros y observadores a los que al menos les interesa estar pendientes de un elemento y en un momento dado, reaccionar ante sus notificaciones de cambio. Todos los sujetos tienen en común que un conjunto de objetos quieren estar pendientes de ellos. Cualquier elemento que quiera ser observado tiene que permitir indicar:

“Estoy interesado en tus cambios”.
“Ya no estoy interesado en tus cambios”.
El observable tiene que tener, además, un mecanismo de aviso a los interesados.

A continuación tenemos a los participantes de forma desglosada:

- Sujeto (Subject): El sujeto proporciona una interfaz para agregar (attach) y eliminar (detach) observadores. El Sujeto conoce a todos sus observadores.
- Observador (Observer): Define el método que usa el sujeto para notificar cambios en su estado (update/notify).
- Sujeto Concreto (ConcreteSubject): Mantiene el estado de interés para los observadores concretos y los notifica cuando cambia su estado. No tienen porque ser elementos de la misma jerarquía.
- Observador Concreto (ConcreteObserver): Mantiene una referencia al sujeto concreto e implementa la interfaz de actualización, es decir, guardan la referencia del objeto que observan, así en caso de ser notificados de algún cambio, pueden preguntar sobre este cambio.



- **[UML Observer English][1]** 
- **[UML Observer Español][2]**


[1]:http://tinyurl.com/UMLObserverEnglish
[2]:http://tinyurl.com/UMLObserverEspanol
