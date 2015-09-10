El  patrón  Chain of Responsibility   construye  una  cadena  de  objetos  tal  que  si  un  objeto  de  la  cadena  no puede responder a la solicitud, puede transmitirla a su sucesor y así sucesivamente hasta que uno de los objetos 
de la cadena responde.
El patrón  Chain of Responsibility  proporciona una solución para llevar a cabo este mecanismo. Consiste en 
enlazar  los  objetos  entre  ellos  desde  el  más  específico  (el  vehículo)  al  más  general  (la  marca)  para formar  la cadena de responsabilidad. La solicitud de la descripción se transmite a lo largo de la cadena hasta que un objeto pueda procesarla y enviar la descripción. 
El patrón se utiliza en los casos siguientes: 
● una cadena de objetos gestiona una solicitud según un orden que se define dinámicamente; 
● la forma en que una cadena de objetos gestiona una solicitud no tiene por qué conocerse en sus clientes. 
Ejemplo.
Los vehículos,  modelos  y  marcas  se  describen  mediante  subclases  concretas  de  la  clase  ObjetoBásico .  Esta  clase abstracta  incluye  la  asociación  siguiente   que  implementa  la  cadena  de  responsabilidad.  Incluye  a  su  vez  tres 
métodos: 
● getDescripción   es  un  método  abstracto.  Está  implementado  en  las  subclases  concretas.  Esta 
implementación debe devolver la descripción si existe o bien el valor  null  en caso contrario; 
-descripciónPorDefecto  devuelve un valor de descripción por defecto, válido para todos los vehículos 
del catálogo; 
●DevuelveDescripción  es el método público destinado al usuario. Invoca al método  getDescripción . Si 
el  resultado  es  null ,  entonces  si  existe  un  objeto  siguiente   se  invoca  a  su  método 
devuelveDescripción , en caso contrario se utiliza el método  descripciónPorDefecto.
En este ejemplo, ni el  vehículo1  ni el  modelo1  poseen una descripción. Sólo la  marca1  posee una descripción, la cual se utiliza para el  vehículo1 .
Los participantes del patrón son los siguientes: 
●Gestor (ObjetoBásico)  es  una  clase  abstracta  que  implementa  bajo  la  forma  de  una  asociación  la 
cadena de responsabilidad así como la interfaz de las solicitudes; 
● GestorConcreto1   y  GestorConcreto2   ( Vehículo ,  Modelo   y  Marca )  son  las  clases  concretas  que 
implementan el procesamiento de las solicitudes utilizando la cadena de responsabilidad si no pueden 
procesarlas; 
● Cliente (Usuario)   inicia  la  solicitud  inicial  en  un  objeto  de  una  de  las  clases  GestorConcreto1   o GestorConcreto2.

