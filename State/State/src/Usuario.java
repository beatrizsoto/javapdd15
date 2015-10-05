public class Usuario

{ 

 public static void main(String[] args) 

 { 

 Pedido pedido = new Pedido(); 

 pedido.agregaProducto(new Producto("vehiculo 1")); 

 pedido.agregaProducto(new Producto("accesorio 2")); 

 pedido.visualiza(); 

 pedido.estadoSiguiente(); 

 pedido.agregaProducto(new Producto("accesorio 3")); 

 pedido.borra(); 

 pedido.visualiza(); 

 

 Pedido pedido2 = new Pedido(); 

 pedido2.agregaProducto(new Producto("vehiculo 11")); 

 pedido2.agregaProducto(new Producto("accesorio 21")); 

 pedido2.visualiza(); 

 pedido2.estadoSiguiente(); 

 pedido2.visualiza(); 

 pedido2.estadoSiguiente(); 

 pedido2.borra(); 

 pedido2.visualiza(); 

 } 

}