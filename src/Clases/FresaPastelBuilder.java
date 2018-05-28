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
public class FresaPastelBuilder extends PastelesBuilder {

    @Override
    public void buildPan() {
        pastel.setPan("Dulce");
    }

    @Override
    public void buildRelleno() {
        pastel.setRelleno("Cremoso");
    }

    @Override
    public void buildFrutas() {
        pastel.setFrutas("Fresas");
    }

}
