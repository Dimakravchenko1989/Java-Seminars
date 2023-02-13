package Семинары.Seminar_02;

// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// результат - a4b3cd2


public class Task_2 {
    public static void main(String[] args) {
        String msg = "wwwwwmmmmaaaaaaaaaakkrrrrrssss";
        rle(msg);
    
    }
    public static void rle(String msg) {
        StringBuilder algor = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < msg.length(); i++) {
            if (msg.charAt(i) == msg.charAt(i - 1)) {
                counter++;

            } else {

                algor.append(msg.charAt(i-1)).append(counter);
                counter = 1;
            }
        }    
        algor.append(msg.charAt(msg.length()-1)).append(counter);
        
        System.out.println(algor.toString());      
    }
}


