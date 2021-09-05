//Paquetes e importaciones
/*Imports and define package*/
package Analyzers;
import java_cup.runtime.Symbol; 
import Interfaz.Interfaz;

%%
//Area de directivas de jflex
/*Define how will works our scanner*/
%class Scanner /*Class name will be Scanner*/
%public /*Will be public*/
%line /*Count of lines*/
%column /*Count of columns*/
%full
%char /*Count of recognized characters*/
%cup /*Will works with cup*/
%unicode /*Set of characters is unicode*/
%ignorecase /*Will be ignore case; Example: Compi1 equals cOmpI1*/



%init{ 
   /*Constructor
	*you can declare variables for example String x = ""; or instance Objects
	*/
%init} 


/*Section or regular expressions EXPRESIONES REGULARES */
WHITE = [ \r\t]+
NUMBER = [0-9]+
DECIMAL = [0-9]+("."[0-9]+)?
COMENTARIOUNILINEA = ("##".*\r\n)|("##".*\r)|("##".*\n)
COMENTARIOMULTILINEA =  "#*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*#"
CARACTERESVARIABLES=[A-Za-z]+["_"0-9A-Za-z]*
CADENACOMILLAS = \"([^\"])+\"
CADENACOMILLASSIMPLE = \'([^\'])+\'

%%

/*
	Sym.* will be the name of the token
	yytext() is the actual value
*/
"GENERARREPORTEESTADISTICO" {return new Symbol(sym.RGENERARREPORTEESTADISTICO,yycolumn+1,yyline+1,yytext());}
"COMPARE" {return new Symbol(sym.COMPARE,yycolumn+1,yyline+1,yytext());}

//SIMBOLOS A UTILIZAR
"{" {return new Symbol(sym.LLALEFT,yycolumn+1,yyline+1,yytext());}
"}" {return new Symbol(sym.LLARIGHT,yycolumn+1,yyline+1,yytext());}
"[" {return new Symbol(sym.COLEFT,yycolumn+1,yyline+1,yytext());}
"]" {return new Symbol(sym.CORIGHT,yycolumn+1,yyline+1,yytext());}
"(" {return new Symbol(sym.PARLEFT,yycolumn+1,yyline+1, yytext());} 
")" {return new Symbol(sym.PARRIGHT,yycolumn+1,yyline+1, yytext());} 

"+" {return new Symbol(sym.ADD,yycolumn+1,yyline+1, yytext());} 
"-" {return new Symbol(sym.MINUS,yycolumn+1,yyline+1, yytext());} 
"*" {return new Symbol(sym.TIMES,yycolumn+1,yyline+1, yytext());} 
"/" {return new Symbol(sym.DIV,yycolumn+1,yyline+1, yytext());}
";" {return new Symbol(sym.PCOMA,yycolumn+1,yyline+1,yytext());}
":" {return new Symbol(sym.DOSPUNTOS,yycolumn+1,yyline+1,yytext());}
"," {return new Symbol(sym.COMA,yycolumn+1,yyline+1,yytext());}
"=" {return new Symbol(sym.IGUAL,yycolumn+1,yyline+1,yytext());}
"${PUNTAJEGENERAL};" {return new Symbol(sym.PUNTAJEGENERAL,yycolumn+1,yyline+1,yytext());}
"STRING" {return new Symbol(sym.STRING,yycolumn+1,yyline+1,yytext());}
"DOUBLE" {return new Symbol(sym.DOUBLE,yycolumn+1,yyline+1,yytext());}
"DEFINIRGLOBALES" {return new Symbol(sym.DEFINIRGLOBALES,yycolumn+1,yyline+1,yytext());}
"GRAFICABARRAS" {return new Symbol(sym.GRAFICADEBARRAS,yycolumn+1,yyline+1,yytext());}
"GRAFICALINEAS" {return new Symbol(sym.GRAFICALINEAS,yycolumn+1,yyline+1,yytext());}

"GRAFICAPIE" {return new Symbol(sym.GRAFICAPIE,yycolumn+1,yyline+1,yytext());}
"TITULO" {return new Symbol(sym.TITULO,yycolumn+1,yyline+1,yytext());}
"EJEX" {return new Symbol(sym.EJEX,yycolumn+1,yyline+1,yytext());}
"TITULOY" {return new Symbol(sym.TITULOY,yycolumn+1,yyline+1,yytext());}
"TITULOX" {return new Symbol(sym.TITULOX,yycolumn+1,yyline+1,yytext());}
"VALORES" {return new Symbol(sym.VALORES,yycolumn+1,yyline+1,yytext());}
"ARCHIVO" {return new Symbol(sym.ARCHIVO,yycolumn+1,yyline+1,yytext());}

{WHITE} {}
//SIMBOLOS DE LAS EXPRESIONES REGULARES
{NUMBER} {return new Symbol(sym.NUMBER,yycolumn+1,yyline+1, yytext());} 
{DECIMAL} {return new Symbol(sym.DECIMAL,yycolumn+1,yyline+1, yytext());} 
//{CARACTERES} {return new Symbol(sym.CARACTERES,yycolumn+1,yyline+1,yytext());}
{CARACTERESVARIABLES} {return new Symbol(sym.CARACTERESVARIABLES,yycolumn+1,yyline+1,yytext());}
{CADENACOMILLAS} {return new Symbol(sym.CADENACOMILLAS,yycolumn+1,yyline+1,yytext());}
{CADENACOMILLASSIMPLE} {return new Symbol(sym.CADENACOMILLASSIMPLE,yycolumn+1,yyline+1,yytext());}

\*Ignore white spaces*\
{WHITE} {}
{COMENTARIOUNILINEA} {}
{COMENTARIOMULTILINEA} {}

\n {yychar=1;}

//Errores lexicos
. {
    Interfaz.Consolelog("Lexical error: "+yytext()+ " Linea: "+yyline+" Columna: "+yycolumn);
}

