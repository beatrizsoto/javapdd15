
package principal;




public class Principal {

    
    public static void main(String[] args) {
        
        FabricaDeMemoria fabrica1= new principal.FabricaDeMemoria();
        fabrica1.obtenerMemoria().agregar("ALBERTO ZAVALA");
        
        FabricaDeMemoria fabrica2=new FabricaDeMemoria();
        System.out.println("SINGLETON");
        System.out.println(fabrica2.obtenerMemoria().obtener(0));
        
        FabricaDeMemoria fabrica3= new FabricaDeMemoria();
        fabrica3.obtenerMemoria().agregar("PATRONES DE DISEÑO");
        System.out.println(fabrica3.obtenerMemoria().tamano());
        
      //  int i=0;
       // while(i<new FabricaDeMemoria().obtenerMemoria().datos.size()){
       // System.out.println(new FabricaDeMemoria().obtenerMemoria().datos.get(i));
        
        }
       
    }
}
