
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package AnalyzerJavascript;

import java_cup.runtime.*;
import Interfaz.Interfaz;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parserjs extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parserjs() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parserjs(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parserjs(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\054\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\002\003\000\002\003\007\000\002\004\004" +
    "\000\002\004\003\000\002\004\003\000\002\005\010\000" +
    "\002\005\011\000\002\006\005\000\002\006\003\000\002" +
    "\014\005\000\002\014\005\000\002\014\005\000\002\014" +
    "\003\000\002\012\006\000\002\012\006\000\002\012\005" +
    "\000\002\012\005\000\002\012\006\000\002\012\006\000" +
    "\002\013\003\000\002\013\003\000\002\013\003\000\002" +
    "\013\003\000\002\013\003\000\002\010\004\000\002\010" +
    "\004\000\002\010\003\000\002\010\003\000\002\007\007" +
    "\000\002\007\006\000\002\007\007\000\002\007\006\000" +
    "\002\007\007\000\002\007\006\000\002\007\003\000\002" +
    "\011\011\000\002\011\012\000\002\011\012\000\002\015" +
    "\006\000\002\016\013\000\002\016\012" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\141\000\006\003\006\010\007\001\002\000\004\002" +
    "\143\001\002\000\010\002\uffff\003\006\010\007\001\002" +
    "\000\004\002\ufffe\001\002\000\004\011\010\001\002\000" +
    "\004\004\011\001\002\000\006\003\014\011\013\001\002" +
    "\000\010\003\014\005\ufffb\011\013\001\002\000\004\006" +
    "\017\001\002\000\004\005\ufffa\001\002\000\004\005\016" +
    "\001\002\000\010\002\ufffd\003\ufffd\010\ufffd\001\002\000" +
    "\006\007\022\011\020\001\002\000\006\007\ufff6\014\ufff6" +
    "\001\002\000\006\007\134\014\133\001\002\000\004\004" +
    "\023\001\002\000\014\003\027\016\025\017\026\020\024" +
    "\024\032\001\002\000\004\011\127\001\002\000\004\011" +
    "\123\001\002\000\004\011\117\001\002\000\016\003\uffdc" +
    "\005\uffdc\016\uffdc\017\uffdc\020\uffdc\024\uffdc\001\002\000" +
    "\004\005\116\001\002\000\016\003\027\005\uffe3\016\025" +
    "\017\026\020\024\024\032\001\002\000\004\006\035\001" +
    "\002\000\016\003\027\005\uffe4\016\025\017\026\020\024" +
    "\024\032\001\002\000\004\005\uffe6\001\002\000\014\011" +
    "\036\012\042\013\044\022\043\023\037\001\002\000\040" +
    "\003\uffeb\005\uffeb\007\uffeb\015\uffeb\016\uffeb\017\uffeb\020" +
    "\uffeb\021\uffeb\024\uffeb\025\uffeb\026\uffeb\027\uffeb\030\uffeb" +
    "\031\uffeb\032\uffeb\001\002\000\040\003\uffe9\005\uffe9\007" +
    "\uffe9\015\uffe9\016\uffe9\017\uffe9\020\uffe9\021\uffe9\024\uffe9" +
    "\025\uffe9\026\uffe9\027\uffe9\030\uffe9\031\uffe9\032\uffe9\001" +
    "\002\000\012\021\077\025\100\026\101\027\102\001\002" +
    "\000\004\007\054\001\002\000\040\003\uffe7\005\uffe7\007" +
    "\uffe7\015\uffe7\016\uffe7\017\uffe7\020\uffe7\021\uffe7\024\uffe7" +
    "\025\uffe7\026\uffe7\027\uffe7\030\uffe7\031\uffe7\032\uffe7\001" +
    "\002\000\040\003\uffea\005\uffea\007\uffea\015\uffea\016\uffea" +
    "\017\uffea\020\uffea\021\uffea\024\uffea\025\uffea\026\uffea\027" +
    "\uffea\030\uffea\031\uffea\032\uffea\001\002\000\040\003\uffe8" +
    "\005\uffe8\007\uffe8\015\uffe8\016\uffe8\017\uffe8\020\uffe8\021" +
    "\uffe8\024\uffe8\025\uffe8\026\uffe8\027\uffe8\030\uffe8\031\uffe8" +
    "\032\uffe8\001\002\000\012\007\ufff2\030\047\031\050\032" +
    "\046\001\002\000\014\011\036\012\042\013\044\022\043" +
    "\023\037\001\002\000\014\011\036\012\042\013\044\022" +
    "\043\023\037\001\002\000\014\011\036\012\042\013\044" +
    "\022\043\023\037\001\002\000\004\007\ufff4\001\002\000" +
    "\004\007\ufff5\001\002\000\004\007\ufff3\001\002\000\004" +
    "\004\055\001\002\000\014\003\027\016\025\017\026\020" +
    "\024\024\032\001\002\000\004\005\057\001\002\000\020" +
    "\003\uffdb\005\uffdb\016\uffdb\017\uffdb\020\uffdb\024\uffdb\033" +
    "\061\001\002\000\016\003\uffd9\005\uffd9\016\uffd9\017\uffd9" +
    "\020\uffd9\024\uffd9\001\002\000\006\004\063\024\064\001" +
    "\002\000\016\003\uffda\005\uffda\016\uffda\017\uffda\020\uffda" +
    "\024\uffda\001\002\000\014\003\027\016\025\017\026\020" +
    "\024\024\032\001\002\000\004\006\065\001\002\000\014" +
    "\011\036\012\042\013\044\022\043\023\037\001\002\000" +
    "\004\007\067\001\002\000\004\004\070\001\002\000\014" +
    "\003\027\016\025\017\026\020\024\024\032\001\002\000" +
    "\004\005\072\001\002\000\020\003\uffd6\005\uffd6\016\uffd6" +
    "\017\uffd6\020\uffd6\024\uffd6\033\074\001\002\000\016\003" +
    "\uffd7\005\uffd7\016\uffd7\017\uffd7\020\uffd7\024\uffd7\001\002" +
    "\000\004\024\064\001\002\000\004\005\076\001\002\000" +
    "\016\003\uffd8\005\uffd8\016\uffd8\017\uffd8\020\uffd8\024\uffd8" +
    "\001\002\000\004\021\113\001\002\000\004\021\111\001" +
    "\002\000\016\011\036\012\042\013\044\021\107\022\043" +
    "\023\037\001\002\000\016\011\036\012\042\013\044\021" +
    "\104\022\043\023\037\001\002\000\012\007\uffee\030\uffee" +
    "\031\uffee\032\uffee\001\002\000\014\011\036\012\042\013" +
    "\044\022\043\023\037\001\002\000\012\007\uffec\030\uffec" +
    "\031\uffec\032\uffec\001\002\000\012\007\uffef\030\uffef\031" +
    "\uffef\032\uffef\001\002\000\014\011\036\012\042\013\044" +
    "\022\043\023\037\001\002\000\012\007\uffed\030\uffed\031" +
    "\uffed\032\uffed\001\002\000\014\011\036\012\042\013\044" +
    "\022\043\023\037\001\002\000\012\007\ufff0\030\ufff0\031" +
    "\ufff0\032\ufff0\001\002\000\014\011\036\012\042\013\044" +
    "\022\043\023\037\001\002\000\012\007\ufff1\030\ufff1\031" +
    "\ufff1\032\ufff1\001\002\000\004\005\uffe5\001\002\000\010" +
    "\003\ufff9\005\ufff9\011\ufff9\001\002\000\004\021\120\001" +
    "\002\000\014\011\036\012\042\013\044\022\043\023\037" +
    "\001\002\000\020\003\uffdf\005\uffdf\015\122\016\uffdf\017" +
    "\uffdf\020\uffdf\024\uffdf\001\002\000\016\003\uffe0\005\uffe0" +
    "\016\uffe0\017\uffe0\020\uffe0\024\uffe0\001\002\000\004\021" +
    "\124\001\002\000\014\011\036\012\042\013\044\022\043" +
    "\023\037\001\002\000\020\003\uffe1\005\uffe1\015\126\016" +
    "\uffe1\017\uffe1\020\uffe1\024\uffe1\001\002\000\016\003\uffe2" +
    "\005\uffe2\016\uffe2\017\uffe2\020\uffe2\024\uffe2\001\002\000" +
    "\004\021\130\001\002\000\014\011\036\012\042\013\044" +
    "\022\043\023\037\001\002\000\020\003\uffdd\005\uffdd\015" +
    "\132\016\uffdd\017\uffdd\020\uffdd\024\uffdd\001\002\000\016" +
    "\003\uffde\005\uffde\016\uffde\017\uffde\020\uffde\024\uffde\001" +
    "\002\000\004\011\140\001\002\000\004\004\135\001\002" +
    "\000\014\003\027\016\025\017\026\020\024\024\032\001" +
    "\002\000\004\005\137\001\002\000\010\003\ufff8\005\ufff8" +
    "\011\ufff8\001\002\000\006\007\ufff7\014\ufff7\001\002\000" +
    "\004\005\ufffc\001\002\000\004\002\000\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\141\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\006\002\141\003\004\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\004\014\005" +
    "\011\001\001\000\006\004\140\005\011\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\006\020\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\007\032\010\027\011" +
    "\030\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\007" +
    "\032\010\114\011\030\001\001\000\002\001\001\000\010" +
    "\007\032\010\033\011\030\001\001\000\002\001\001\000" +
    "\010\012\044\013\037\014\040\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\012\044\013\037\014\052\001\001\000" +
    "\010\012\044\013\037\014\051\001\001\000\010\012\044" +
    "\013\037\014\050\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\007\032" +
    "\010\055\011\030\001\001\000\002\001\001\000\006\015" +
    "\061\016\057\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\007\032\010\074\011\030\001" +
    "\001\000\002\001\001\000\010\012\044\013\037\014\065" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\007" +
    "\032\010\070\011\030\001\001\000\002\001\001\000\004" +
    "\016\072\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\013\105\001\001\000\004\013\102\001" +
    "\001\000\002\001\001\000\004\013\104\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\107\001\001\000" +
    "\002\001\001\000\004\013\111\001\001\000\002\001\001" +
    "\000\004\013\113\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\013\120" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\013\124\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\130\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\007\032\010\135\011\030\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parserjs$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parserjs$actions(this);
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
    return action_obj.CUP$Parserjs$do_action(act_num, parser, stack, top);
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
        
        Interfaz.Consolelog("Error Sintacticojs Recuperado");
        Interfaz.Consolelog("\t\tLexema: "+s.value); 
        Interfaz.Consolelog("\t\tFila: "+fila); 
        Interfaz.Consolelog("\t\tColumna: "+columna); 
        Interfaz.Consolelog("Unexpected token: " +s.value); 

    }

	/*Method that is called when parser can't be recovered*/
	public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
     
        int fila = s.right;
        int columna = s.left;
        
        Interfaz.Consolelog("Error Sintacticojs, Modo Panico");
        Interfaz.Consolelog("\t\tLexema: "+s.value); 
        Interfaz.Consolelog("\t\tFila: "+fila); 
        Interfaz.Consolelog("\t\tColumna: "+columna);
    } 


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parserjs$actions {


 

  private final Parserjs parser;

  /** Constructor */
  CUP$Parserjs$actions(Parserjs parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parserjs$do_action_part00000000(
    int                        CUP$Parserjs$act_num,
    java_cup.runtime.lr_parser CUP$Parserjs$parser,
    java.util.Stack            CUP$Parserjs$stack,
    int                        CUP$Parserjs$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parserjs$result;

      /* select the action based on the action number */
      switch (CUP$Parserjs$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-1)).value;
		RESULT = start_val;
              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-1)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parserjs$parser.done_parsing();
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= generalinstruction ini 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-1)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ini ::= generalinstruction 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ini ::= error 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // generalinstruction ::= CLASS CARACTERESVARIABLES LLALEFT instructionrecursive LLARIGHT 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)).value;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("generalinstruction",1, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-4)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instructionrecursive ::= instruction instructionrecursive 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("instructionrecursive",2, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-1)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instructionrecursive ::= instruction 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("instructionrecursive",2, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instructionrecursive ::= error 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("instructionrecursive",2, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instruction ::= CARACTERESVARIABLES PARLEFT PARRIGHT LLALEFT variablesrecursivas LLARIGHT 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-5)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-5)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-5)).value;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("instruction",3, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-5)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instruction ::= CARACTERESVARIABLES PARLEFT recibirparametros PARRIGHT LLALEFT variablesrecursivas LLARIGHT 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-6)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-6)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-6)).value;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("instruction",3, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-6)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // recibirparametros ::= recibirparametros COMA CARACTERESVARIABLES 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("recibirparametros",4, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-2)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // recibirparametros ::= CARACTERESVARIABLES 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("recibirparametros",4, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // relacionconosinoperador ::= recibirrelacion AND relacionconosinoperador 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("relacionconosinoperador",10, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-2)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // relacionconosinoperador ::= recibirrelacion OR relacionconosinoperador 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("relacionconosinoperador",10, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-2)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // relacionconosinoperador ::= recibirrelacion NOT relacionconosinoperador 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("relacionconosinoperador",10, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-2)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // relacionconosinoperador ::= recibirrelacion 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("relacionconosinoperador",10, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // recibirrelacion ::= typevariable IGUAL IGUAL typevariable 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("recibirrelacion",8, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // recibirrelacion ::= typevariable ADMIR IGUAL typevariable 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("recibirrelacion",8, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // recibirrelacion ::= typevariable MENOR typevariable 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("recibirrelacion",8, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-2)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // recibirrelacion ::= typevariable MAYOR typevariable 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("recibirrelacion",8, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-2)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // recibirrelacion ::= typevariable MENOR IGUAL typevariable 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("recibirrelacion",8, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // recibirrelacion ::= typevariable MAYOR IGUAL typevariable 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("recibirrelacion",8, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // typevariable ::= CARACTERESVARIABLES 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("typevariable",9, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // typevariable ::= CADCOM 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("typevariable",9, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // typevariable ::= CADCOMSIM 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("typevariable",9, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // typevariable ::= DECIMAL 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("typevariable",9, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // typevariable ::= NUMBER 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("typevariable",9, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // variablesrecursivas ::= variables variablesrecursivas 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variablesrecursivas",6, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-1)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // variablesrecursivas ::= sentenciaif variablesrecursivas 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variablesrecursivas",6, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-1)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // variablesrecursivas ::= variables 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variablesrecursivas",6, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // variablesrecursivas ::= sentenciaif 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variablesrecursivas",6, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // variables ::= VAR CARACTERESVARIABLES IGUAL typevariable PCOMA 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variables",5, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-4)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // variables ::= VAR CARACTERESVARIABLES IGUAL typevariable 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variables",5, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // variables ::= LET CARACTERESVARIABLES IGUAL typevariable PCOMA 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variables",5, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-4)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // variables ::= LET CARACTERESVARIABLES IGUAL typevariable 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variables",5, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // variables ::= CONST CARACTERESVARIABLES IGUAL typevariable PCOMA 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variables",5, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-4)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // variables ::= CONST CARACTERESVARIABLES IGUAL typevariable 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variables",5, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // variables ::= error 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("variables",5, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // sentenciaif ::= IF PARLEFT relacionconosinoperador PARRIGHT LLALEFT variablesrecursivas LLARIGHT 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("sentenciaif",7, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-6)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // sentenciaif ::= IF PARLEFT relacionconosinoperador PARRIGHT LLALEFT variablesrecursivas LLARIGHT sentenciaelse 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("sentenciaif",7, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-7)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // sentenciaif ::= IF PARLEFT relacionconosinoperador PARRIGHT LLALEFT variablesrecursivas LLARIGHT sentenciaelseif 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("sentenciaif",7, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-7)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // sentenciaelse ::= ELSE LLALEFT variablesrecursivas LLARIGHT 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("sentenciaelse",11, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-3)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // sentenciaelseif ::= ELSE IF PARLEFT relacionconosinoperador PARRIGHT LLALEFT variablesrecursivas LLARIGHT sentenciaelseif 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("sentenciaelseif",12, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-8)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // sentenciaelseif ::= ELSE IF PARLEFT relacionconosinoperador PARRIGHT LLALEFT variablesrecursivas LLARIGHT 
            {
              Object RESULT =null;

              CUP$Parserjs$result = parser.getSymbolFactory().newSymbol("sentenciaelseif",12, ((java_cup.runtime.Symbol)CUP$Parserjs$stack.elementAt(CUP$Parserjs$top-7)), ((java_cup.runtime.Symbol)CUP$Parserjs$stack.peek()), RESULT);
            }
          return CUP$Parserjs$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parserjs$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parserjs$do_action(
    int                        CUP$Parserjs$act_num,
    java_cup.runtime.lr_parser CUP$Parserjs$parser,
    java.util.Stack            CUP$Parserjs$stack,
    int                        CUP$Parserjs$top)
    throws java.lang.Exception
    {
              return CUP$Parserjs$do_action_part00000000(
                               CUP$Parserjs$act_num,
                               CUP$Parserjs$parser,
                               CUP$Parserjs$stack,
                               CUP$Parserjs$top);
    }
}

}
