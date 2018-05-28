/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import Clases.*;
/**
 *
 * @author josue
 */
public class Principal {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PastelesBuilder pastelFresas = new FresaPastelBuilder();
        
        cocina.setPastelesBuilder(pastelFresas);
        cocina.construirPastel();
        
        Pastel pastel = cocina.getPastel();
    }
}
