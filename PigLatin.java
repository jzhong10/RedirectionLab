import java.util.*;
public class PigLatin {
  public static void main(String[] args) {
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner(System.in);
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()
      System.out.println(pigLatinSimple(args[0]));
  }

  public static String pigLatinSimple(String str) {
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
}
