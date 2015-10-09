<h1>Modelo Vista Controlador (MVC)</h1> 
**Es un patrón de arquitectura de software que separa los datos y la lógica de negocio de una aplicación de la interfaz de usuario y el módulo encargado de gestionar los eventos y las comunicaciones. Para   ello   MVC propone la construcción de tres componentes distintos que son el modelo, la vista y el controlador, es decir, por un lado define componentes para la representación de la información, y por otro lado para la interacción del usuario. Este patrón de arquitectura de software se basa en las ideas de reutilización de código y la separación de conceptos, características que buscan facilitar la tarea de desarrollo de aplicaciones y su posterior mantenimiento.**


<h2>Diagrama UML</h2>

![alt center text](http://www.juanminaya.com/blog/wp-content/uploads/2010/03/mvc.jpg "Logo Title Text 1")





####El patrón de arquitectura MVC, es una filosofía de diseño de aplicaciones, compuesta por:

**Modelo**
<ul>
<li>Contiene el núcleo de la funcionalidad (dominio) de la aplicación.</li>
<li>Encapsula el estado de la aplicación.</li>
<li>No sabe nada / independiente del Controlador y la Vista.</li>
</ul>
**Vista** 
<li>Es la presentación del Modelo.</li>
<li>Puede acceder al Modelo pero nunca cambiar su estado.</li>
<li>Puede ser notificada cuando hay un cambio de estado en el Modelo.</li>

**Controlador**
<li>Reacciona a la petición del Cliente, ejecutando la acción adecuada y creando el modelo pertinente**</li>


####Flujo de control
<ol>
<li>El usuario realiza una acción en la interfaz</li>
<li>El controlador trata el evento de entrada
<ul>
     <li>Previamente se ha registrado</li>
</ul>
</li>
<li>El controlador notifica al modelo la acción del usuario, lo que
puede implicar un cambio del estado del modelo (si no es
una mera consulta)</li>
<li>Se genera una nueva vista. La vista toma los datos del
modelo.
<ul>
    <li>El modelo no tiene conocimiento directo de la vista</li>
</ul>
</li>
<li>La interfaz de usuario espera otra interacción del usuario,
que comenzará otro nuevo ciclo</li>
</ol>


    BENAVIDEZ RODRIGUEZ CHRISTIAN ARMANDO 12211884
    ODAIR ROBLES PAZ 12210436
