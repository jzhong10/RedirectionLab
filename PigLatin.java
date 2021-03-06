import java.util.*;

public class PigLatin {
  public static void main(String[] args) {
    //use the standard input (terminal input)
    //as the string that you read from
    //use hasNextLine()/nextLine() to loop over
    //all of the data

    //If you want to read the input word by word
    //this can be replaced with hasNext() and next()
  /*
    if (args.length>0) {
      System.out.println(pigLatinSimple(args[0]));
    }
*/
    //System.out.println(pigLatin(args[0]));
    //System.out.println(pigLatinBest(args[0]));
    Scanner n = new Scanner(System.in);
    String retstr = "";
    while (n.hasNextLine()) {
      String line = n.nextLine();
      Scanner currentline = new Scanner(line);
      retstr = "";

      while (currentline.hasNext()) {
        String pigLatined = pigLatinBest(currentline.next());
        retstr += pigLatined + " ";
      }
      retstr = retstr.substring(0, retstr.length()-1);
      retstr += "\n";
      System.out.print(retstr);
    }
    
    // /retstr = retstr.substring(0, retstr.length()-1);
    
    //System.out.println(retstr);
    
  }

  public static String pigLatinBest(String str) {
    str = str.toLowerCase();
    String letters = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "1234567890";
    //first character is not a letter
    if (!in(str.charAt(0), letters)) {
      return str;
    }
    String retstr = "";
    char endChar = str.charAt(str.length()-1);

    //if the endChar is a letter or number, do normal pigLatin
    if (in(endChar, letters) || in(endChar, numbers)) {
      retstr = pigLatin(str);
    } else {
      retstr = pigLatin(str.substring(0, str.length()-1)) + endChar;
    }
    return retstr.toLowerCase();
  }

  public static String pigLatin(String str) {
    str = str.toLowerCase();
    String[] digraphs = new String[] {"bl", "br", "ch", "ck", "cl", "cr",
    "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
    "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh",
     "wr"};
    String retstr = "";
    if (str.length()>= 2 && in(str.substring(0, 2), digraphs)) {
      retstr = str.substring(2, str.length()) + str.substring(0,2) + "ay";
    } else {
      retstr = pigLatinSimple(str);
    }
    return retstr.toLowerCase();
  }

  public static String pigLatinSimple(String str) {
    str = str.toLowerCase();
    String[] vowels = new String[] {"a", "e", "i", "o", "u"};
    String retstr = "";
    if (in(str.charAt(0), vowels)) {
      retstr = str + "hay";
    } else {
      retstr = str.substring(1, str.length()) + str.charAt(0) + "ay";
    }
    return retstr.toLowerCase();
  }

  public static boolean in(char ch, String[] arrstr) {
    for (int i = 0; i<arrstr.length; i++) {
      if (arrstr[i].charAt(0)==ch) {
        return true;
      }
    }
    return false;
  }

  public static boolean in(String str, String[] arrstr) {
    for (int i = 0; i<arrstr.length; i++) {
      if (arrstr[i].equals(str.substring(0,2))) {
        return true;
      }
    }
    return false;
  }

  public static boolean in(char ch, String str) {
    for (int i = 0; i<str.length(); i++) {
      if (str.charAt(i)==ch) {
        return true;
      }
    }
    return false;
  }
}
