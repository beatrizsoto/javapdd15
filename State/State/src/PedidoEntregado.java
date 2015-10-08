public class PedidoEntregado extends EstadoPedido 

{ 

 public PedidoEntregado(Pedido pedido) 

 { 

 super(pedido); 

 } 

 

 public void agregaProducto(Producto producto) { } 

 

 public void borra() { } 

 

 public void suprimeProducto(Producto producto) { } 

 

 public EstadoPedido estadoSiguiente() 

 { 

 return this; 

 } 

}