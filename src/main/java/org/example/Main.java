package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Prompt user to input secret number
        System.out.println("What is the secret number?");

        Scanner reader = new Scanner(System.in);
        int secretNumber = reader.nextInt();

        if (secretNumber == 10){
            System.out.println("Congratulations!");
        } else if (secretNumber <=7){
            System.out.println("Wrong! Too low");
        } else if (secretNumber >= 11){
            System.out.println("Wrong! Too high");
        } else {
            System.out.println("That's not a number");;
        }
    }
}