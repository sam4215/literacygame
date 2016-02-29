package me.sam4215.literacygame;

import java.lang.String;
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
    out.println("YOU: I'm Bill. Just because you don't have a tail doesn't mean you have to be sad.\n" + prompt);
    scanner.next();
    out.println(newLine + "EEYORE: Don't try and make me feel better; it never works.");
    out.println("YOU (to yourself): I guess, compared to a missing tail, dyslexia isn't that bad.\n" + prompt);
    scanner.next();
    out.println(newLine + "You walk off, feeling better. You accept that there's nothing you can do.");
    out.println("Suddenly, you feel a gust of wind.\n" + prompt);
    scanner.next();
    out.println(newLine + "A VOICE: There's nothing we can do");
    out.println("YOU: Who's there? And how did you know what I was thinking?\n" + prompt);
    scanner.next();
    out.println(newLine + "A VOICE: I'm Superman, and I can read minds.");
    out.println("YOU: Wow! You're Superman?");
    out.println("SUPERMAN: Yep. Why do people always NEED me? Would it be too much to ask for some peace and quiet?\n" + prompt);
    scanner.next();
    out.println(newLine + "YOU: But you're a superhero! Of course people nee you!\nSUPERMAN: That's what they all say.\nYOU: But...\n" + prompt);
    scanner.next();
    out.println(newLine + "YOU (to yourself): Wow. Even superheroes get down sometimes. I'm not going to let anything get me down, because I can be better than Superman!\n" + prompt);
    scanner.next();
    out.println(newLine + "YOU: Yeah. I'm going to get out and MAKE stuff!\nA VOICE: That's the spirit!\n" + prompt);
    scanner.next();
    out.println(newLine + "YOU: Who are you?\nA VOICE: I'm Kermit, and I thought I was too green. But green can be pretty, too! Now I like myself for the way I am, and you should too.\n" + prompt);
    scanner.next();
    out.println(newLine + "YOU: Yeah. I like myself for the way I am! Today's gonna be a good day!\n" + prompt);
    scanner.next();
    out.println(newLine + "Bill Gates overcame his dyslexia and went on to found Microsoft.\nHe is now the richest man on Earth.\nPress ENTER to finish the game.");
    scanner.next();
    System.exit(0);
  }
}
