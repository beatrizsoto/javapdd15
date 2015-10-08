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
public class Creador extends CreadorAbstracto {
    
        public void Creador() {
    }
    // -------------------------------------------
    @Override
     public IArchivo crear(int tipo)
    {
        IArchivo objeto;
        switch( tipo )
        {
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
    }
    
}
