/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablesFCA;

/**
 *
 * @author marvi
 */
public class Declaracion_Asignacion implements EjecutarInstruccion{
    private final String id;
    Variables.Tipo tipo;
    private final Operacion valor;
    
    /**
     * Constructor de la clase para declarar y asignar al mismo tiempo
     * @param id identificador de la variable que sera declarada
     * @param tipo tipo de la clase que sera declarada
     * @param val valor que se le asignara
     */
    public Declaracion_Asignacion(String id, Variables.Tipo tipo, Operacion val){
        this.id = id;
        this.tipo = tipo;
        this.valor = val;        
    }
    /**
     * 
     * @param tv
     * @return 
     */
    @Override
    public Object ejecutar(TablaDeVariables tv){
        tv.add(new Variables(id,tipo));
        tv.setValor(id, valor.ejecutar(tv));
        return null;
    } 
}
