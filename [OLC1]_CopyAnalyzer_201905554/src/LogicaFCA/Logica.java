/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaFCA;

import Interfaz.Interfaz;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author marvi
 */
public class Logica  {
    ArrayList <VariableGlobal> variablesGlobales = new ArrayList<>();
    ArrayList <String> listax = new ArrayList<>();
    ArrayList <String> listay = new ArrayList<>();
    String titulo,titulox,tituloy,titulopie,titulolineas,archivo;
    
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
  
public ArrayList<String>  variablestitulosX(ArrayList<String> valx ){
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
        listax = valx;
        return valx;
    }
      public ArrayList<String> variablestitulosY(ArrayList<String> valy ){
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
        
        listay = valy;
        return valy;
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
    }
    
    public void GraficaBarras(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (int i = 0; i < listax.size(); i++) {
            String titley = listay.get(i); 
            dataset.setValue(Double.valueOf(titley), "JAVA", listax.get(i));
        }
        
        JFreeChart chart = ChartFactory.createBarChart(
                titulo,
                titulox, 
                tituloy, 
                dataset, 
                PlotOrientation.VERTICAL,
                true, 
                true, 
                false
        );
        ChartFrame frame = new ChartFrame("Copy Analyzer Grafica de barras -- 201905554", chart);
        frame.pack();
        frame.setVisible(true);
        
        Interfaz.Consolelog("¡Grafica de BARRAS generada con exito!");
    }
    
    public void GraficaPie(ArrayList<String> valxpie,ArrayList<String> valypie){
        ArrayList<String> listax = variablestitulosX(valxpie);
        ArrayList<String> listay = variablestitulosY(valypie);
        if(perteneceaGlobales(titulopie)==true){
         if(variablesGlobales.get(retornarIndice(titulopie)).tipo.equalsIgnoreCase("string")){
                 String temp = (variablesGlobales.get(retornarIndice(titulopie)).val).toString();
                 this.titulopie = temp;
             }else if(variablesGlobales.get(retornarIndice(titulopie)).tipo.equalsIgnoreCase("double")){
                 String tempo= String.valueOf(variablesGlobales.get(retornarIndice(titulopie)).val);
                 this.titulopie = tempo;
             }
        }
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        for (int i = 0; i < listax.size(); i++) {
            Double valoresD = Double.valueOf(listay.get(i));
            pieDataset.setValue(listax.get(i), valoresD);
        }
        
        JFreeChart chart = ChartFactory.createPieChart(
                this.titulo,
                pieDataset,
                true,
                true,
                false
        );

        //Mostramos la grafica en pantalla
        ChartFrame frame = new ChartFrame("Copy Analyzer Grafica de pie -- 201905554", chart);
        frame.pack();
        frame.setVisible(true);
        
        Interfaz.Consolelog("¡Grafica de PIE generada con exito!");
    
    }
    
    public void GraficaLineas(String titulolineasx, String archivo){
         this.titulolineas = titulolineasx;
         this.archivo = archivo;
            //grafica
        String n;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        double poblacion = 25;
        int esperanza_de_vida = 5;
        double defunciones;
        double poblacion_neta;

        double tc = 0.2; // tasa de crecimiento 20%
        double tm = 0.4; // tasa de mortalidad 40%

        /*for (int tiempo = 0; tiempo < esperanza_de_vida; tiempo++) {

            //Crecimiento
            poblacion = poblacion * (1 + tc);
            dataset.addValue(poblacion, "Crecimiento", "" + tiempo);

            //Mortalidad
            defunciones = poblacion * tm;
            dataset.addValue(defunciones, "Mortalidad", "" + tiempo);

            //Crecimiento Neto
            poblacion_neta = poblacion - defunciones;
            dataset.addValue(poblacion_neta, "Crecimiento neto", "" + tiempo);

        }*/
        
        dataset.addValue(7, "ProyectoA", " " + 0);
        dataset.addValue(3, "ProyectoA", " " + 4);
        dataset.addValue(2, "ProyectoA", " " + 5);
        dataset.addValue(1, "ProyectoA", " " + 2);
        
        dataset.addValue(5, "ProyectoB", " " + 1);
        dataset.addValue(1, "ProyectoB", " " + 2);
        dataset.addValue(2, "ProyectoB", " " + 3);
        dataset.addValue(7, "ProyectoB", " " + 0);
        

        JFreeChart chart = ChartFactory.createLineChart(
                this.titulolineas,
                "",
                "",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
        
        //Mostramos la grafica en pantalla
        ChartFrame fr = new ChartFrame("Copy Analyzer Grafica de lineas -- 201905554", chart);
        fr.pack();
        fr.setVisible(true);
        
        Interfaz.Consolelog("¡Grafica de lineas generada con exito!");
    }

}

