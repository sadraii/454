//package ravi;

import java.io.*;
import java.util.*;

public class Ravi implements Globals {
  public static void main(String[] args) throws IOException, EmptyStackException {
    PrintColor(L_BLUE, "hi");
    PrintColor(RED," this");
    PrintColor(YELLOW," is");
    PrintColor(PURPLE," a");
    PrintlnColor(BROWN," test");
    
    System.out.println(L_BLUE+"hi "+END
                       +GREEN+"this "+END
                       +RED+"test"+END);
    
    System.out.println(BlueColor("test ")+GreenColor("test"));
    
//    while () {
//      if (token == "IF") {
//        output += BlueColor(token);
//      }
//    }
    
    
    
//    String input = "";
//    InputStreamReader converter = new InputStreamReader(System.in);
//    BufferedReader in = new BufferedReader(converter);
//    
//    while (!(input.equals("exit"))){
//      System.out.print("\u001b[1;34m$ \u001b[0m");
//      input = in.readLine();
////      System.out.println("You typed: " + CurLine);
////      String[] tokens = curLine.split("[(]");
////      for (int i = 0; i < tokens.length; i++) {
////        System.out.println(tokens[i]);
////      }
//      CheckParenthesisBalance(input);
//    }
  }
  
  
  
  static void CheckParenthesisBalance(String input) {
    Stack stack = new Stack();
    for (int i = 0; i < input.length(); ++i) {
      char c = input.charAt(i);
      switch (c) {
        case '(':
          stack.push("(");
          break;
        case ')':
          if (stack.empty()) {
            System.out.println("unmatched parenthesis");
            return;
          }
          else {
            stack.pop();
            break;
          }
      }
    }
    if (!stack.empty()) {
      System.out.println("unmatched parenthesis");
      return;
    }
    System.out.println("matched");
  }
	
  
  
	static void PrintColor(String color, String content) {
    System.out.print(color+content+END);
  }
  
  
  
  static void PrintlnColor(String color, String content) {
    System.out.println(color+content+END);
  }
  
  
  
  static String BlueColor(String content) {
    return BLUE+content+END;
  }
  
  
  
  static String GreenColor(String content) {
    return GREEN+content+END;
  }
}
