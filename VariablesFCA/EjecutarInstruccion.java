/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablesFCA;

/**
 * Clase abstracta o de interfaz que ejecuta todas las instrucciones para la ejecucion de las variables
 * cuenta con un unico metodo que sera sobrescrito en todas las instrucciones de las clases hijas de esta interfaz.
 * @author marvi
 */
public interface EjecutarInstruccion {
    /**
     * Metodo que ejecuta la accion de la instruccion que la implemente
     * @param tv tabla de variables 
     * @return Retorna nulo cuando la sentencia no produce valor al ser ejecutada
     */
    public Object ejecutar(TablaDeVariables tv);
}

