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
public class ProductoNormal implements Visitable{
    private double precio;
    public double accept (Visitor visitor){
        return visitor.visit(this);
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
}
