package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;

        System.out.println("Задайте размерность двухмерного массива: ");
        index = sc.nextInt();
        int a[][] = new int[index][index];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = r.nextInt(50);
            }
        }
        System.out.println("Данный массив: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Нечетные элементы под главной диагональю: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i][j] % 2 != 0) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
