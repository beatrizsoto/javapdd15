/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
  
 public static void main(String[] args) { 
  FlyweightFactory ff = new FlyweightFactory();
  String patentes[] = {"ARG123","CHL123","PER123"};
  String colores[] ={"Negro","Azul","Rojo"};
  String duenios[] ={"Carlos", "Pedro", "Julio"};
  
  ff.listarAutos(colores, patentes, duenios);
 }
}
