#Facade
######Busca simplificar el sistema, desde el punto de vista del cliente, proporcionando una interfaz unificada para un conjunto de subsistemas, definiendo una interfaz de nivel más alto. Esto hace que el sistema sea más fácil de usar.
>Busca **simplificar** el sistema, desde el punto de vista del cliente, proporcionando una interfaz unificada para un conjunto de subsistemas, definiendo una interfaz de nivel más alto. Esto hace que el sistema sea más fácil de usar.


##### **Se debe utilizar cuando:**
* Se quiera proporcionar una interfaz sencilla para un subsistema complejo.
- Se quiera desacoplar un subsistema de sus clientes y de otros subsistemas, haciéndolo más independiente y portable.
+ Se quiera dividir los sistemas en niveles: las fachadas serían el punto de entrada a cada nivel. Facade puede ser utilizado a nivel aplicación.

#####Diagrama UML
![alt text](https://lh3.googleusercontent.com/zRSPCgsvEraePczqEnz812vs4Q1bIdsNfanLyuRMcOnPoguqR5Fn-cErEwr8K_Eh-LKjVzRfyiY2sCrqrhVZLoYjnVU6Kl_CXqkZsxGpOFgbXghuAXA "FACADE")

* **Facade:**  conoce cuales clases del subsistema son responsables de una petición. 
Delega las peticiones de los clientes en los objetos del subsistema.
-**Subsistema:** manejar el trabajo asignado por el objeto Facade. No tienen ningún conocimiento del Facade (no guardan referencia de éste).
