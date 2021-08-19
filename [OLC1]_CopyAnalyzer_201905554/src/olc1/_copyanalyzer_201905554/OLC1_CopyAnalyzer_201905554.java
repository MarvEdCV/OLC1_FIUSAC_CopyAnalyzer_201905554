/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc1._copyanalyzer_201905554;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author marvi
 */
public class OLC1_CopyAnalyzer_201905554 {
    /**
     * Representa el archivo que esta cargado en el editor
     */
    private Archivo archivo;
    
    /**
     * Construye u objeto de la clase de CopyAnalyzer
     */
    public OLC1_CopyAnalyzer_201905554(){
        archivo = null;
    }
    /**
     * Abre un archivo de texto existente
     * @param nombreArchivo String qe contiene la ruta completa del archivo
     * @return String que contiene el contenido del archivo
     * @throws Exception cuando hay problemas abriendo un archivo
     */
    public String AbrirArchivo( String nombreArchivo) throws Exception{
        String contenido = "";
        archivo = new Archivo(nombreArchivo);
        try {
            contenido = archivo.darContenidoArchivo();
        } catch (IOException ex) {
          throw new Exception("Error leyendo archivo.");
        }
        return contenido;
    }
     /**
      * Guarda el contenido del archivo en curso
      * @param Contenido String que tiene el contenido que se va a guardar en el archivo
      * @param RutaArchivo cuando hay problemas tratando de escribir en el archivo
      * @throws Exception Cuando hay problemas tratando de escribir el archivo.
      */
    public void guardarArchivo(String Contenido, String RutaArchivo ) throws Exception{
        if(archivo == null){
            archivo = new Archivo(RutaArchivo);
        }
        try {
            archivo.Guardar(Contenido);
        } catch (FileNotFoundException ex) {
             throw new Exception("Error guardando el archivo.");
        }
    }
    public void guardarArchivocomo(String Contenido, String RutaArchivo ) throws Exception{
        try {
            archivo.Guardar(Contenido);
        } catch (FileNotFoundException ex) {
             throw new Exception("Error guardando el archivo.");
        }
    }
    
    /**
     * Indica si el archivo del editor es nuevo o no 
     * @return true si es nuevo, false si es el caso contrario
     */
    public boolean EsArchivoNuevo(){
        return archivo == null;
    }
    
    /**
     * @param args the command line arguments
     *//*
    public static void main(String[] args) {
        // TODO code application logic here0
         try {
			String texto =  "10+5*565+64.5+(-5)";
			System.out.println("Iniciando analisis...");
			Scanner scanner = new Scanner(new BufferedReader(new StringReader(texto)));
			Parser parser = new Parser(scanner);
			parser.parse();
			System.out.println("Finalizando analisis...");
		} catch (Exception e) {
		}
    }*/
     
    
    
}
    
