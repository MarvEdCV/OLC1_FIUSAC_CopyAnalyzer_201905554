/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaFCA;

import AnalyzerJavascript.Parserjs;
import AnalyzerJavascript.Scannerjs;
import Interfaz.Interfaz;
import static Interfaz.Interfaz.Consolelog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marvi
 */
public class DatosJs {
        
        
        ArrayList <Repitenciaclase> clasesrepetida = new ArrayList<>();//lista que contiene todos los datos  a considerar o comparar para que una clase sea repetida
        ArrayList <String> idvariables = new ArrayList<>();//Lista global en todo el archivo JS
        String archivotmp;
        

        //PRIMERO RECORRER ARCHIVOS DE CARPETAS
        //GUARDAD RUTAS ARCHIVOS IGUALES A GUARDAR.
        //OBTENGO RUTAS A ANALIZA 
        
        //OBTENIDO CON ANALIZADOR JS
        //constructor para obtener datos padres de un archivo js luego de analizarlo
        public DatosJs(ArrayList<Repitenciaclase> a,ArrayList<String> b){
            this.clasesrepetida = a;
            this.idvariables = b;
        }

        
}
