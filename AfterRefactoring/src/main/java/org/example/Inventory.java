package org.example;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Searchable> items;

    public Inventory() {
        items = new LinkedList<>();
    }

    public void addItem(Searchable item) {
        items.add(item);
    }

    public List<Searchable> search(SearchCriteria criteria) {
        List<Searchable> matchingItems = new LinkedList<>();
        for (Searchable item : items) {
            if (item.matches(criteria)) {
                matchingItems.add(item);
            }
        }
        return matchingItems;
    }
}
