package ie.atu;

import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] anArray;

        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        int index = 0;
        for(int value: anArray) {
            System.out.println("In the index position " + index + " the value is " + value);
            index++;
        }

        try {
            System.out.println("Enter a number: ");
            int input = scanner.nextInt();
            System.out.println(anArray[input]);
        }
        catch (IndexOutOfBoundsException aiob) {
            System.out.println("The number entered is out of bounds " + aiob);
        }
    }
}
