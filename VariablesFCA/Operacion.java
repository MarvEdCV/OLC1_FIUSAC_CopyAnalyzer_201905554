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
public class Operacion implements EjecutarInstruccion {
    /**
     * Enumeracion del tipo de operacion que puede ejecutarse para la clase.
     */
    public static enum TipoOperacion{
        DECIMAL,
        CADENA
    }
    /**
     * Valor especifico si se trata de un numero, decimal o cadena.
     */
    private Object valor;
    /**
     * Tipo de operacion a ejecutar.
     */
    private final TipoOperacion tipo;
    
    /**
     * Constructor para cadenas
     * @param c Cadena que representa la operacion
     * @param tipo Tipo de operacion
     */
   public Operacion(String c, TipoOperacion tipo){
       this.valor = c;
       this.tipo = tipo;
   }
   /**
    * Constructor para numeros, ya sean enteros o decimales
    * @param a Valor de tipo double 
    */
   public Operacion(Double a){
       this.valor = a;
       this.tipo = TipoOperacion.DECIMAL;
   }
   /**
    *Metodo que ejecuta la instruccion de una operacion 
    * @param tv tabla de variables
    * @return Retorna el valor de lo que se ejecuto.
    */
   @Override
   public Object ejecutar(TablaDeVariables tv){
       if(tipo ==  TipoOperacion.CADENA){
           return valor.toString();
       }
       else if(tipo == TipoOperacion.DECIMAL){
           return new Double(valor.toString());
       }else{
           return null;
       }
   }
   
   
}
