import java.io.*;
import java.util.Scanner;

/*
Instruction: Using BufferedReader and Scanner, create a program
to ask the user to input three words from the user and
output those three words on the screen as a phrase.

di ko sure kaya dalawa para sigurado kasi "Using BufferedReader and Scanner"
*/

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("This is BufferedReader version");
        Buffer beff = new Buffer();
        beff.input();
        beff.display();

        //dalawang version kasi trip ko lang po kasi bidabida hahahaha
        System.out.println("\nThis is the Scanner version");
        Scan scam = new Scan();
        scam.input();
        scam.display();
    }
}

class Buffer {
    String fWord, sWord, tWord;

    public void input()throws IOException {
        BufferedReader scanf = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("Enter first word: ");
            fWord = scanf.readLine();
        System.out.print("Enter second word: ");
            sWord = scanf.readLine();
        System.out.print("Enter third word: ");
            tWord = scanf.readLine();

    }

    public void display() {
        System.out.println(fWord + " " + sWord + " " + tWord + ".");
    }
}

class Scan {
    String word1, word2, word3;

    public void input() {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter first word: ");
        word1 = scanf.nextLine();
        System.out.print("Enter second word: ");
        word2 = scanf.nextLine();
        System.out.print("Enter third word: ");
        word3 = scanf.nextLine();
    }

    public void display() {
        System.out.println(word1 + " " + word2 + " " + word3 + ".");
    }
}