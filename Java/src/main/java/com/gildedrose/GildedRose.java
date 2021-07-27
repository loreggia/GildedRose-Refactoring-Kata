package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class GildedRose {

    private Map<String, ItemCategory> categories;
    private ItemCategory defaultCategory;
    private Item[] items;

    public GildedRose(
        Item[] items,
        ItemCategory defaultCategory,
        ItemCategory... categories
    ) {
        this.items = items;
        this.defaultCategory = defaultCategory;

        this.categories = new HashMap<String, ItemCategory>();
        for (int i = 0; i < categories.length; i++) {
            this.categories.put(categories[i].getName(), categories[i]);
        }
    }

    public Item[] getItems() {
        return this.items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemCategory category = this.categories.containsKey(item.name)
                ? this.categories.get(item.name)
                : this.defaultCategory;

            category.UpdateSellIn(item);
            category.UpdateQuality(item);
        }
    }
}
