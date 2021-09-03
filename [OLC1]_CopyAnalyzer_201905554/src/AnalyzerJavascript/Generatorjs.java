/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalyzerJavascript;

/**
 *
 * @author marvi
 */
public class Generatorjs {
      public static void main(String[] args) {
        try {
            
			String ruta =  "src/AnalyzerJavascript/";
			String opcFlex[] =  {ruta+"lexjs.jflex","-d",ruta};
			jflex.Main.generate(opcFlex);
			
			String opcCup[] =  {"-destdir", ruta,"-parser","Parserjs",ruta+"parserjs.cup"};
			java_cup.Main.main(opcCup);
        } catch (Exception e) {
        }
    }
}
