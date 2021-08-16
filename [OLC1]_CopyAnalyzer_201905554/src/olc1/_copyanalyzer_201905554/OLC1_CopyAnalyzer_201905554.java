/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc1._copyanalyzer_201905554;

import Analyzers.Parser;
import Analyzers.Scanner;
import java.io.BufferedReader;
import java.io.StringReader;

/**
 *
 * @author marvi
 */
public class OLC1_CopyAnalyzer_201905554 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
			String texto =  "10+5*565+64.5+(-5)";
			System.out.println("Iniciando analisis...");
			Scanner scanner = new Scanner(new BufferedReader(new StringReader(texto)));
			Parser parser = new Parser(scanner);
			parser.parse();
			System.out.println("Finalizando analisis...");
		} catch (Exception e) {
		}
    }
}
    
