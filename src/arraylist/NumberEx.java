/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NumberEx {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<Integer> input(ArrayList<Integer> numbers) {
        System.out.println("So luong phan tu: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    public static void output(ArrayList<Integer> numbers) {
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }

    public static int finMax2(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        int max2 = numbers.get(numbers.size() - 2);
        System.out.println("MAX 2: " + max2);
        return max2;
    }

    public static void deleteOdd(ArrayList<Integer> numbers) {
        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if ((int) numbers.get(i) % 2 == 0) {
                numbers.set(index, numbers.get(i));
                index++;
            }
            
        }
        for (int i = 0; i < index; i++) {
            System.out.println(numbers.get(i));
            
        }


    }

}
