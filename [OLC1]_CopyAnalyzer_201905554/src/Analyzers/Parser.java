
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analyzers;

import java_cup.runtime.*;
import Interfaz.Interfaz;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
<<<<<<< HEAD
    "\000\033\000\002\002\004\000\002\002\003\000\002\002" +
    "\003\000\002\003\006\000\002\006\004\000\002\006\003" +
    "\000\002\006\003\000\002\005\006\000\002\005\004\000" +
    "\002\012\004\000\002\012\004\000\002\012\003\000\002" +
    "\012\003\000\002\012\003\000\002\011\007\000\002\010" +
    "\007\000\002\007\010\000\002\007\003\000\002\004\004" +
    "\000\002\004\006\000\002\004\006\000\002\004\006\000" +
    "\002\004\006\000\002\004\006\000\002\004\003\000\002" +
    "\004\003\000\002\004\003" });
=======
    "\000\022\000\002\002\004\000\002\002\003\000\002\002" +
    "\003\000\002\003\006\000\002\006\004\000\002\006\003" +
    "\000\002\006\003\000\002\005\004\000\002\007\014\000" +
    "\002\007\003\000\002\004\004\000\002\004\006\000\002" +
    "\004\006\000\002\004\006\000\002\004\006\000\002\004" +
    "\006\000\002\004\003\000\002\004\003" });
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
<<<<<<< HEAD
    "\000\050\000\006\003\007\020\005\001\002\000\004\002" +
    "\052\001\002\000\004\006\010\001\002\000\004\002\000" +
    "\001\002\000\004\002\uffff\001\002\000\010\003\013\021" +
    "\012\031\014\001\002\000\012\003\013\007\ufffc\021\012" +
    "\031\014\001\002\000\006\004\041\033\042\001\002\000" +
    "\004\007\ufffb\001\002\000\004\006\017\001\002\000\004" +
    "\007\016\001\002\000\004\002\ufffe\001\002\000\010\003" +
    "\023\027\020\030\021\001\002\000\004\024\035\001\002" +
    "\000\004\024\031\001\002\000\010\007\ufff6\027\ufff6\030" +
    "\ufff6\001\002\000\010\007\ufff4\027\ufff4\030\ufff4\001\002" +
    "\000\010\007\ufff5\027\ufff5\030\ufff5\001\002\000\010\007" +
    "\027\027\020\030\021\001\002\000\010\007\ufff8\027\ufff8" +
    "\030\ufff8\001\002\000\012\003\ufffa\007\ufffa\021\ufffa\031" +
    "\ufffa\001\002\000\010\007\ufff7\027\ufff7\030\ufff7\001\002" +
    "\000\004\026\032\001\002\000\004\015\033\001\002\000" +
    "\004\017\034\001\002\000\010\007\ufff2\027\ufff2\030\ufff2" +
    "\001\002\000\004\026\036\001\002\000\004\032\037\001" +
    "\002\000\004\017\040\001\002\000\010\007\ufff3\027\ufff3" +
    "\030\ufff3\001\002\000\006\004\041\033\042\001\002\000" +
    "\016\003\ufff0\005\ufff0\007\ufff0\021\ufff0\022\ufff0\031\ufff0" +
    "\001\002\000\012\003\ufff9\007\ufff9\021\ufff9\031\ufff9\001" +
    "\002\000\004\022\045\001\002\000\006\004\041\033\042" +
    "\001\002\000\004\005\047\001\002\000\004\017\050\001" +
    "\002\000\016\003\ufff1\005\ufff1\007\ufff1\021\ufff1\022\ufff1" +
    "\031\ufff1\001\002\000\004\007\ufffd\001\002\000\004\002" +
    "\001\001\002" });
=======
    "\000\031\000\006\003\007\020\005\001\002\000\004\002" +
    "\033\001\002\000\004\006\010\001\002\000\004\002\000" +
    "\001\002\000\004\002\uffff\001\002\000\006\003\013\021" +
    "\012\001\002\000\010\003\013\007\ufffc\021\012\001\002" +
    "\000\006\004\016\024\020\001\002\000\004\007\ufffb\001" +
    "\002\000\004\007\015\001\002\000\004\002\ufffe\001\002" +
    "\000\004\023\021\001\002\000\010\003\ufffa\007\ufffa\021" +
    "\ufffa\001\002\000\012\003\ufff8\007\ufff8\021\ufff8\023\ufff8" +
    "\001\002\000\006\004\016\024\020\001\002\000\004\023" +
    "\023\001\002\000\004\022\024\001\002\000\004\023\025" +
    "\001\002\000\006\004\016\024\020\001\002\000\004\023" +
    "\027\001\002\000\004\005\030\001\002\000\004\017\031" +
    "\001\002\000\012\003\ufff9\007\ufff9\021\ufff9\023\ufff9\001" +
    "\002\000\004\007\ufffd\001\002\000\004\002\001\001\002" +
    "" });
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
<<<<<<< HEAD
    "\000\050\000\006\002\003\003\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\005\010\006\014\001\001\000\006\005\010\006" +
    "\050\001\001\000\004\007\042\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\010\023\011\021\012\024\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\010\027\011\025\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
=======
    "\000\031\000\006\002\003\003\005\001\001\000\002\001" +
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\005\010\006\013\001\001\000\006\005\010\006" +
    "\031\001\001\000\004\007\016\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
