import java.io.FileWriter;

public class Task_3 {
    public static void main(String[] args) {
        Integer n = 10;
        String text = "TEST";
        String file_name = "1.txt";
        try {
            FileWriter writer = new FileWriter(file_name,false);
            for (int i = 0; i < n; i++) {
                writer.write(text + "\n");
            }
            writer.close();
            System.out.println("Получилось!");
        } 
        catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }
    
    }
}
    

