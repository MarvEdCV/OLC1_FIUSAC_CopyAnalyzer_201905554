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
"GENERARREPORTEESTADISTICO" {return new Symbol(sym.RGENERARREPORTEESTADISTICO,yytext());}
"COMPARE" {return new Symbol(sym.COMPARE,yytext());}

//SIMBOLOS A UTILIZAR
"{" {return new Symbol(sym.LLALEFT,yytext());}
"}" {return new Symbol(sym.LLARIGHT,yytext());}
"[" {return new Symbol(sym.COLEFT,yytext());}
"]" {return new Symbol(sym.CORIGHT,yytext());}
"(" {return new Symbol(sym.PARLEFT, yytext());} 
")" {return new Symbol(sym.PARRIGHT, yytext());} 

"+" {return new Symbol(sym.ADD, yytext());} 
"-" {return new Symbol(sym.MINUS, yytext());} 
"*" {return new Symbol(sym.TIMES, yytext());} 
"/" {return new Symbol(sym.DIV, yytext());}
";" {return new Symbol(sym.PCOMA,yytext());}
":" {return new Symbol(sym.DOSPUNTOS,yytext());}
"," {return new Symbol(sym.COMA,yytext());}
"=" {return new Symbol(sym.IGUAL,yytext());}
"${PUNTAJEGENERAL};" {return new Symbol(sym.PUNTAJEGENERAL,yytext());}
"STRING" {return new Symbol(sym.STRING,yytext());}
"DOUBLE" {return new Symbol(sym.DOUBLE,yytext());}
"DEFINIRGLOBALES" {return new Symbol(sym.DEFINIRGLOBALES,yytext());}
"GRAFICABARRAS" {return new Symbol(sym.GRAFICADEBARRAS,yytext());}
"GRAFICALINEAS" {return new Symbol(sym.GRAFICALINEAS,yytext());}

"GRAFICAPIE" {return new Symbol(sym.GRAFICAPIE,yytext());}
"TITULO" {return new Symbol(sym.TITULO,yytext());}
"EJEX" {return new Symbol(sym.EJEX,yytext());}
"TITULOY" {return new Symbol(sym.TITULOY,yytext());}
"TITULOX" {return new Symbol(sym.TITULOX,yytext());}
"VALORES" {return new Symbol(sym.VALORES,yytext());}
"ARCHIVO" {return new Symbol(sym.ARCHIVO,yytext());}

{WHITE} {}
//SIMBOLOS DE LAS EXPRESIONES REGULARES
{NUMBER} {return new Symbol(sym.NUMBER, yytext());} 
{DECIMAL} {return new Symbol(sym.DECIMAL, yytext());} 
//{CARACTERES} {return new Symbol(sym.CARACTERES,yytext());}
{CARACTERESVARIABLES} {return new Symbol(sym.CARACTERESVARIABLES,yytext());}
{CADENACOMILLAS} {return new Symbol(sym.CADENACOMILLAS,yytext());}
{CADENACOMILLASSIMPLE} {return new Symbol(sym.CADENACOMILLASSIMPLE,yytext());}

\*Ignore white spaces*\
{WHITE} {}
{COMENTARIOUNILINEA} {}
{COMENTARIOMULTILINEA} {}

\n {yychar=1;}

//Errores lexicos
. {
    Interfaz.Consolelog("Lexical error: "+yytext()+ " Linea: "+yyline+" Columna: "+yycolumn);
}

