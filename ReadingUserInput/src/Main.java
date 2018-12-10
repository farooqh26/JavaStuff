import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter your birth year : ");

        boolean hasNextInt = myscanner.hasNextInt();

        if(hasNextInt) {
            int birthyear = myscanner.nextInt();
            int age = 2018 - birthyear;

            myscanner.nextLine();
            System.out.println("Enter your name : ");
            String name = myscanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println(name + ", your age is : " + age);
            } else {
                System.out.println("Invalid year of birth");
            }

        } else {
            System.out.println("Invalid data type entered for birth year");
        }
        myscanner.close();
    }
}
