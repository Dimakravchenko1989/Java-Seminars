package Seminar_04;

import java.util.Scanner;
import java.util.Stack;

// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.

public class Task_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<String> stack = new Stack<>();

            while(true){
                String text = sc.nextLine();
                if(text.equals("print"))
                    output(stack);
                else
                    new_word(stack, text);
            }
        }
        
    }

    public static void new_word(Stack<String> stack, String word){
        stack.push(word);
    }

    public static void output(Stack<String> stack){
        while(!stack.empty())
            System.out.print(stack.pop() + " ");     
    }
}

