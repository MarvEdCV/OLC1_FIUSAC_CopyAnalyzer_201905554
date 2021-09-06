/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaFCA;

import AnalyzerJavascript.Parserjs;
import AnalyzerJavascript.Scannerjs;
import static Interfaz.Interfaz.Consolelog;
import java.io.BufferedReader;
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
public class LogicaJs {
    ArrayList <String> idvariables = new ArrayList<>();
    ArrayList <String> idclases = new ArrayList<>();
    ArrayList <String> idfunciones = new ArrayList<>();
    
    int variablesA=0,variablesB=0;
    int clasesA=0,clasesB=0;
    int metodosA=0,metodosB=0;
    public boolean archivo;
    String proyectoactual,rutafinal,aa;
    String r1,r2;
        DatosJs datopadre,datopadretemporal;
        ArrayList<DatosJs> DatosProyectoA = new ArrayList<>();
        ArrayList<DatosJs> DatosProyectoB = new ArrayList<>();
        
                //obtenidos analizador fca
        ArrayList <String> archivosruta1 = new ArrayList<>();
        ArrayList <String> archivosruta2 = new ArrayList<>();
        ArrayList <Integer> numclases = new ArrayList<>();
        ArrayList <Integer> numfunciones = new ArrayList<>();
        ArrayList <Integer> numvariables = new ArrayList<>();
        ArrayList <Integer> resumen = new ArrayList<>();
         int totalclases=0;
            int totalfunciones=0;
            int totalvariables=0;
        public void recibirlistas(ArrayList <String> idvariables,ArrayList <String> idclases,ArrayList <String> idfunciones){
        this.idclases = idclases;
        this.idfunciones = idfunciones;
        this.idvariables = idfunciones;
        }
        public void imprimirs(){
            System.out.println(idclases.size());
            System.out.println(idfunciones.size());
            System.out.println(idvariables.size());
        }
        public void obtenertamanios(){
           
            
            numclases.add(idclases.size());
            numfunciones.add(idfunciones.size());
            numvariables.add(idvariables.size());
            
            for(int i=0;i<numclases.size();i++){
                totalclases = totalclases + numclases.get(i);
            }
            for(int i=0;i<numfunciones.size();i++){
                totalfunciones = totalfunciones + numfunciones.get(i);
            }
            for(int i=0;i<numvariables.size();i++){
                totalvariables = totalvariables + numvariables.get(i);
            }
            
        }
        public void imprimirvectorfinal(){
            System.out.println("clases: "+totalclases+"funciones: "+ totalfunciones+" total variables "+totalvariables);
        }
        public void Obtenerrutas(String a, String b){
            this.r1=a;
            this.r2=b;
        }
        public void Obtenerarchivos(ArrayList<String> ar,ArrayList<String> br){
            this.archivosruta1 = ar;
            this.archivosruta2 =br; 
            System.out.println(archivosruta1);
            System.out.println(archivosruta2);
        }
    
        public String obtenercontenido(String archivo) throws IOException{
        String cadena;
        String lectura="";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            lectura = lectura + cadena + "\n";
        }
        b.close();
        return lectura;
        }
        public void recibirdatopadreactual(DatosJs datopadre,String ax){
            this.datopadre = datopadre;  
            this.datopadre.archivotmp =ax;
        }
        public String obtenera(){
            return aa;
        }
        public void llenardatosProyectoA(){
            System.out.println("estoy entrando a A");
            //DatosProyectoA.add(datopadre);  
        }
        public void llenardatosProyectoB(){
            System.out.println("estoy entrando a B");
            //DatosProyectoB.add(datopadre);  
        }
        
            public void save(){
            if(datopadre.archivotmp=="A"){llenardatosProyectoA();}
            else{llenardatosProyectoB();
        }
            }
    
        
        public void correrjsproyectoA() throws IOException{
        for(int i = 0;i<archivosruta1.size();i++){
        Consolelog("Inicindo analisis javascript de "+archivosruta1.get(i));
        Scannerjs scanner = new Scannerjs(new BufferedReader(new StringReader(obtenercontenido(archivosruta1.get(i)))));
        Parserjs parser = new Parserjs(scanner);
            try {
                parser.parse();
            } catch (Exception ex) {
                Logger.getLogger(DatosJs.class.getName()).log(Level.SEVERE, null, ex);
            }
                proyectoactual = archivosruta1.get(i);
                this.aa="A";
                Consolelog("Finalizando analisis javascript de : "+archivosruta1.get(i)+"\n");
                
        }
       
        }
        public void correrjsproyectoB() throws IOException{
        for(int i = 0;i<archivosruta2.size();i++){
        Consolelog("Inicindo analisis javascript de "+archivosruta2.get(i));
        Scannerjs scanner = new Scannerjs(new BufferedReader(new StringReader(obtenercontenido(archivosruta2.get(i)))));
        Parserjs parser = new Parserjs(scanner);
            try {
                parser.parse();
            } catch (Exception ex) {
                Logger.getLogger(DatosJs.class.getName()).log(Level.SEVERE, null, ex);
            }archivo=true;
           //AlmacenarDatosArchivosProyectoB(clasesrepetida, idvariables, archivosruta2.get(i));
                proyectoactual = archivosruta1.get(i);
                Consolelog("Finalizando analisis javascript de : "+archivosruta2.get(i)+"\n");
        }
        }
       
        /*
        //constructor para almacenar datos aniadiendole nombre del archivo al que pertenece y asi analizarlo.
         public void AlmacenarDatosArchivosProyectoA(ArrayList<Repitenciaclase> claserepetida,ArrayList<String> listavariables,String nombrearchivo){
             DatosJs datos = new DatosJs();
             datos.clasesrepetida = claserepetida;
             datos.idvariables = listavariables;
             datos.archivotmp = nombrearchivo;
             DatosProyectoA.add(datos);
        }
         public void AlmacenarDatosArchivosProyectoB(ArrayList<Repitenciaclase> claserepetida,ArrayList<String> listavariables,String nombrearchivo){
             DatosJs datos = new DatosJs(claserepetida,listavariables);
             datos.archivotmp = nombrearchivo;
             DatosProyectoB.add(datos);
        }*/
        
        public void obtenerresumenA(){
          for(int i=0;i<DatosProyectoA.size();i++){
              System.out.println("Rutas de archivos almacenados: ");
              System.out.println(DatosProyectoA.get(i).archivotmp);
            
              System.out.println(DatosProyectoA.get(i).clasesrepetida.size());
              //System.out.println(DatosProyectoA.get(i).clasesrepetida.get(0).idclase);
              //variablesA = variablesA + DatosProyectoA.get(i).idvariables.size();
          }
         // System.out.println("El numero de variables en el Proyecto 1 es de: "+ variablesA);
}
}
