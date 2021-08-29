/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlmacenadorDeSimbolos;

import java.util.LinkedList;

/**
 *
 * @author marvi
 */
public class Declarar extends LinkedList<Object>{
    private String id;
    private Object valor;
    private String tipo;
    
    /**
     * Constuctor para crear una variable
     * @param id
     * @param valor
     * @param tipo 
     */
    public Declarar(String id,Object valor,String tipo){
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }
    
    
}
