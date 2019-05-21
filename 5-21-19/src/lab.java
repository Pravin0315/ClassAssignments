import java.util.Scanner;

public class lab {

    public static void main(String args[]) {
        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);
        char answer;
        do {

            // prompt and read a string
            System.out.print("Enter your name: ");
            String username = scanner.next();

            // prompt and read an int
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            //employment status
            System.out.println("Enter your employment status: e=employed, u=unemployed, s=student");
            String employment = scanner.next();

            //vehicle
            System.out.println("Do you have a c=car, t=truck, s=SUV, n=no vehicle");
            String vehicle = scanner.next();

            //output
            System.out.println(String.format("Hello %s, your age is %d", username, age));


            //step 1
            if (age >= 16) {
                System.out.println("You are old enough to drive");
            } else {
                System.out.println("You are not old enough to drive");
            }//end drive


            if (age >= 18) {
                System.out.println("You are old enough to vote");
            } else {
                System.out.println("You are not old enough to vote");
            }//end vote


            if (age >= 21) {
                System.out.println("You are old enough to drink");
            } else {
                System.out.println("You are not old enough to drink");
            }//end drink


            if (age >= 35) {
                System.out.println("You are old enough to be President");
            } else {
                System.out.println("You are not old enough to be President");
            }//end President


            if (age >= 55) {
                System.out.println("You can join AARP");
            } else {
                System.out.println("You are not old enough to join AARP");
            }//end AARP


            if (age >= 67) {
                System.out.println("You can start drawing Social Security");
            } else {
                System.out.println("You are not old enough to draw Social Security");
            }//end social security and step 1

            //step 2
            //employment switch
            switch (employment.toLowerCase()) {
                case "e":
                    System.out.println("You are employed");
                    break;

                case "u":
                    System.out.println("You are unemployed");
                    break;

                case "s":
                    System.out.println("You are a student");
                    break;

                default:
                    System.out.println("You are a lost soul and need to figure out your life");
                    break;
            }//end employment

            //vehicle switch
            switch (vehicle.toLowerCase()) {
                case "c":
                    System.out.println("You own a car");
                    break;

                case "t":
                    System.out.println("You own a truck");
                    break;

                case "s":
                    System.out.println("You own an SUV");
                    break;

                case "n":
                    System.out.println("Hope you have a phone to use Uber/Lyft");
                    break;
            }//end vehicle and step 2

            //step 3
            int[] myArray = new int[30];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i;
            }

            //enhanced for loop (forEach)
            for (int x : myArray) {
                System.out.println(x);
            }

            //reassign elements with even numbers
            int z = 2;
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = z;
                z += 2;
            }
            //enhanced for loop
            for (int y : myArray) {
                System.out.println(y);
            }
            //reverse order
            for (int y = myArray.length - 1; y >= 0; y--) {
                System.out.println(myArray[y]);
            }

            //step 4 - while loops
            int i = 0;
            while (i < myArray.length) {
                System.out.println(myArray[i]);
                i++;
            }

            i = myArray.length - 1;
            while (i >= 0) ;
            {
                System.out.println(myArray[i]);
                i--;
            }
            //end step 3

            //step 4
            System.out.print("Do you want to answer the questions again? Enter Y or N: ");
            answer = scanner.next().toUpperCase().charAt(0);
        }
        //do
        while (answer == 'Y');

        stepFive(22);
        System.out.println(stepFive(22));
        //end main method

        public static int stepFive ( int b){
            //Step 5
            int[] myArray = new int[30];
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i;
                System.out.println("int i " + i + "= myArray[" + myArray[i] + "]");
            }
            for (int item : myArray) {
                if (item == b) break;

                if (item % 2 != 0) {
                    continue;
                } else if (item % 2 == 0) {
                    System.out.println(item);
                }
            }


            int[] myArray = new int[30];
            int sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i;
                System.out.println("int i " + i + "= myArray[" + myArray[i] + "]");
            }
            for (int item : myArray) {
                if (item == b) {
                    //System.out.println("The total sum of even numbers is "+sum);
                    break;
                }
                if (item % 2 != 0) {
                    System.out.println(item);
                } else if (item % 2 == 0) {
                    //System.out.println(sum += item);
                    //System.out.println(String.format("The previous sum %d plus the current value %d equals %d", sum, item, sum+item));
                    sum += item;
                }
            }
            return sum;

        }
    }
}


