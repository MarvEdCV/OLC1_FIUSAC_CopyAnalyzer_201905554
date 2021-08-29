/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablesFCA;

import Interfaz.Interfaz;
import java.util.LinkedList;

/**
 *
 * @author marvi
 */
public class TablaDeVariables extends LinkedList<Variables> {
    /**
     * Constructor que llama al constructor de la clase padre que es el de LinkedList
     */
    public TablaDeVariables(){
        super();
    }
    /**
     * Metodo que devuelve el valor de la variable
     * @param id nombre de la variable que quiere buscarse
     * @return Valor de la variable que se buscaba, si no la encuentra no deuelve nada mas que un aviso
     */
   
    Object getValor(String id){
        for(Variables s:this){
            if(s.getId().equals(id)){
                return s.getValor();
        }
        }
        Interfaz.Consolelog("La variable "+id+" no existe.");
        return "Desconocido";
    }
    /**
     * Metodo que asigna un valor a una variable, si esta ya se ha declarado 
     * @param id
     * @param val 
     */
    void setValor(String id, Object val){
        for(Variables s:this){
            if(s.getId().equals(id)){
                s.setValor(val);
                return;
            }
        }
        Interfaz.Consolelog("La variable "+id+" no esta declarada, por lo cual no se le podra asignar ningun valor!!");        
    }
       
}
