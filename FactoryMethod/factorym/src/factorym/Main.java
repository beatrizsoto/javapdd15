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
public class Main
{
    public static void main(String[] args)
    {
         CreadorAbstracto creator = new Creador();
        IArchivo audio = creator.crear( Creador.AUDIO );
        audio.reproducir();
        IArchivo video = creator.crear( Creador.VIDEO );
        video.reproducir();
    }
}
