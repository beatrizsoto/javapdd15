/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorjava;

/**
 *
 * @author lizbeth
 */
public class IVA implements Visitor{
    private final double impuestoNormal=1.21;
    private final double impuestoReducido=1.105;
    public double visit (ProductoNormal normal){
        return normal.getPrecio()*impuestoNormal;
    }
    public double visit (ProductoDescuento reducido){
        return reducido.getPrecio()*impuestoReducido;
    }
}
