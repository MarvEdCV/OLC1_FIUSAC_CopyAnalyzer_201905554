/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc1._copyanalyzer_201905554;

import java.io.File;

/**
 *
 * @author marvi
 */
public class Archivo {
    private File archivo;
    
    public Archivo(String nombreArchivo){
        archivo = new File(nombreArchivo);
    }
}
