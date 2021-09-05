//Paquetes e importaciones
/*Imports and define package*/
package AnalyzerJavascript;
import java_cup.runtime.Symbol; 
import Interfaz.Interfaz;

%%
//Area de directivas de jflex
/*Define how will works our scanner*/
%class Scannerjs /*Class name will be Scanner*/
%public /*Will be public*/
%line /*Count of lines*/
%column /*Count of columns*/
%full
%char /*Count of recognized characters*/
%cup /*Will works with cup*/
%unicode /*Set of characters is unicode*/



%init{ 
   /*Constructor
	*you can declare variables for example String x = ""; or instance Objects
	*/
%init} 


/*Section or regular expressions EXPRESIONES REGULARES */
WHITE = [ \r\t]+
NUMBER = [0-9]+
DECIMAL = [0-9]+("."[0-9]+)?
COMENTARIOUNILINEA = ("//".*\r\n)|("//".*\n)|("//".*\r)
COMENTARIOMULTILINEA =  "/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"
CARACTERESVARIABLES=[A-Za-z]+["_"0-9A-Za-z]*
CADENACOMILLAS = \"([^\"])*\"
CADENACOMILLASSIMPLE = \'([^\'])*\'

%%

/*
	Sym.* will be the name of the token
	yytext() is the actual value
*/
//Simbolos a utilizar
"{" {return new Symbol(sym.LLALEFT,yycolumn+1,yyline+1,yytext());}
"}" {return new Symbol(sym.LLARIGHT,yycolumn+1,yyline+1,yytext());}
"(" {return new Symbol(sym.PARLEFT,yycolumn+1,yyline+1, yytext());} 
")" {return new Symbol(sym.PARRIGHT,yycolumn+1,yyline+1, yytext());} 
"," {return new Symbol(sym.COMA,yycolumn+1,yyline+1,yytext());}
";" {return new Symbol(sym.PCOMA,yycolumn+1,yyline+1,yytext());}
":" {return new Symbol(sym.DOSPUNTOS,yycolumn+1,yyline+1,yytext());}
"=" {return new Symbol(sym.IGUAL,yycolumn+1,yyline+1,yytext());}
"!" {return new Symbol(sym.ADMIR,yycolumn+1,yyline+1,yytext());}
"<" {return new Symbol(sym.MENOR,yycolumn+1,yyline+1,yytext());}
">" {return new Symbol(sym.MAYOR,yycolumn+1,yyline+1,yytext());}
"&&" {return new Symbol(sym.AND,yycolumn+1,yyline+1,yytext());}
"||" {return new Symbol(sym.OR,yycolumn+1,yyline+1,yytext());}
"!" {return new Symbol(sym.NEGACION,yycolumn+1,yyline+1,yytext());}
"!(" {return new Symbol(sym.NOTPAR,yycolumn+1,yyline+1,yytext());} //Se creo ya que en el ciclo while no permitia usar la NEGACION de arriba xd
"+" {return new Symbol(sym.MAS,yycolumn+1,yyline+1,yytext());}
"-" {return new Symbol(sym.MENOS,yycolumn+1,yyline+1,yytext());}
"*" {return new Symbol(sym.POR,yycolumn+1,yyline+1,yytext());}
"/" {return new Symbol(sym.DIVISION,yycolumn+1,yyline+1,yytext());}
"**" {return new Symbol(sym.POTENCIA,yycolumn+1,yyline+1,yytext());}
"%" {return new Symbol(sym.MODULO,yycolumn+1,yyline+1,yytext());}



"class" {return new Symbol(sym.CLASS,yycolumn+1,yyline+1,yytext());}
"var" {return new Symbol(sym.VAR,yycolumn+1,yyline+1,yytext());}
"let" {return new Symbol(sym.LET,yycolumn+1,yyline+1,yytext());}
"const" {return new Symbol(sym.CONST,yycolumn+1,yyline+1,yytext());}
"if" {return new Symbol(sym.IF,yycolumn+1,yyline+1,yytext());}
"else" {return new Symbol(sym.ELSE,yycolumn+1,yyline+1,yytext());}
"for" {return new Symbol(sym.FOR,yycolumn+1,yyline+1,yytext());}
"while" {return new Symbol(sym.WHILE,yycolumn+1,yyline+1,yytext());}
"do" {return new Symbol(sym.DO,yycolumn+1,yyline+1,yytext());}
"switch" {return new Symbol(sym.SWITCH,yycolumn+1,yyline+1,yytext());} 
"case" {return new Symbol(sym.CASE,yycolumn+1,yyline+1,yytext());}
"break" {return new Symbol(sym.BREAK,yycolumn+1,yyline+1,yytext());}
"default" {return new Symbol(sym.DEFAULT,yycolumn+1,yyline+1,yytext());}
"require" {return new Symbol(sym.REQUIRE,yycolumn+1,yyline+1,yytext());}
"console.log" {return new Symbol(sym.PRINT,yycolumn+1,yyline+1,yytext());}



{WHITE} {}
//SIMBOLOS DE LAS EXPRESIONES REGULARES
{NUMBER} {return new Symbol(sym.NUMBER,yycolumn+1,yyline+1, yytext());} 
{DECIMAL} {return new Symbol(sym.DECIMAL,yycolumn+1,yyline+1, yytext());} 
{CARACTERESVARIABLES} {return new Symbol(sym.CARACTERESVARIABLES,yycolumn+1,yyline+1,yytext());}
{CADENACOMILLAS} {return new Symbol(sym.CADCOM,yycolumn+1,yyline+1,yytext());}
{CADENACOMILLASSIMPLE} {return new Symbol(sym.CADCOMSIM,yycolumn+1,yyline+1,yytext());}
\*Ignore white spaces*\
{WHITE} {}
{COMENTARIOUNILINEA} {}
{COMENTARIOMULTILINEA} {}

\n {yychar=1;}

//Errores lexicos
. {
    Interfaz.Consolelog("Lexical errorjs: "+yytext()+ " Linea: "+(yyline+1)+" Columna: "+(yycolumn+1));
}


