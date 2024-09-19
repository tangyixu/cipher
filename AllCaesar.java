package edu.grinnell.csc207.main;

import java.io.PrintWriter;
import edu.grinnell.csc207.util.CipherUtils;

public class AllCaesar {
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    int count = 0;
    for(String input : args)
    {
      count++;
    }

    if(args[0]==NULL||args[1]==NULL||count>2)
     pen.printf("Error:Incorrect number of parameters.");
    if (args[0].equals("encode")||args[0].equals("decode")){
     String str = "helloworld";
     for (char ch = 'a'; ch <= 'z'; ch++) {
       pen.printf("n = %c: %s\n", ch, CipherUtils.caesarEncrypt(str, ch));
      }
     }
    else
     pen.printf("Error: Invalid option: " + args[0]+"." + "Valid options are encode or decode.");
    pen.close();
  }
}
