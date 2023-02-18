package Seminar_03;

import java.util.ArrayList;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 15; i++){
            list.add(random.nextInt(100));
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.sort(null);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
