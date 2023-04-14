import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> users1 = new ArrayList<>();
        ArrayList<String> users2 = new ArrayList<>();
        ArrayList<String> users3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввыдедите 5 разных имён ");
        for (int i = 0; i < 5; i++) {
            users1.add(scanner.next());
        }



        System.out.println("Ввыдедите 5 разных имён ");
        for (int i = 0; i < 5; i++) {
            users2.add(scanner.next());
            users3.add(users1.get(i));
            users3.add(users2.get(i));
        }


        Collections.sort(users1);
        System.out.println("Список А: " + users1);
        Collections.reverse(users2);
        System.out.println("Список Б: " + users2);


        System.out.println("Список С: " + users3);
        Collections.sort(users3, Comparator.comparing(String :: length));
        System.out.println("Сортировка по длине сртрок  " + users3);

    }
// Berserk Mak Sasha Tanya Trevor
// Benzema Franklin John Stark Toni
}
