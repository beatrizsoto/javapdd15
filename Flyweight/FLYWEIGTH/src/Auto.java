/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Auto implements IVehiculo{
    
     public String color;
 public String patente;
 public String duenio;
 
 /**
  * <p>Constructor</p>
  * @param color
  * @param patente
  * @param duenio
  */
 public Auto(String color, String patente, String duenio){
  this.color = color;
  this.patente = patente;
  this.duenio = duenio;
 }
 
 @Override
 public String mostrarDetalle() {
     return "Patente: " + this.patente + ", Color: " + this.color + " , Duenio: "+ this.duenio;
 }
}
