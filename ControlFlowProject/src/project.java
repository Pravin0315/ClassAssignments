import java.util.Scanner;
import java.util.Random;

public class project {

    static ASCiiChars ascii = new ASCiiChars();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //print the valid characters for input
        ascii.printNumbers();
        ascii.printUpperCase();
        ascii.printLowerCase();

        System.out.println("What is your name? ");
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Would you like to continue to the interactive protion? ");
        String response = scanner.next();

        if(response.toUpperCase().equals("YES") || response.toUpperCase().equals("Y")) {
            boolean again;
            boolean done;
            do {
                System.out.println("What is the name of your favorite pet?");
                String pet = scanner.next();

                int petAge = 0;
                do{scanner.nextLine();
                    System.out.println("What is the age of your favorite pet?");
                try{int age = scanner.nextInt();done=true;}
                catch(Exception e){done=false;}}while(!done);

                int favNum = 0;
                do{scanner.nextLine();
                    System.out.println("What is your lucky number? ");
                    try{favNum = scanner.nextInt();done=true;}catch(Exception e){done=false;}}while(!done);

                System.out.println("Do you have a favorite Quarterback? ");
                String qbResponse = scanner.next();
                int qbNum = 0;
                if (qbResponse.toUpperCase().equals("YES") || qbResponse.toUpperCase().equals("Y")) {
                    System.out.println("What is their jersey number?");
                    qbNum = scanner.nextInt();
                }

                int carYear = 00;
                do{
                    System.out.println("What is the two-digit model year of your car? ");
                try{carYear = scanner.nextInt();done=true;}catch(Exception e){done=false;}}while(!done);

                System.out.println("What is the name of your favorite actor or actress?");
                String actor = scanner.next();

                int randomNum = 0;
                do{
                    scanner.nextLine();System.out.println("Enter a random number between 0 and 50: ");
                    try{randomNum = scanner.nextInt();done=true;}catch(Exception e){done=false;}}while(!done);

                int random1 = random.nextInt(65);
                int random2 = random.nextInt(65);
                int random3 = random.nextInt(65);
                int magicBall;
                if(qbNum != 0) {
                    magicBall = qbNum * random1;
                } else {
                    magicBall = favNum * random2;
                }
                while (magicBall > 75) {
                    magicBall -= 75;
                }

                int num1 = carYear + favNum;
                if(num1>65){num1 -=65;}
                int num2 = 42;
                if(num2>65){num2 -=65;}
                int num3 = actor.charAt(0);
                if(num3>65){num3 -=65;}
                int num4 = actor.charAt(actor.length()-1);
                if(num4>65){num4 -=65;}
                int num5 = qbNum + favNum + petAge;
                if(num5>65){num5 -=65;}

                System.out.println("Lottery Numbers: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " Magic Ball: " + magicBall);
                System.out.println("Would you like to generate another number?");
                String againResponse = scanner.next();
                if(againResponse.toUpperCase().equals("YES") || againResponse.toUpperCase().equals("Y")) {
                    again = true;}
                    else{
                        again = false;
                    }
                }while (again == true);

                    System.out.println("Have a great day!");


        }



    }

}

