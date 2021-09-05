/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaFCA;

import java.util.ArrayList;

/**
 *
 * @author marvi
 */
public class DatosJs {
        ArrayList <Repitenciaclase> clasesrepetida = new ArrayList<>();//lista que contiene todos los datos  a considerar o comparar para que una clase sea repetida
        ArrayList <String> idvariables = new ArrayList<>();//Lista global en todo el archivo JS
        
        //obtenidos analizador fca
        ArrayList <String> archivosruta1 = new ArrayList<>();
        ArrayList <String> archivosruta2 = new ArrayList<>();
        public void Obtenerarchivos(ArrayList<String> ar,ArrayList<String> br){
            this.archivosruta1 = ar;
            this.archivosruta2 =br;
        }
        //PRIMERO RECORRER ARCHIVOS DE CARPETAS
        //GUARDAD RUTAS ARCHIVOS IGUALES A GUARDAR.
        //OBTENGO RUTAS A ANALIZA 
        //OBTENIDO CON ANALIZADOR JS
        public DatosJs(ArrayList<Repitenciaclase> a,ArrayList<String> b){
            this.clasesrepetida = a;
            this.idvariables = b;
        }

    public DatosJs() { //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
        
        public void puntajegeneral(){
            if(archivosruta1.size() > archivosruta2.size()){
                for(int i=0;i<archivosruta2.size();i++){
                    
                }
            }
        }
      

}
