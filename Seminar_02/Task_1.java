package Семинары.Seminar_02;

import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.


// Ввод: 6 a b
// Вывод: ababab

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите четное и целое число");
        int n = input.nextInt();
        System.out.println("Введите символ № 1");
        char c1 = input.next().charAt(0);
        System.out.println("Введите символ № 2");
        char c2 = input.next().charAt(0);
        input.close();
        symbol(n, c1, c2);
        

    }

    public static void symbol(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        System.out.println(sb);
    }
   

    }


