package me.sam4215.literacygame;

import java.*;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String prompt = "Press ENTER to continue...";
    String newLine = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    out.println("C L I M B: A game");
    out.println("By Sam Bird, Kami Harker, Brandon Cox, and Emma ..lastname..");
    out.println(newLine + "YOU: I'll never amount to anything...");
    out.println(prompt);
    scanner.next();
    out.println(newLine + "A VOICE: Finally, someone who shares my views.");
    out.println(prompt);
    scanner.next();
    out.println(newLine + "YOU: Who's there?");
    out.println("A VOICE: Over here.\n" + prompt);
    scanner.next();
    out.println(newLine + "YOU: Well, hello there. What's your name?");
    out.println("A VOICE: Eeyore. I'm sad because I don't have a tail.");
    out.println("YOU: I'm Bill. Just because you don't have a tail doesn't mean you have to be sad." + prompt);
    scanner.next();
  }
}
