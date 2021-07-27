package com.gildedrose.categories;

import com.gildedrose.*;

public class Sulfuras implements ItemCategory {

    public String getName() {
        return "Sulfuras, Hand of Ragnaros";
    }

    public void UpdateQuality(Item item) {
        item.quality = 80;
    }

    public void UpdateSellIn(Item item) {
        // do nothing
    }
}
