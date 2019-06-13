import animals.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tiger tiger = new Tiger("Tiger", "Animalia", "Chordata");
            System.out.println("Would you like to learn about tigers?");
            char answerT = scanner.nextLine().toLowerCase().charAt(0);

            if(answerT == 'y'){
                tiger.kingdomInfo();
                tiger.eating();
                tiger.sleeping();
                tiger.swimming();
            } //end if
            else {
                System.out.println("Why are you so lame?");
            }
            //end tiger

        Alligator alligator = new Alligator("Alligator", "Animalia", "Chordata");
            System.out.println("Would you like to know about alligators?");
            char answerA = scanner.nextLine().toLowerCase().charAt(0);

            if(answerA == 'y'){
                alligator.kingdomInfo();
                alligator.eating();
                alligator.sleeping();
                alligator.swimming();
            } //end if
            else {
                System.out.println("See ya later, Alligator!");
            } //end else
            //end alligator

        BaldEagle baldeagle = new BaldEagle("BaldEagle", "Animalia", "Chordata");
            System.out.println("Would you like to know about bald eagles?");
            char answerBE = scanner.nextLine().toLowerCase().charAt(0);

            if(answerBE == 'y'){
                baldeagle.kingdomInfo();
                baldeagle.eating();
                baldeagle.sleeping();
                baldeagle.swimming();
            } //end if
            else {
                System.out.println("The bald eagle flies away disappointed in you.");
            } //end else
            //end bald eagle

        Elephant elephant = new Elephant("Elephant", "Animalia", "Chordata");
            System.out.println("Would you like to learn about elephants?");
            char answerE = scanner.nextLine().toLowerCase().charAt(0);

            if(answerE == 'y'){
                elephant.kingdomInfo();
                elephant.eating();
                elephant.sleeping();
                elephant.swimming();
            } //end if
            else {
                System.out.println("The elephants will remember this!");
            } //end else
            //end elephant

        Horse horse = new Horse("Horse", "Animalia", "Mammalia");
            System.out.println("Would you like to learn about horses?");
            char answerH = scanner.nextLine().toLowerCase().charAt(0);

            if(answerH == 'y'){
                horse.kingdomInfo();
                horse.eating();
                horse.sleeping();
                horse.swimming();
            } //end if
            else {
                System.out.println("The horses gallop away.");
            } //end else
            //end horse

        Koala koala = new Koala("Koala", "Chordata", "Mammalia");
            System.out.println("Would you like to learn about koalas?");
            char answerK = scanner.nextLine().toLowerCase().charAt(0);

            if(answerK == 'y'){
                koala.kingdomInfo();
                koala.eating();
                koala.sleeping();
                koala.swimming();
            } //end if
            else {
                System.out.println("The koala is asleep anyway so it doesn't care.");
            } //end else
            //end koala
        Llama llama = new Llama("Llama", "Chordata", "Mammalia");
            System.out.println("Would you like to learn about llamas?");
            char answerL = scanner.nextLine().toLowerCase().charAt(0);

            if(answerL == 'y'){
              llama.kingdomInfo();
              llama.eating();
              llama.sleeping();
              llama.swimming();
            } //end if
            else {
                System.out.println("The llama just walks away to go eat more grass.");
            } //end else
            //end llama

        Rhinoceros rhinoceros = new Rhinoceros("Rhinoceros", "Chordata", "Mammalia");
        System.out.println("Would you like to learn about the rhinoceros?");
        char answerR = scanner.nextLine().toLowerCase().charAt(0);

        if(answerR == 'y'){
            rhinoceros.kingdomInfo();
            rhinoceros.eating();
            rhinoceros.sleeping();
            rhinoceros.swimming();
        } //end if
        else {
            System.out.println("The rhinoceros leaves to graze on the Serengeti.");
        } //end else
        //end rhinoceros

        SeaTurtle seaturtle = new SeaTurtle("SeaTurtle", "Animalia", "Chordata");
            System.out.println("Would you like to learn about sea turtles?");
            char answerST = scanner.nextLine().toLowerCase().charAt(0);

            if(answerST == 'y'){
                seaturtle.kingdomInfo();
                seaturtle.eating();
                seaturtle.sleeping();
                seaturtle.swimming();
            } //end if
            else {
                System.out.println("The sea turtles keep swimming down the EAC.");
            } //end else
            //end sea turtles
    } //end void main
} //end class main
