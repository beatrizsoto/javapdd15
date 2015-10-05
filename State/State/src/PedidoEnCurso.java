public class PedidoEnCurso extends EstadoPedido 

{ 

 public PedidoEnCurso(Pedido pedido) 

 { 

 super(pedido); 

 } 

 

 public void agregaProducto(Producto producto) 

 { 

 pedido.getProductos().add(producto); 

 } 

 

 public void borra() 

 { 

 pedido.getProductos().clear(); 

 } 

 

 public void suprimeProducto(Producto producto) 

 { 

 pedido.getProductos().remove(producto); 

 } 

 

 public EstadoPedido estadoSiguiente() 

 { 

 return new PedidoValidado(pedido); 

 } 

}