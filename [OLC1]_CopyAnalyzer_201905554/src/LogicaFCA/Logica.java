/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaFCA;

import Interfaz.Interfaz;
import java.util.ArrayList;
/**
 *
 * @author marvi
 */
public class Logica  {
    ArrayList <VariableGlobal> variablesGlobales = new ArrayList<>();
    String titulo,titulox,tituloy;
    
public void variablesGloblales(ArrayList<VariableGlobal> list){
    this.variablesGlobales = list;        
}
public int retornarIndice(String var){
    for(int i=0; i < variablesGlobales.size(); i++){
            if(variablesGlobales.get(i).id.equalsIgnoreCase(var)){
            return i;
            }
        }
    return 0;
}
public boolean perteneceaGlobales(String var){
    for(int i=0; i < variablesGlobales.size(); i++){
        if((variablesGlobales.get(i).id).equalsIgnoreCase(var)){
            return true; 
        }
    }
    return false;
}     
  
    public void variablestitulosX(ArrayList<String> valx ){
        for(int j=0; j < valx.size(); j++){
            if(perteneceaGlobales(valx.get(j))==true){
                if(variablesGlobales.get(retornarIndice(valx.get(j))).tipo.equalsIgnoreCase("string")){
                    String temp = (variablesGlobales.get(retornarIndice(valx.get(j))).val).toString();
                    valx.set(j,temp);
                }else if(variablesGlobales.get(retornarIndice(valx.get(j))).tipo.equalsIgnoreCase("double")){
                    String tempo= String.valueOf(variablesGlobales.get(retornarIndice(valx.get(j))).val);
                    valx.set(j,tempo);
                }
            }
           
        }
        System.out.println(valx);
    }
      public void variablestitulosY(ArrayList<String> valy ){
          for(int j=0; j < valy.size(); j++){
            if(perteneceaGlobales(valy.get(j))==true){
                if(variablesGlobales.get(retornarIndice(valy.get(j))).tipo.equalsIgnoreCase("string")){
                    String temp = (variablesGlobales.get(retornarIndice(valy.get(j))).val).toString();
                    valy.set(j,temp);
                }else if(variablesGlobales.get(retornarIndice(valy.get(j))).tipo.equalsIgnoreCase("double")){
                    String tempo= String.valueOf(variablesGlobales.get(retornarIndice(valy.get(j))).val);
                    valy.set(j,tempo);
                }
            }
           
        }
        System.out.println(valy);
    }
    public void Titulos(String tituloxz,String tituloxx,String tituloyx){
        this.titulo = tituloxz;
        this.titulox = tituloxx;
        this.tituloy = tituloyx;
        
        if(perteneceaGlobales(titulo)==true){
            if(variablesGlobales.get(retornarIndice(titulo)).tipo.equalsIgnoreCase("string")){
                    String temp = (variablesGlobales.get(retornarIndice(titulo)).val).toString();
                    this.titulo = temp;
                }else if(variablesGlobales.get(retornarIndice(titulo)).tipo.equalsIgnoreCase("double")){
                    String tempo= String.valueOf(variablesGlobales.get(retornarIndice(titulo)).val);
                    this.titulo = tempo;
                }
        }
        if(perteneceaGlobales(titulox)==true){
            if(variablesGlobales.get(retornarIndice(titulox)).tipo.equalsIgnoreCase("string")){
                    String temp = (variablesGlobales.get(retornarIndice(titulox)).val).toString();
                    this.titulox = temp;
                }else if(variablesGlobales.get(retornarIndice(titulox)).tipo.equalsIgnoreCase("double")){
                    String tempo= String.valueOf(variablesGlobales.get(retornarIndice(titulox)).val);
                    this.titulox = tempo;
                }
        }
        if(perteneceaGlobales(tituloy)==true){
            if(variablesGlobales.get(retornarIndice(tituloy)).tipo.equalsIgnoreCase("string")){
                    String temp = (variablesGlobales.get(retornarIndice(tituloy)).val).toString();
                    this.tituloy = temp;
                }else if(variablesGlobales.get(retornarIndice(tituloy)).tipo.equalsIgnoreCase("double")){
                    String tempo= String.valueOf(variablesGlobales.get(retornarIndice(tituloy)).val);
                    this.tituloy = tempo;
                }
        }
        System.out.println(titulo+titulox+tituloy);
    }
    
}
