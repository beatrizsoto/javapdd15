
package principal;

import java.util.ArrayList;
public class Memoria {
    
    private   ArrayList<Object> datos = new ArrayList<Object>();
   
    
    public Object obtener (int i){
    return datos.get(i);
    
    }
public void agregar (Object o){

datos.add(o);

}    

public Object borrar (int i){
return datos.remove(i);

}
public int tamano(){
return datos.size();

}
}
