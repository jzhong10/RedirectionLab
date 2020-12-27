import java.util.*;
public class MakeStars {
  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner(System.in);

      while (n.hasNextLine()) {
        String str1 = n.nextLine();
        Scanner s = new Scanner(str1);
        while (s.hasNext()) {
          String str = s.next();
          int index = 0;
          while (index<str.length()) {
            System.out.print("*");
            index++;
          }
          System.out.print(" ");
        }
        System.out.println();
      }
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
