import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer","123 Beatrice Drive", "613 123 4567");
        System.out.println("Address Book");

        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);

        addressBook.removeBuddy(buddy1);

    }

}

