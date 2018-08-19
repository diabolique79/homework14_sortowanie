import java.util.*;

public class UserTest {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("Jan", "Kowalski"));
        userList.add(new User("Kazimierz", "Antosz"));
        userList.add(new User("Alicja", "Monar"));
        userList.add(new User("Katarzyna", "Wójciak"));
        userList.add(new User("Zygmunt", "Kot"));
        userList.add(new User("Antoni", "Macierewicz"));


        System.out.println("W jaki sposób posortować rekordy?");

        for (SortOrder sortOrder : SortOrder.values()) {
            System.out.println(sortOrder + " " + sortOrder.description);
        }
        boolean isTrue = false;
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        while (!isTrue) {
            try {
                SortOrder sortOrder = SortOrder.valueOf(userInput.toUpperCase());
                Comparator<User> comparator = sortOrder.getComparator();

                Collections.sort(userList, comparator);
                System.out.println("Wybrane sortowanie to: " + sortOrder + sortOrder.description);

                for (User user : userList) {

                    System.out.println((user.getFirstName()) + " " + user.getLastName());

                }
                isTrue = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Wprowadziłeś błędną wartość. Proszę wpisać ponownie opcję do wyboru sortowania: ");
                userInput = scanner.nextLine();
                userInput = userInput.toUpperCase();
                isTrue = false;

            }
        }


    }
}
