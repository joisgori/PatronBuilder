/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author josue
 */
public class Cocina {

    private PastelesBuilder pastelesBuilder;

    public void setPastelesBuilder(PastelesBuilder pb) {
        pastelesBuilder = pb;
    }

    public Pastel getPastel() {
        return pastelesBuilder.getPastel();
    }
    
    public void construirPastel(){
        pastelesBuilder.crearNuevoPastel();
        pastelesBuilder.buildPan();
        pastelesBuilder.buildRelleno();
        pastelesBuilder.buildFrutas();
    }
}
