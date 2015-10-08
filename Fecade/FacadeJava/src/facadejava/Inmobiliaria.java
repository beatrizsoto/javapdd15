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
public class Inmobiliaria {
    private MuestraPropiedad muestraPropiedad;
    private VentaInmueble venta;
    private CUentasAPagar cuentasAPagar;
    private AdministracionAlquiler alquiler;
    
    public Inmobiliaria(){
        muestraPropiedad=new MuestraPropiedad();
        venta= new VentaInmueble();
        cuentasAPagar=new CUentasAPagar();
        alquiler= new AdministracionAlquiler();
    }
    public void atencionCliente(Cliente c){
        System.out.println("Atendiendo a un cliente");
    }
    public void atencionPropietario(Propietario p){
        System.out.println("Atendiendo Propietario");
    }
    public void atencionInteresado(Interesado i){
        System.out.println("Atencion a un interesado en una propiedad");
    }
    public void atencion (Persona p){
        if (p instanceof Cliente){
        atencionCliente((Cliente) p);}
        else if (p instanceof Propietario){
            atencionPropietario((Propietario)p);
        }else {
            atencionInteresado((Interesado) p);
        }
    }
}
