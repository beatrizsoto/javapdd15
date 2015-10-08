## El patrón *Bridge*

![alt center text](https://danielggarcia.files.wordpress.com/2014/03/031614_2328_patronesest1.png?w=620 "Logo Title Text 1")

**Objetivo:**

* “El patrón Bridge, también conocido como Handle/Body, es una técnica usada en programación para desacoplar una abstracción de su implementación, de manera que ambas puedan ser modificadas independientemente sin necesidad de alterar por ello la otra.

Esto es, se desacopla una abstracción de su implementación para que puedan variar independientemente.”

El patrón **_Bridge_** o **_Puente_** es normalmente uno de los patrones que más cuesta entender, especialmente si nos ceñimos únicamente a su descripción. La idea tras este patrón, sin embargo, es sencilla: dado que cualquier cambio que se realice sobre una abstracción afectará a todas las clases que la implementan, Bridge propone añadir un nuevo nivel de abstracción entre ambos elementos que permitan que puedan desarrollarse cada uno por su lado.
  
Si le echamos un ojo al diagrama, es posible que de base no nos aclare demasiado. Nos centraremos en el elemento central: una clase abstracta *Abstracción* que contiene una referencia a una interfaz *Implementor* y un método *operacion()* que no hace más que invocar el método *operacionOriginal()* de dicha interfaz. Lo que hace esta clase *Abstracción* es, por tanto, encapsular a la interfaz *Implementor* exponiendo sus métodos.


**Código-Ejemplo en JAVA:** 
interface Implementador {
    public abstract void operacion();
}
 
/** primera implementacion de Implementador **/
class ImplementacionA implements Implementador{
    public void operacion() {
        System.out.println("Esta es la implementacion A");
    }
}
/** segunda implementacion de Implementador **/
class ImplementacionB implements Implementador{
    public void operacion() {
        System.out.println("Esta es una implementacion de B");
    }
}
/** interfaz de abstracción **/
interface Abstraccion {
    public void operacion();
}
/** clase refinada que implementa la abstraccion **/
class AbstraccionRefinada implements Abstraccion{
    private Implementador implementador;
    public AbstraccionRefinada(Implementador implementador){
        this.implementador = implementador;
    }
    public void operacion(){
        implementador.operacion();
    }
}
/** aplicacion que usa el patrón Bridge **/
public class EjemploBridge {
    public static void main(String[] args) {
        Abstraccion[] abstracciones = new Abstraccion[2];
        abstracciones[0] = new AbstraccionRefinada(new ImplementacionA());
        abstracciones[1] = new AbstraccionRefinada(new ImplementacionB());
        for(Abstraccion abstraccion:abstracciones)
            abstraccion.operacion();
    }
}



**Video:** 

[![Bridge Design Pattern](http://img.youtube.com/vi/9jIgSsIfh_8/0.jpg)](https://www.youtube.com/watch?v=9jIgSsIfh_8)
