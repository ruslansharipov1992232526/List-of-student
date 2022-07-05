import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> infoStudent = new HashSet<Student>();

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите информацию о студенте: (ФИО, номер группы, номер студенческого билета)");
            System.out.println("Иванов Петр Николаевич, 1243-Б, 31231343 <enter>");

            String input = scanner.nextLine();
            String[] t = input.split(", ");
            String a = t[0];
            if (a.equals("end")) {
                System.out.println("Список студентов: ");
                for (Student info : infoStudent) {
                    System.out.println(" - " + info);
                }
                return;
            }
            String b = t[1];
            String c = t[2];

            infoStudent.add(new Student(a, b, c));
        }
    }
}
