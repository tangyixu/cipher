package edu.grinnell.csc207.util;

public class CipherUtils {
  private static int letter2int(char letter) {
    int I = (int) letter - 97;
    return I; 
  }

  private static char int2letter(int i) {
    char letter = (char) (i + 97);
    return letter; 
  }

  public static String caesarEncrypt(String str, char letter) {
    char encrypt = int2letter((letter2int(letter) + letter2int(str.CharAt(0))) % 26);
    return encrypt; 
  }

  public static String caesarDecrypt(String str, char letter) {
    int a = (letter2int(letter)-letter2int(str.charAt(0))) % 26;
    String decrypt = (String) int2letter(a);
    return decrypt;
  }

  public static String vigenereEncrypt(String str, String key) {
    int E = (letter2int(key.charAt(0)) + letter2int(str.charAt(0))) % 26;
    String encrypt = (String) int2letter(E);
    return encrypt; 
  }

  public static String vigenereDecrypt(String str, String key) {
    int D = 0;
    if(letter2int(str.charAt(0)) > letter2int(key.charAt(0)))
      D = (letter2int(str.charAt(0)) - letter2int(key.charAt(0))) % 26;
    else
      D = (letter2int(str.charAt(0)) - letter2int(key.charAt(0))) % 26;
    
    String result = (String) int2letter(D);

    return result;
  }
}
