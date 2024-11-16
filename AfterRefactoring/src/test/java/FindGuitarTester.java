import org.example.*;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        // Set up Rick's inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        SearchCriteria criteria = new SearchCriteria.Builder()
                .builder(Builder.FENDER)
                .model("Stratocastor")
                .type(Type.ELECTRIC)
                .backWood(Wood.ALDER)
                .topWood(Wood.ALDER)
                .build();

        List<Searchable> matches = inventory.search(criteria);
        if (!matches.isEmpty()) {
            for (Searchable item : matches) {
                System.out.println("We found: " + item);
            }
        } else {
            System.out.println("Sorry, no matching items found.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addItem(new Guitar("V95693", 1499.95, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
        // Add more items...
    }
}