<<<<<<< HEAD
    "\002\001\001\000\004\007\043\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\007\045\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });
=======
    "\002\001\001\000\002\001\001\000\004\007\021\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\007\025\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	/*Method that is called when parser can be recovered METODO QUE SE LLAMA AUTOMATICAMENTE ANTE ALGUN ERROR SINTACICO*/
	public void syntax_error(Symbol s){ 
        
        int fila = s.right;
        int columna = s.left;
        
        Interfaz.Consolelog("Error Sintactico Recuperado");
        Interfaz.Consolelog("\t\tLexema: "+s.value); 
        Interfaz.Consolelog("\t\tFila: "+fila); 
        Interfaz.Consolelog("\t\tColumna: "+columna); 
        Interfaz.Consolelog("Unexpected token: " +s.value); 

    }

	/*Method that is called when parser can't be recovered*/
	public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
     
        int fila = s.right;
        int columna = s.left;
        
        Interfaz.Consolelog("Error Sintactico, Modo Panico");
        Interfaz.Consolelog("\t\tLexema: "+s.value); 
        Interfaz.Consolelog("\t\tFila: "+fila); 
        Interfaz.Consolelog("\t\tColumna: "+columna);
    } 


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= generalinstruction 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ini ::= error 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // generalinstruction ::= RGENERARREPORTEESTADISTICO LLALEFT instructionrecursive LLARIGHT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("generalinstruction",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instructionrecursive ::= instruction instructionrecursive 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instructionrecursive",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instructionrecursive ::= instruction 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instructionrecursive",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instructionrecursive ::= error 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instructionrecursive",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
<<<<<<< HEAD
=======
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instruction ::= COMPARE expressioncompare 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruction",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expressioncompare ::= PARLEFT COMILLASIMPLE expressioncompare COMILLASIMPLE COMA COMILLASIMPLE expressioncompare COMILLASIMPLE PARRIGHT PCOMA 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		Interfaz.Consolelog("RUTA 1:"+a+" RUTA 2:"+b);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressioncompare",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expressioncompare ::= CARACTERES 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=c;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressioncompare",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
<<<<<<< HEAD
          case 7: // instruction ::= DEFINIRGLOBALES LLALEFT variables LLARIGHT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruction",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instruction ::= COMPARE expressioncompare 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruction",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // variables ::= variables string 
            {
              String RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variables",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // variables ::= variables double 
            {
              String RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variables",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // variables ::= string 
            {
              String RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variables",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // variables ::= double 
            {
              String RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variables",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // variables ::= error 
            {
              String RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("variables",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // string ::= STRING CARACTERESVARIABLES IGUAL CADENACOMILLAS PCOMA 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Interfaz.Consolelog("NOMBRE: "+a+"VALOR "+b);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("string",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // double ::= DOUBLE CARACTERESVARIABLES IGUAL DECIMAL PCOMA 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Interfaz.Consolelog("NOMBRE: "+a+"numero "+b);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("double",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expressioncompare ::= PARLEFT expressioncompare COMA expressioncompare PARRIGHT PCOMA 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Interfaz.Consolelog("RUTA 1:"+a+" RUTA 2:"+b);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressioncompare",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expressioncompare ::= CADENACOMILLASSIMPLE 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT=c;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressioncompare",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expression ::= MINUS expression 
=======
          case 10: // expression ::= MINUS expression 
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
            {
              Double RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double left = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = 0-left;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
<<<<<<< HEAD
          case 19: // expression ::= expression ADD expression PCOMA 
=======
          case 11: // expression ::= expression ADD expression PCOMA 
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
            {
              Double RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double left = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int rightleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int rightright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double right = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = left+right;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
<<<<<<< HEAD
          case 20: // expression ::= expression MINUS expression PCOMA 
=======
          case 12: // expression ::= expression MINUS expression PCOMA 
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
            {
              Double RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double left = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int rightleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int rightright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double right = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = left-right;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
<<<<<<< HEAD
          case 21: // expression ::= expression TIMES expression PCOMA 
=======
          case 13: // expression ::= expression TIMES expression PCOMA 
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
            {
              Double RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double left = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int rightleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int rightright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double right = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = left*right;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
<<<<<<< HEAD
          case 22: // expression ::= expression DIV expression PCOMA 
=======
          case 14: // expression ::= expression DIV expression PCOMA 
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
            {
              Double RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Double left = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int rightleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int rightright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double right = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = left/right;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
<<<<<<< HEAD
          case 23: // expression ::= PARLEFT expression PARRIGHT PCOMA 
=======
          case 15: // expression ::= PARLEFT expression PARRIGHT PCOMA 
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
            {
              Double RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double exp = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		RESULT = exp;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
<<<<<<< HEAD
          case 24: // expression ::= NUMBER 
=======
          case 16: // expression ::= NUMBER 
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
            {
              Double RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String num = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Double(num);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
<<<<<<< HEAD
          case 25: // expression ::= DECIMAL 
=======
          case 17: // expression ::= DECIMAL 
>>>>>>> 37013f46d21408155a8d919f8307f05ce372d871
            {
              Double RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String num = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Double(num);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expression ::= error 
            {
              Double RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
