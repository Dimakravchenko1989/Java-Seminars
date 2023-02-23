package Seminar_04;
// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

import java.util.ArrayList;
import java.util.LinkedList;

import javax.sound.sampled.LineListener;

// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>();
        long time = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            arList.add(0, i);; // добавляем в начало
        }
        long time1 = System.currentTimeMillis();
        System.out.println(time1 - time);

        LinkedList<Integer> ll = new LinkedList<>();
        long time2 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            ll.add(0, i);
        }
        long time3 = System.currentTimeMillis();
        System.out.println(time3 - time2);
    }
}

