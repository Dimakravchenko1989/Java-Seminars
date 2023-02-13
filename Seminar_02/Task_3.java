package Семинары.Seminar_02;
// import java.io.FileWriter;

import java.util.Scanner;

// public class Task_3 {
//     public static void main(String[] args) {
//         Integer n = 10;
//         String text = "TEST";
//         String file_name = "1.txt";
//         try {
//             FileWriter writer = new FileWriter(file_name,false);
//             for (int i = 0; i < n; i++) {
//                 writer.write(text + "\n");
//             }
//             writer.close();
//             System.out.println("Получилось!");
//         } 
//         catch (Exception e) {
//             System.out.println("Что-то пошло не так!");
//         }
    
//     }
// }
    


// Определение является ли строка палиндромом



public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите : ");
        String s = sc.nextLine();
        sc.close();
       
        // String s = "dadad";
        if (palindrom(s)){
            System.out.println("\nВведенная строка является палиндромом!\n");
        }
        else {System.out.println("\nВведенная строка НЕ является палиндромом!\n");}
    }

    public static boolean palindrom(String s){
        String temp = "";
        int l = s.length();
        for (int i = 0; i < l; i++){
            temp = temp + s.charAt(l-i-1);
        }
        if (temp.equals(s)){
            return true;
        }
        else {return false;}
    }
}
