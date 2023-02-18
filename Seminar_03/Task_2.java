package Seminar_03;
import java.util.ArrayList;

// Задача 2. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<String> WordsArr = new ArrayList<>();
        WordsArr.add("Земля");
        WordsArr.add("Венера");
        WordsArr.add("Марс");
        WordsArr.add("Юпитер");
        WordsArr.add("Уран");
        WordsArr.add("Земля");
        WordsArr.add("Земля");
        WordsArr.add("Венера");
        WordsArr.add("Венера");
        WordsArr.add("Юпитер");
        WordsArr.add("Юпитер");
        WordsArr.add("Уран");
        WordsArr.add("Уран");
        WordsArr.add("Уран");
        WordsArr.add("Уран");

        int counter = 1;
        WordsArr.sort(null);

        for(int i = 1; i < WordsArr.size(); i++){
            if(WordsArr.get(i).equals(WordsArr.get(i-1))){
                counter++;
            } else {
                System.out.println(WordsArr.get(i-1) + ": " + counter);
                counter = 1;
            }
        }
    }
}
