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
"{" {return new Symbol(sym.LLALEFT,yytext());}
"}" {return new Symbol(sym.LLARIGHT,yytext());}
"(" {return new Symbol(sym.PARLEFT, yytext());} 
")" {return new Symbol(sym.PARRIGHT, yytext());} 
"," {return new Symbol(sym.COMA,yytext());}
";" {return new Symbol(sym.PCOMA,yytext());}
":" {return new Symbol(sym.DOSPUNTOS,yytext());}
"=" {return new Symbol(sym.IGUAL,yytext());}
"!" {return new Symbol(sym.ADMIR,yytext());}
"<" {return new Symbol(sym.MENOR,yytext());}
">" {return new Symbol(sym.MAYOR,yytext());}
"&&" {return new Symbol(sym.AND,yytext());}
"||" {return new Symbol(sym.OR,yytext());}
"!" {return new Symbol(sym.NEGACION,yytext());}
"!(" {return new Symbol(sym.NOTPAR,yytext());} //Se creo ya que en el ciclo while no permitia usar la NEGACION de arriba xd
"+" {return new Symbol(sym.MAS,yytext());}
"-" {return new Symbol(sym.MENOS,yytext());}
"*" {return new Symbol(sym.POR,yytext());}
"/" {return new Symbol(sym.DIVISION,yytext());}
"**" {return new Symbol(sym.POTENCIA,yytext());}
"%" {return new Symbol(sym.MODULO,yytext());}



"class" {return new Symbol(sym.CLASS,yytext());}
"var" {return new Symbol(sym.VAR,yytext());}
"let" {return new Symbol(sym.LET,yytext());}
"const" {return new Symbol(sym.CONST,yytext());}
"if" {return new Symbol(sym.IF,yytext());}
"else" {return new Symbol(sym.ELSE,yytext());}
"for" {return new Symbol(sym.FOR,yytext());}
"while" {return new Symbol(sym.WHILE,yytext());}
"do" {return new Symbol(sym.DO,yytext());}
"switch" {return new Symbol(sym.SWITCH,yytext());} 
"case" {return new Symbol(sym.CASE,yytext());}
"break" {return new Symbol(sym.BREAK,yytext());}
"default" {return new Symbol(sym.DEFAULT,yytext());}
"require" {return new Symbol(sym.REQUIRE,yytext());}
"console.log" {return new Symbol(sym.PRINT,yytext());}



{WHITE} {}
//SIMBOLOS DE LAS EXPRESIONES REGULARES
{NUMBER} {return new Symbol(sym.NUMBER, yytext());} 
{DECIMAL} {return new Symbol(sym.DECIMAL, yytext());} 
{CARACTERESVARIABLES} {return new Symbol(sym.CARACTERESVARIABLES,yytext());}
{CADENACOMILLAS} {return new Symbol(sym.CADCOM,yytext());}
{CADENACOMILLASSIMPLE} {return new Symbol(sym.CADCOMSIM,yytext());}
\*Ignore white spaces*\
{WHITE} {}
{COMENTARIOUNILINEA} {}
{COMENTARIOMULTILINEA} {}

\n {yychar=1;}

//Errores lexicos
. {
    Interfaz.Consolelog("Lexical errorjs: "+yytext()+ " Linea: "+yyline+" Columna: "+yycolumn);
}


