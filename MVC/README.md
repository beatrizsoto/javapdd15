

Modelo Vista Controlador (MVC) es un estilo de arquitectura de software que separa los datos de una aplicación, la interfaz de usuario, y la lógica de control en tres componentes distintos.

es decir, por un lado define componentes para la representación de la información, y por otro lado para la interacción del usuario.


    El Modelo, contiene una representación de los datos que maneja el sistema, su lógica de negocio, y sus mecanismos de persistencia.
    
    La Vista, o interfaz de usuario, que compone la información que se envía al cliente y los mecanismos de interacción con éste.
    
    El Controlador, que actúa como intermediario entre el Modelo y la Vista, gestionando el flujo de información entre ellos y las transformaciones para adaptar los datos a las necesidades de cada uno.



El modelo es el responsable de:

    Acceder a la capa de almacenamiento de datos. Lo ideal es que el modelo sea independiente del sistema de almacenamiento.
    Define las reglas de negocio (la funcionalidad del sistema). Un ejemplo de regla puede ser: "Si la mercancía pedida no está en el almacén, consultar el tiempo de entrega estándar del proveedor".
    Lleva un registro de las vistas y controladores del sistema.
    Si estamos ante un modelo activo, notificará a las vistas los cambios que en los datos pueda producir un agente externo (por ejemplo, un fichero por lotes  que actualiza los datos, un temporizador que desencadena una inserción, etc.).

 
El controlador es responsable de:

     Recibe los eventos de entrada (un clic, un cambio en un campo de texto, etc.).
    Contiene reglas de gestión de eventos, del tipo "SI Evento Z, entonces Acción W". Estas acciones pueden suponer peticiones al modelo o a las vistas. Una de estas peticiones a las vistas puede ser una llamada al método "Actualizar()". Una petición al modelo puede ser "Obtener_tiempo_de_entrega ( nueva_orden_de_venta )". 

 
Las vistas son responsables de:

    Recibir datos del modelo y los muestra al usuario.
    Tienen un registro de su controlador asociado (normalmente porque además lo instancia).
    Pueden dar el servicio de "Actualización()", para que sea invocado por el controlador o por el modelo (cuando es un modelo activo que informa de los cambios en los datos producidos por otros agentes).
    
https://codesystems.files.wordpress.com/2012/02/patronmvc1.png

https://librosweb.es/img/symfony_1_2/f0201.png

