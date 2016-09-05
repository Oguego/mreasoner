/* Generated By:JavaCC: Do not edit this line. MCompilerConstants.java */
package edu.casetools.mreasoner.core.compiler.realtime;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface MCompilerConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int NEGATION = 11;
  /** RegularExpression Id. */
  int AND = 12;
  /** RegularExpression Id. */
  int LEFT_BRACKET = 13;
  /** RegularExpression Id. */
  int RIGHT_BRACKET = 14;
  /** RegularExpression Id. */
  int LEFT_SQR_BRACKET = 15;
  /** RegularExpression Id. */
  int RIGHT_SQR_BRACKET = 16;
  /** RegularExpression Id. */
  int LEFT_KEY_BRACKET = 17;
  /** RegularExpression Id. */
  int RIGHT_KEY_BRACKET = 18;
  /** RegularExpression Id. */
  int POINT = 19;
  /** RegularExpression Id. */
  int POINT_COMMA = 20;
  /** RegularExpression Id. */
  int TWO_POINT = 21;
  /** RegularExpression Id. */
  int COMMA = 22;
  /** RegularExpression Id. */
  int SLASH = 23;
  /** RegularExpression Id. */
  int HYPHEN = 24;
  /** RegularExpression Id. */
  int UNDERSCORE = 25;
  /** RegularExpression Id. */
  int DIGIT = 26;
  /** RegularExpression Id. */
  int ALPHABET = 27;
  /** RegularExpression Id. */
  int CAPSALPHABET = 28;
  /** RegularExpression Id. */
  int ARROW = 29;
  /** RegularExpression Id. */
  int SECONDS = 30;
  /** RegularExpression Id. */
  int STATE_DECLARATION_START = 31;
  /** RegularExpression Id. */
  int INDEPENDENT_STATE_START = 32;
  /** RegularExpression Id. */
  int CLOCK_AT_START = 33;
  /** RegularExpression Id. */
  int CLOCK_BETWEEN_START = 34;
  /** RegularExpression Id. */
  int CALENDAR_AT_START = 35;
  /** RegularExpression Id. */
  int CALENDAR_BETWEEN_START = 36;
  /** RegularExpression Id. */
  int WEEKDAY_AT_START = 37;
  /** RegularExpression Id. */
  int WEEKDAY_BETWEEN_START = 38;
  /** RegularExpression Id. */
  int EVENT_START = 39;
  /** RegularExpression Id. */
  int INGRESSION_START = 40;
  /** RegularExpression Id. */
  int STATE_INITIALIZATION_START = 41;
  /** RegularExpression Id. */
  int STR_START = 42;
  /** RegularExpression Id. */
  int NTR_START = 43;
  /** RegularExpression Id. */
  int STRONG = 44;
  /** RegularExpression Id. */
  int WEAK = 45;
  /** RegularExpression Id. */
  int MON = 46;
  /** RegularExpression Id. */
  int TUE = 47;
  /** RegularExpression Id. */
  int WED = 48;
  /** RegularExpression Id. */
  int THU = 49;
  /** RegularExpression Id. */
  int FRI = 50;
  /** RegularExpression Id. */
  int SAT = 51;
  /** RegularExpression Id. */
  int SUN = 52;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_COMMENT = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<token of kind 5>",
    "\"/*\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 9>",
    "<token of kind 10>",
    "\"\\u00ef\\u00bf\\u00bd\"",
    "\"^\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"{\"",
    "\"}\"",
    "\".\"",
    "\";\"",
    "\":\"",
    "\",\"",
    "\"/\"",
    "\"-\"",
    "<UNDERSCORE>",
    "<DIGIT>",
    "<ALPHABET>",
    "<CAPSALPHABET>",
    "\"->\"",
    "\"s.\"",
    "\"states(\"",
    "\"is(\"",
    "\"clockAt(\"",
    "\"clockBetween(\"",
    "\"calendarAt(\"",
    "\"calendarBetween(\"",
    "\"weekDayAt(\"",
    "\"weekDayBetween(\"",
    "\"occurs(\"",
    "\"ingr(\"",
    "\"holdsAt(\"",
    "\"ssr(\"",
    "\"sEr(\"",
    "\"[-]\"",
    "\"<->\"",
    "\"monday\"",
    "\"tuesday\"",
    "\"wednesday\"",
    "\"thursday\"",
    "\"friday\"",
    "\"saturday\"",
    "\"sunday\"",
  };

}
