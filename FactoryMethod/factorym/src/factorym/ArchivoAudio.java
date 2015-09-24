/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorym;

/**
 *
 * @author amairani
 */
public class ArchivoAudio implements IArchivo {
    
     public ArchivoAudio() {
    }
    // -----------------------------
    @Override
     public void reproducir() {
        System.out.println("Reproduciendo archivo de audio...");
    }
    
    
}
