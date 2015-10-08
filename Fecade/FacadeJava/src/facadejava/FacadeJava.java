/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadejava;

/**
 *
 * @author lizbeth
 */
public class FacadeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c= new Cliente();
        Interesado i=new Interesado();
        //Primer Cliente
        Inmobiliaria inmo=new Inmobiliaria();
        inmo.atencionCliente(c);
        inmo.atencionInteresado(i);
        MuestraPropiedad muestraPropiedad=new MuestraPropiedad();
        muestraPropiedad.mostrarPropiedad(123);
        VentaInmueble venta= new VentaInmueble();
        venta.gestionaVenta();
        AdministracionAlquiler alquiler=new AdministracionAlquiler();
        alquiler.cobro(1200);
        CUentasAPagar cuentasAPagar=new CUentasAPagar();
        cuentasAPagar.pagoPropietario(1100);
        
        //SegundoCliente (Usando Facade)
        Inmobiliaria inmo2=new Inmobiliaria();
        inmo2.atencion(i);
        inmo2.atencion(c);
        muestraPropiedad.mostrarPropiedad(123);
        venta.gestionaVenta();
        alquiler.cobro(1200);
        cuentasAPagar.pagoPropietario(1100);
    }
    
}
