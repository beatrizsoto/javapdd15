El Patrón Proxy

Este patrón consiste en interponer un intermediario (Proxy) entre un objeto y los demás que lo utilizan. Se diferencia del patrón Adaptador en que el objeto "adaptado" solamente puede ser manipulado a través del objeto Proxy.

Se suele utilizar para implementar comportamientos "vagos" (lazy). Por ejemplo, si tenemos muchos objetos imagen en un documento, se tardaría mucho tiempo en abrir el documento al cargar las imágenes de disco. Para evitarlo podemos sustituir los objetos imagen por objetos proxyImagen, con el mismo interfaz, pero que solamente cargan la imagen cuando se va a visualizar. 

 Debemos insistir en dos aspectos que caracterizan el patrón Proxy:

  - El objeto Apoderado tiene el mismo interfaz que el objeto "Protegido". Para facilitar esto se puede derivar el objeto Apoderado de la misma clase padre que el objeto "Protegido", pero no es absolutamente necesario.
  - El objeto "Protegido" solamente puede ser manipulado por su correspondiente Apoderado.

  
Este patrón se debe utilizar cuando:
-Se necesite retrasar el coste de crear e inicializar un objeto hasta que es realmente necesario.

-Se necesita una referencia a un objeto más flexible o sofisticada que un puntero.
Algunas situaciones comunes de aplicación son:

 1.-Proxy remoto: representa un objeto en otro espacio de direcciones. Esto quiere decir que el proxy será utilizado de manera tal que la conexión con el objeto remoto se realice de forma controlada sin saturar el servidor.
 
 2.-Proxy virtual: crea objetos costosos por encargo. Cuando se utiliza un software no siempre se cargan todas las opciones por default. Muchas veces se habilitan ciertos módulos sólo cuando el usuario decide utilizarlos.
 
 3.-Proxy de protección: controla el acceso a un objeto. Controla derechos de acceso diferentes.
 
 4.-Referencia inteligente: sustituto de un puntero que lleva a cabo operaciones adicionales cuando se accede a un objeto (ej. contar el número de referencias, cargar un objeto persistente en memoria, bloquear el objeto para impedir acceso concurrente, ...).

Un ejemplo típico de aplicación del patrón proxy es el de un editor de documentos. El editor podrá incluir imágenes y dibujos complejos, y se plantea el problema de recuperar todos estos costosos objetos cada vez que se abre el documento. La aplicación del patrón proxy soluciona el problema definiendo un "representante", que ocupe su lugar, hasta que sea necesario cargarlos. 

