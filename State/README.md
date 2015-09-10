
El patrón State permite a un objeto adaptar su comportamiento en función de su estado interno. 

El patrón State tiene la misión fundamental de encapsular el comportamiento de un objeto dependiendo del estado en el que éste se encuentre. Estrictamente hablando, podemos definir el estado de un objeto como el conjunto actual de los valores de los atributos de un objeto. Podríamos definir un estado como un conjunto de características que harán que el objeto tenga unas características concretas. 


Normalmente cuando queremos establecer un comportamiento para un metodo dependiendo del estado en que se encuentra un objeto utilizamos condiciones. Para programas pequeños, con un numero de estados pequeño puede resultar util. Pero a la hora de querer desarrollar un programa con un gran numero de estados, el pograma se vuelve complejo y hace dificil que se pueda agregar un nuevo estado. 

El  patrón  State   proporciona  otra  solución  que  consiste  en  transformar  cada  estado  en  una  clase.  Esta  clase incluye los métodos de la clase  Principal(Objeto)  dependiendo de los estados confiriendo el comportamiento propio de cada estado. 

Estructura 

La estructura del patron de diseño state es la siguiente.

●Context: Define la Interfaz y mantiene una instancia con el estado actual.

●State: Define una interfaz para el comportamiento asociado a un determinado estado del Contexto.

●ConcreteState: Cada subclase implementa el comportamiento asociado con un estado del contexto.



Colaboraciones

La máquina de estados delega las llamadas a los métodos dependiendo del estado en curso hacia un objeto de 
estado. 
La máquina de estados puede transmitir al objeto de estado una referencia hacia sí misma si es necesario. Esta 
referencia puede pasarse durante la delegación o en la propia inicialización del objeto de estado. 

El patrón se utiliza en los siguientes casos: 

●El comportamiento de un objeto depende de su estado;

●La  implementación  de  esta  dependencia  del  estado  mediante  instrucciones  condicionales  se  vuelve  muy 
compleja. 



