package ie.atu;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> values = new ArrayList<Integer>();

        int index = 0;
        for(int number = 0; number < 10; number++) {
            values.add(100 + (100*index));
            System.out.println("In the index position " + index + " the value is " + values.get(number));
            index++;
        }

        System.out.println("Enter a new number: ");
        int input = scanner.nextInt();
        values.add(input);
        System.out.println("In the index position " + index + " the value is " + values.get(10));
    }
}
