import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(String name, String address, String number){
        buddies.add(new BuddyInfo(name, address, number));
    }

    public void removeBuddy(String name){
        buddies.remove(getIndex(name));
    }

    public int getIndex(String name) {
        for (BuddyInfo buddy : buddies) {
            if (buddy.getName() == name) {
                return buddies.indexOf(buddy);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer","123 Beatrice Drive", "613 123 4567");
        System.out.println("Address Book");

    }

}

