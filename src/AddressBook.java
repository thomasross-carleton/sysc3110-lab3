import java.util.ArrayList;

// Some text

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");

        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

    /**
     * Add a buddy to the buddies list
     *
     * @param buddy The buddy to add
     */
    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.buddies.add(buddy);
        }
    }

    /**
     * Remove a buddy from the buddies list
     *
     * @param index The index of the buddy to remove
     *
     * @return The removed buddy
     */
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < this.buddies.size()) {
            return this.buddies.remove(index);
        }

        return null;
    }

    /**
     * Get a buddy in the buddies list
     *
     * @param index The index of the buddy to get
     *
     * @return The buddy
     */
    public BuddyInfo getBuddy(int index) {
        if (index >= 0 && index < this.buddies.size()) {
            return this.buddies.get(index);
        }

        return null;
    }
}
