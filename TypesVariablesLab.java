public class TypesVariablesLab {
    public static void main(String[] args) {

        int firstInt = 6;
        int secondInt = 20;
        int thirdInt;
        float firstFloat = 4.4f;
        boolean isCold = false;
        double double2 = 2_0;
        System.out.println(firstInt);
        System.out.println(secondInt);
//        System.out.println(thirdInt);
        System.out.println(firstFloat);
        System.out.println(isCold);
        System.out.println(double2);

        int sum1 = firstInt + secondInt;
        System.out.println(sum1);

//        Create a new value by adding firstInt to thirdInt and print the result.
//        What problem do you have here? How do you fix it?
        // problem: firstInt has a value while thirdInt doesn't.

        int div1 = secondInt / firstInt;
        System.out.println(div1);

        int rem1 = secondInt % firstInt;
        System.out.println(rem1);

        int sumRem = firstInt + rem1;
        System.out.println(++sumRem);

        int x = 100;
        boolean xIsEqual = (x == 100);
        System.out.println(xIsEqual);
        // the single = is used to assign value; the double == is used to compare

        int y = 106;
        System.out.println(x > y);
        System.out.println(y > x);
        System.out.println(x >= y - 6);

        int z = 92;
        System.out.println(x < y && y < z);
        System.out.println(y < z && x >= y);
        System.out.println(z > y + x || x - y < z);
        System.out.println(!(y - x == x + y));

        int n = 64;
        System.out.println(n >> 1 == n / 2);
        System.out.println(n << 1 == n * 2);

        n -= 24;
        System.out.println(n >> 1 == n / 2);
        System.out.println(n << 1 == n * 2);
        System.out.println(n >> 2 == n / 4);
        System.out.println(n << 2 == n * 4);

        n++;

        System.out.println(n >> 1);
        System.out.println(n / 2);
        System.out.println(n << 1);
        System.out.println(n * 2);

        System.out.println(n >> 2);
        System.out.println(n / 4);
        System.out.println(n << 2);
        System.out.println(n * 4);

        playWithStrings();

     } // end main


    public static void anotherMethod() {

        // int secondFirst = 7;
        // secondFirst cannot be accessed from inside main()
//
//        if (secondFirst > 1000)
//            System.out.println("Big Value");
//
//        else if (secondFirst <= 1000)
//            System.out.println("Not a big value");
//
//        if (secondFirst > 1000)
//            System.out.println(secondFirst + " is a big value.");
//            int halfSecond = secondFirst/2;
//
//        else if (secondFirst <= 1000)
//            System.out.println(secondFirst + " is not a big value.");
//            System.out.println(secondFirst + " is definitely small");

        Integer secondFirst = 7;

        Integer thousand = Integer.valueOf("1000");

        if (thousand.compareTo(secondFirst)==0) {
            System.out.println(secondFirst + " is a big value.");
        } else {
            System.out.println(secondFirst + " is not a big value.");
        }

    } // end anotherMethod

    public static void playWithStrings() {
        String firstName = "Torie";
        String lastName = new String ("Dominguez");

        System.out.println("Hello " + firstName.concat(" " + lastName));

        System.out.println("Hello " + firstName + " " + lastName);

        String fullName = firstName.concat(" " + lastName);

        System.out.println("The total length of the string is " + fullName.length() + ".");
        System.out.println("The first instance of the letter o is " + fullName.indexOf('o') + ".");
        System.out.println("The letter "+ fullName.charAt(7) + " is at position 7.");

        if (fullName.contains("son")) {
            System.out.println("Name contains 'son'.");
        }
        else {
            System.out.println("Name does not contain 'son'.");
        }

        System.out.println("The last 5 characters of the string are " + fullName.substring(fullName.length()-5) + ".");

        if (fullName.contains("\'") && fullName.contains("-")) {
            System.out.println("The string contains both an apostrophe and a dash.");
        }

        else if (fullName.contains("\'")) {
            System.out.println("The string contains an apostrophe.");
        }
        else if (fullName.contains("-")) {
            System.out.println("The string contains a dash.");
        }
        else {
            System.out.println("The string contains neither an apostrophe nor a dash.");
        }




    } // end playWithStrings//

} // end class