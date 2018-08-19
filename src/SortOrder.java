import java.util.Comparator;

public enum SortOrder {

    OPTION1(" - Sortowanie rosnące po imieniu użytkownika.", new FirstNameComparatorAsc()),
    OPTION2(" - Sortowanie malejące po imieniu użytkownika.",new FirstNameComparatorDesc()),
    OPTION3(" - Sortowanie rosnące po nazwisku użytkownika.",new LastNameComparatorAsc()),
    OPTION4(" - Sortowanie malejące po nazwisku użytkownika.",new LastNameComparatorDesc());
public final Comparator<User> comparator;
public final String description;

    SortOrder(String description, Comparator<User> comparator) {
        this.comparator = comparator;
        this.description = description;
    }

    public Comparator<User> getComparator() {
        return comparator;
    }

    public String getDescription() {
        return description;
    }
}
