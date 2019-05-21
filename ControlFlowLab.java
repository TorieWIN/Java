import java.util.Scanner;

public class ControlFlowLab {


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

            System.out.println(String.format("Hello %s, your age is %d", username, age));


            if (age >= 16)
                System.out.println("You are old enough to drive.");
            else System.out.println("You are not old enough to drive. You are a child.");

            if (age >= 18)
                System.out.println("You are old enough to vote.");
            else System.out.println("You are not old enough to vote.");

            if (age >= 21)
                System.out.println("You are old enough to drink.");
            else System.out.println("You are not old enough to drink.");

            if (age >= 35)
                System.out.println("You are old enough to be President.");
            else System.out.println("You are not old enough to be President.");

            if (age >= 55)
                System.out.println("You can join AARP.");
            else System.out.println("You can't join AARP.");

            if (age >= 67)
                System.out.println("You can start drawing Social Security.");
            else System.out.println("You can't start drawing Social Security.");


            System.out.print("What is your employment status? Choose E for employed, U for unemployed, or S for student.");
            char employment = scanner.next().toUpperCase().charAt(0);

            switch (employment) {

                case 'E':
                    System.out.println("You are employed.");
                    break;

                case 'U':
                    System.out.println("You are unemployed.");
                    break;

                case 'S':
                    System.out.println("You are a student.");
                    break;

                default:
                    System.out.println("Answer is invalid. Please go away.");

            } // end employment switch statement

            System.out.println("What type of vehicle do you drive? C-Car T-Truck V-Van O-Other N-None");
            char vehicle = scanner.next().toUpperCase().charAt(0);

            switch (vehicle) {

                case 'C':
                    System.out.println("You drive a car.");
                    break;

                case 'T':
                    System.out.println("You drive a truck.");
                    break;

                case 'V':
                    System.out.println("You drive a van.");
                    break;

                case 'O':
                    System.out.println("You drive another vehicle.");
                    break;

                case 'N':
                    System.out.println("You do not drive any vehicle.");
                    break;

                default:
                    System.out.println("Answer is invalid. Please go away.");

            } // end vehicle switch statement

//        declare an integer array with 30 elements
//
//        int[] myArray = new int[30];
//        with a for loop, initialize the array with the same number as the index. [0] = 0, [1] = 1, etc.
//                print out the contents of each element of the array using an enhanced for loop
//
//        with a for loop, reassign the elements of the array with the even numbers up to 60.
//
//        print out the contents of each element of the array using an enhanced for
//
//        print the contents of the array in reverse order.

            int[] myArray = new int[30];

            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i;
                System.out.println(myArray[i]);
            } // end for loop initialization

            // PRINT THE CONTENTS OF THE ARRAY USING AN ENHANCED FOR
            for (int item : myArray) {
                if (item % 2 == 0)
                    System.out.println(item);
            }

            // REASSIGN THE ELEMENTS OF THE ARRAY WITH THE EVEN NUMBERS UP TO 60
            for (int i = 0; i < 60; i++) {
                if (i % 2 == 0)
                    System.out.println(i);
            } // end for loop

            // PRINT OUT THE CONTENTS OF EACH ELEMENT OF THE (NEW) ARRAY USING AN ENHANCED FOR
            for (int item : myArray) {
                if (item % 2 == 0)
                    System.out.println(item);
            }

            // PRINT THE CONTENTS OF THE ARRAY IN REVERSE ORDER
            for (int i = myArray.length - 1; i >= 0; i--) {
//           System.out.println(myArray[i]);

                i = 0;


                while (i < myArray.length) {
                    System.out.println(myArray[i]);
                    i++;
                }

                i = myArray.length - 1;
                while (i >= 0) {
                    System.out.println(myArray[i]);
                    i--;
                }

            } //end for loop

//        Why is a do-while more appropriate than a while?

                System.out.print("Do you want to answer the questions again? Enter Y or N: ");
                answer = scanner.next().toUpperCase().charAt(0);
            } // end do

            while (answer == 'Y');
        System.out.println(stepFive(22));
    } // end main

    public static int stepFive(int b) {

        //----------------- Step 5 Part 1-------------------------
//        int[] myArray = new int[30];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i;
//            System.out.println("int i " + i + "= myArray[" + myArray[i] + "]");
//        }
//        for (int item : myArray) {
//            if(item == b) break;
//            if(item%2 !=0) {
//                continue;
//            }
//            else if (item%2==0) {
//                System.out.println(item);
//            }
//        }
        //-------------------------------------------------------
        //-----------------Step 5 Part 2-------------------------
//       Now change the method signature to return an int.
//       * change the method as follows:
//          - if the number is odd, print it.
//          - if the number is even, add it to a running total of even numbers.
//          - if the number is equal to the number passed in the method, return the running total sum from the method.

        int[] myArray = new int[30];
        int sum=0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.println("int i " + i + "= myArray[" + myArray[i] + "]");
        }
        for (int item : myArray) {
            if (item == b) {
                break;
            }
            if (item%2!=0) {
                System.out.println(item);
            }
            else if(item%2 ==0) {
//                System.out.println(sum += item);
                //System.out.println(String.format("The previous sum %d plus the current value %d equals %d", sum, item, sum+item));
                sum+=item;
            }
        } return sum;
        //-------------------------------------------------------
    } // end stepFive void

} // end class