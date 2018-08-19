import java.util.Comparator;

public class LastNameComparatorAsc implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {

        String userName1 = user1.getLastName().toUpperCase();
        String userName2 = user2.getLastName().toUpperCase();

        //ascending order
        return userName1.compareTo(userName2);

    }
}
