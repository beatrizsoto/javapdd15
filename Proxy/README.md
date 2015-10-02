El Patrón Proxy

Este patrón consiste en interponer un intermediario (Proxy) entre un objeto y los demás que lo utilizan. Se diferencia del patrón Adaptador en que el objeto "adaptado" solamente puede ser manipulado a través del objeto Proxy.

Se suele utilizar para implementar comportamientos "vagos" (lazy). Por ejemplo, si tenemos muchos objetos imagen en un documento, se tardaría mucho tiempo en abrir el documento al cargar las imágenes de disco. Para evitarlo podemos sustituir los objetos imagen por objetos proxyImagen, con el mismo interfaz, pero que solamente cargan la imagen cuando se va a visualizar. 

 Debemos insistir en dos aspectos que caracterizan el patrón Proxy:

  - El objeto Apoderado tiene el mismo interfaz que el objeto "Protegido". Para facilitar esto se puede derivar el objeto Apoderado de la misma clase padre que el objeto "Protegido", pero no es absolutamente necesario.
  - El objeto "Protegido" solamente puede ser manipulado por su correspondiente Apoderado.

Un ejemplo típico de aplicación del patrón proxy es el de un editor de documentos. El editor podrá incluir imágenes y dibujos complejos, y se plantea el problema de recuperar todos estos costosos objetos cada vez que se abre el documento. La aplicación del patrón proxy soluciona el problema definiendo un "representante", que ocupe su lugar, hasta que sea necesario cargarlos. 

