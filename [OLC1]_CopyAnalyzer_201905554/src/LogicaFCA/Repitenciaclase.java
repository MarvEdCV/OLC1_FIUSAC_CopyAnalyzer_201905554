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
public class Repitenciaclase {
    String idclase;
    ArrayList<Repitenciametodo> metodorepetido = new ArrayList<>();
    int lineasdebloque;
    
    public Repitenciaclase(String a,ArrayList<Repitenciametodo> b,int i){
        this.idclase = a;
        this.metodorepetido = b;
        this.lineasdebloque = i;
    }
}
