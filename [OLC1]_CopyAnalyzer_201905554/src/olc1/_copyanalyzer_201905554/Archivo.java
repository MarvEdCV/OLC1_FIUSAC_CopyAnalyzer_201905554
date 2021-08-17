/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc1._copyanalyzer_201905554;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author marvi
 */
public class Archivo {
    /**
     * Objetode la clase file que representa de forma abstracta a un archivo fisico en disco
     */
    private File archivo;
    
    public Archivo(String nombreArchivo){
        archivo = new File(nombreArchivo);
    }  
    /**
     * 
     * @return String que tiene el contenido completo del archivo
     * @throws IOException  cuando hay problemas leyendo el archivo
     */
    public String darContenidoArchivo() throws IOException{
        String contenido = "";
        FileReader fr = new FileReader(archivo);
        BufferedReader lector = new BufferedReader(fr);
        String linea = lector.readLine();
        while(linea != null){
            contenido += linea+"\n";
            linea = lector.readLine();
        }
        lector.close();
        fr.close();
        return contenido;        
    }
    /**
     * 
     * @param contenido guarda el gontenido que se va a guardar en el archivo
     * @throws FileNotFoundException 
     */
    
    public void Guardar(String contenido) throws IOException{
        PrintWriter escritor = new PrintWriter(archivo);
        escritor.write(contenido);
        escritor.close();
    }
    
}
 