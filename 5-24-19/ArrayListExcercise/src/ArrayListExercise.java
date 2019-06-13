import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favoriteAnimal;
        System.out.println("Enter your favorite animal");
        favoriteAnimal = scanner.next();
        //Animals
        ArrayList<String> animals = new ArrayList<>(); //Create an ArrayList object
        animals.add("dogs");
        animals.add("cats");
        animals.add("birds");
        animals.add("tigers");
//        System.out.println(animals);

//        for (String i : animals) { //takes value of animals for each index and place into String i
            if (animals.contains(favoriteAnimal))
                System.out.println("I love " + favoriteAnimal);
            else System.out.println(favoriteAnimal + ", I don't care for those.");
            ;

//        } //end for loop and part 1
        //begin part 2 hash.each exercise
        System.out.println("What's your name?");
        String nameA = scanner.next();
        System.out.println("What is your age?");
        String ageA = scanner.next();
        System.out.println("Where are you from?");
        String homeA = scanner.next();
        System.out.println("What is your favorite food?");
        String foodA = scanner.next();
        HashMap<String,String>person = new HashMap<>();

        person.put("Name",nameA);
        person.put("Age",ageA);
        person.put("Home",homeA);
        person.put("Food",foodA);

        System.out.println("This is " + nameA + ". They are " + ageA + " years old." + " They are from " + homeA + ". They're favorite food is " + foodA + ".");
        //end part2, hash each exercise

        //begin part 3
        ArrayList<Integer> partThree = new ArrayList<>(5);

        System.out.println("Please enter a number:");
        int first = scanner.nextInt();
//        Integer a = Integer.parseInt(first);
        partThree.add(first);

        System.out.println("Thank you, please enter another:");
        String second = scanner.next();
        Integer two = Integer.parseInt(second);
        partThree.add(two);

        System.out.println("Thank you, please enter another:");
        String third = scanner.next();
        Integer three = Integer.parseInt(third);
        partThree.add(three);

        System.out.println("Thank you, please enter another:");
        String fourth = scanner.next();
        Integer four = Integer.parseInt(fourth);
        partThree.add(four);

        System.out.println("Thank you, please enter another:");
        String fifth = scanner.next();
        Integer five = Integer.parseInt(fifth);
        partThree.add(five);

            int size = partThree.size();
            int sum =0;
            int product = 1;

    for( int i = 0; i < size ; i++){
        sum += partThree.get(i);
    }
    System.out.println(sum);

    for( int i: partThree){
        product *= i;
    }
    System.out.println(product);

    Collections.sort(partThree);
    Collections.reverse(partThree);
    System.out.println("The max number is: " + Collections.max(partThree));
    System.out.println("The min number is: " + Collections.min(partThree));
    System.out.println(partThree);

        //Car Dealership
        HashMap<String, String> cars = new HashMap<>();
        cars.put("civic", "honda");
        cars.put("accord", "honda");
        cars.put("passport", "honda");
        cars.put("corolla", "toyota");
        cars.put("4runner", "toyota");
        System.out.println("Welcome! What model of car are you looking for today?");
        String desiredmodel = scanner.next().toLowerCase();
        if (cars.get(desiredmodel) != null) {
            System.out.println("Oh you're looking for a " +
                    desiredmodel + "? The "+ desiredmodel +"s are " + "over this way.");
        } else {
            System.out.println("I'm sorry, we don't have what you're looking for.");
        }

    } // end main method

} // end ArrayList Exercise

