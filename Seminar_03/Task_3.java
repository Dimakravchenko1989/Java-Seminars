package Seminar_03;

import java.util.ArrayList;

// Задача 3. Создать список типа ArrayList. Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

public class Task_3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add("hello");
        list.add(2);
        list.add("hi");
        list.add("a");
        list.add(1);
        list.add(6);
        list.add(1);
        list.add("bye");
        list.add(1);
        list.add(1);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}

