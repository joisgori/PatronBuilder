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
public abstract class PastelesBuilder {
    protected Pastel pastel;
    
    public Pastel getPastel() {
        return pastel;
    }
    
    public void crearNuevoPastel(){
        pastel = new Pastel();
    }
    
    public abstract void buildPan();
    public abstract void buildRelleno();
    public abstract void buildFrutas();
}
