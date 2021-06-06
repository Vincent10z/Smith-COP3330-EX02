/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */
import java.util.Scanner;
public class EX02 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("What is the input string?");
        String name = enter.nextLine();
        int num = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ')
                num++;

        }
        System.out.println("\n" + name + " has " + num + " Characters");
    }
}