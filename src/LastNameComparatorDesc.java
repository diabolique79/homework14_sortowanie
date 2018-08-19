import java.util.Comparator;

public class LastNameComparatorDesc implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {

        String userName1 = user1.getLastName().toUpperCase();
        String userName2 = user2.getLastName().toUpperCase();

        //ascending order
        return userName2.compareTo(userName1);

    }
}
