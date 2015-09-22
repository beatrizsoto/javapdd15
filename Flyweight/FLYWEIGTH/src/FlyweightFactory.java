/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class FlyweightFactory {
  
    IVehiculo auto;
 
 /**
  * <p>Lista todos los autos.</p>
  * @param color
  * @param patentes
  * @param duenios
  */
 public void listarAutos(String color[], String patentes[], String duenios[]){
  
  for (int i = 0; i < duenios.length; i++) {
   auto = new Auto(color[i], patentes[i], duenios[i]);   
   System.out.println("Datos del auto\n" + auto.mostrarDetalle());  
  }
  
 }

}

    

