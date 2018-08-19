import java.util.Comparator;

public class FirstNameComparatorAsc implements Comparator<User> {

    @Override
        public int compare(User user1, User user2) {

            String userName1 = user1.getFirstName().toUpperCase();
            String userName2 = user2.getFirstName().toUpperCase();

            //ascending order
            return userName1.compareTo(userName2);

        }

}
