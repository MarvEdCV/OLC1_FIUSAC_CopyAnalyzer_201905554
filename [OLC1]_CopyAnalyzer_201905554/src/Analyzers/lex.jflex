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
COMENTARIOUNILINEA = (.*"##".*\r\n)|(.*"##".*\r)|(.*"##".*\n)
COMENTARIOMULTILINEA = "#*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*#"
%%

/*
	Sym.* will be the name of the token
	yytext() is the actual value
*/
//SIMBOLOS A UTILIZAR
"(" {return new Symbol(sym.PARLEFT, yytext());} 
")" {return new Symbol(sym.PARRIGHT, yytext());} 

"+" {return new Symbol(sym.ADD, yytext());} 
"-" {return new Symbol(sym.MINUS, yytext());} 
"*" {return new Symbol(sym.TIMES, yytext());} 
"/" {return new Symbol(sym.DIV, yytext());}

//SIMBOLOS DE LAS EXPRESIONES REGULARES
{NUMBER} {return new Symbol(sym.NUMBER, yytext());} 
{DECIMAL} {return new Symbol(sym.DECIMAL, yytext());} 

\*Ignore white spaces*\
{WHITE} {}
{COMENTARIOUNILINEA} {}
{COMENTARIOMULTILINEA} {}
\n {yychar=1;}

//Errores lexicos
. {
    Interfaz.Consolelog("Lexical error: "+yytext()+ " Linea: "+yyline+" Columna: "+yycolumn);
}


