import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        Student[] group = new Student[5];
        BufferedReader buffer = new BufferedReader(new InputStreamRead-er(System.in));
        for (int i = 0; i < group.length; i++) {
            try {
                String tmp_name = buffer.readLine();
                group[i] = new Student(i, tmp_name);

            } catch (IOException exc) {
                System.out.println("Input error, try better next time.");
            }
        }
        //Изменение ID студентов
        group[2].id = 22;
        group[4].id = 1;
        group[0].id = 3;
        //Сравнение студентов
        for (int i = 0; i < group.length; i++) {
            for (int j = 1; j < group.length - i; j++) {
                if (Student.compare(group[j-1], group[j]) <0){               
                    Student tmp_st = new Student();
                    tmp_st = group[j-1];
                    group[j-1] = group[j];
                    group[j] = tmp_st;
                }
            }
        }
        //Вывод результатов
        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i].name+"”+group[i].id);
        }

    }
}
