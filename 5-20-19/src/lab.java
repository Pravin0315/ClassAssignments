import java.sql.SQLOutput;

public class lab {
    public static void main(String args[])
    {
        //step 1
        float firstInt = 6;
        int secondInt = 20;
        int thirdInt = 3;
        float floatNum = 4.4f;
        boolean isCold = false;

//      System.out.println(firstInt);
//      System.out.println(secondInt);
//      System.out.println(thirdInt);
//      System.out.println(floatNum);
//      System.out.println(isCold);

        //step 2
        float firstNewValue = (firstInt + secondInt);
        float secondNewValue = (firstNewValue + thirdInt);
        float thirdNewValue = (secondInt / firstInt);
        float fourthNewValue = (secondInt % firstInt);
        float fifthNewValue = (firstInt + fourthNewValue);


        System.out.println(firstNewValue);
        System.out.println(secondNewValue);
        System.out.println(thirdNewValue);
        System.out.println(fourthNewValue);
        System.out.println(++(fifthNewValue));

        //step 3
        int x = 100;
        System.out.println(x == 100);
        int y = 106;
        System.out.println( x > y);
        System.out.println( x < y);
        System.out.println( x >= (y-6));
        int z = 92;
        System.out.println( (x < y) && (y < z) );
        System.out.println( (y < z) && (x >= y));
        System.out.println( (z > (y + x)) || ((x - y) < z) );
        System.out.println( (x < y) == !(x > y));

        //step 4
        int n = 25;
        System.out.println(n>>1 == (n/2));
        System.out.println(n<<1 == (n*2));
        System.out.println(n>>2);
        System.out.println(n<<2);


        anotherMethod();
        playWithStrings();

    }

        //step 5
    public static void anotherMethod()
    {
//        int p = 1200;
//        if (p > 1000) {
//            int t = p / 2;
//            System.out.println(p + " is a Big value");
//            System.out.println(t + " is half of a big variable");
//        } else {
//            System.out.println(p + " is not a Big value");
//            System.out.println("The half value is definitely small");
//
//        }
        //step 6
        Integer k = 4416;
        Integer h = Integer.valueOf("1000");
        System.out.println();
        if( h.compareTo(k) < 0) {
            System.out.println(k + " is a Big value");
        }
        else {
            System.out.println(k + " is not a Big value");
        }
    }

    static void playWithStrings() {
        String Pravin = "Pravin";
        String Prasad = new String("Prasad");
        System.out.println("Hello " + Pravin.concat(" "+Prasad));
        System.out.println("Hello " + Pravin + " " + Prasad);
        String fullName = Pravin.concat(" "+Prasad);
        System.out.println("The total length of the string Pravin Prasad is " + fullName.length());

        if (fullName.contains("o")) {
            System.out.println("The first occurrence of 'o' in the string Pravin Prasad is at position " + fullName.indexOf('o'));
        }
        else {
            System.out.println("The string Pravin Prasad does not have an 'o'");
            }


        System.out.println("The character at position 7 is "+ fullName.charAt(7));

        if (fullName.contains("son")) {
            System.out.println("The string Pravin Prasad contains 'son'.");
        }
        else {
            System.out.println("The string Pravin Prasad does not contain 'son'.");
        }
        System.out.println("The last 5 characters are " +fullName.substring(fullName.length()-5));

        if (fullName.contains("\'") && fullName.contains("-")) {
            System.out.println("The string Pravin Prasad contains an apostrophe and a dash.");
        }

        else if(fullName.contains("\'")) {
            System.out.println("The string Pravin Prasad contains an apostrophe");
        }

        else if(fullName.contains("-")) {
            System.out.println("The string Pravin Prasad contains a dash");
        }

        else {
            System.out.println("The string Pravin Prasad does not contain an apostrophe or a dash.");
        }
    }

}
