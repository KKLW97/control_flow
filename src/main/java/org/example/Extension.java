package org.example;
import java.util.Scanner;
public class Extension {
    public static void main(String[] args) {
// USER IS PROMPTED TO ANSWER QUESTIONS ONE AFTER THE OTHER
        Scanner reader = new Scanner(System.in);
        System.out.println("What's the weather like?");

        String weather = reader.nextLine();

        System.out.println("What's the temperature in celsius?");

        int temp = reader.nextInt();

// USERS INPUT IS CASE INSENSITIVE
//        if (weather.equalsIgnoreCase("Sunny") && (temp >= 20)){
//            System.out.println("Wear sunglasses and shorts");
//        } else if (weather.equalsIgnoreCase("Sunny") && (temp <= 19)){
//            System.out.println("Wear sunglasses and a coat");
//        } else if (weather.equalsIgnoreCase("Cloudy") && (temp <= 19)){
//            System.out.println("Wear a coat");
//        } else if (weather.equalsIgnoreCase("Cloudy") && (temp >= 20)){
//            System.out.println("Wear a jumper");
//        } else if (weather.equalsIgnoreCase("Raining") && (temp >= 21)){
//            System.out.println("Bring an umbrella and wear shorts");
//        } else if (weather.equalsIgnoreCase("Raining") && (temp >= 13)){
//            System.out.println("Wear a raincoat");
//        } else if (weather.equalsIgnoreCase("Raining") && (temp <= 12)){
//            System.out.println("Wear a waterproof winter coat");
//        } else if (weather.equalsIgnoreCase("Snowing") && (temp >= 18)){
//            System.out.println("Impossible for snow at that temperature");
//        } else if (weather.equalsIgnoreCase("Snowing") && (temp >= 13)) {
//            System.out.println("Wear a waterproof warm coat");
//        } else if (weather.equalsIgnoreCase("Snowing") && (temp <= 12)) {
//            System.out.println("Wear a winter coat");
//        } else {
//            System.out.println("Stay at home");
//        }

//        USING UNLINKED IF STATEMENTS
        if(weather.equalsIgnoreCase("sunny") && temp >= 20){
            System.out.println("Wear sunglasses and shorts!");
        } else if (weather.equalsIgnoreCase("sunny") && temp <= 19) {
            System.out.println("Wear sunglasses and a cardigan");
        }
        if(weather.equalsIgnoreCase("cloudy") && temp <= 19){
            System.out.println("Wear a coat");
        }else if (weather.equalsIgnoreCase("cloudy") && temp >= 20){
            System.out.println("Wear a jumper");
        }
        if (weather.equalsIgnoreCase("raining") && temp >= 21){
            System.out.println("Bring an umbrella and wear shorts");
        }  else if (weather.equalsIgnoreCase("Raining") && (temp >= 13)){
            System.out.println("Wear a raincoat");
        } else if (weather.equalsIgnoreCase("Raining") && (temp <= 12)) {
            System.out.println("Wear a waterproof winter coat");
        }
        if (weather.equalsIgnoreCase("Snowing") && (temp >= 18)){
            System.out.println("Impossible for snow at that temperature");
        } else if (weather.equalsIgnoreCase("Snowing") && (temp >= 13)) {
            System.out.println("Wear a waterproof warm coat");
        } else if (weather.equalsIgnoreCase("Snowing") && (temp <= 12)) {
            System.out.println("Wear a winter coat");
        }
        else {
            System.out.println("Stay at home");
        }
    }
}
