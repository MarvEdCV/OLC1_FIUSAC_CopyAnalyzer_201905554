/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablesFCA;

import java.util.LinkedList;

/**
 *
 * @author marvi
 */
public class Variables{
    private final Tipo tipo;
    private final String id;
    private Object valor; 
    
    public Variables(String id, Tipo tipo){
        this.tipo = tipo;
        this.id = id;
    }
     /**
     * Método que devuelve el identificador de la variable almacenada en el símbolo.
     * @return Identificador de la variable
     */
    public String getId(){
        return id;
    }
     /**
     * Método que devuelve el valor que almacena la variable.
     * @return Valor de la variable
     */
    public Object getValor(){
        return valor;
    }
    /* Método que asigna un nuevo valor a la variable.
     * @param val es el nuevo valor para la variable.
     */
    void setValor(Object val){
        valor = val;
    }
    
    /**
     * Enumeración que lista todos los tipos de variable reconocidos en el lenguaje fca.
     */
    public static enum Tipo{
        CADENA,
        DECIMAL
    }
    
    
   
    
}
