/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import static arraylist.NumberEx.input;
import static arraylist.NumberEx.numbers;
import static arraylist.NumberEx.output;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ArrayListEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choose;
        do {

            System.out.println("=========================================");
            System.out.println("1. Nhap vao mang.");
            System.out.println("2. Hien thi mang.");
            System.out.println("3. Tim phan tu lon thu 2 trong mang.");
            System.out.println("4. Xoa phan tu le.");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    input(numbers);
                    break;
                case 2:
                    output(numbers);
                    break;
                case 3:
                    NumberEx.finMax2(numbers);
                    break;
                case 4:
                    NumberEx.deleteOdd(numbers);
                    break;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;

            }
        } while (choose >= 1 && choose <= 4);

    }

}
