public class BuddyInfo {

    private String name;

    private String address;

    private String number;

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public BuddyInfo() {
        this.name = "default constructor";
        this.address = "123 Default Drive";
        this.number = "123 456 7890";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer","123 Beatrice Drive", "613 123 4567");
        System.out.println("Hello " + buddy1.getName());

        System.out.println("Hello World");
    }



}
