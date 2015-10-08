public class PedidoValidado extends EstadoPedido 

{ 

 public PedidoValidado(Pedido pedido) 

 { 

 super(pedido); 

 } 

 

 public void agregaProducto(Producto producto) { } 

 

 public void borra() 

 { 

 pedido.getProductos().clear(); 

 } 

 

 public void suprimeProducto(Producto producto) { } 

 

 public EstadoPedido estadoSiguiente() 

 { 

 return new PedidoEntregado(pedido); 

 } 

}